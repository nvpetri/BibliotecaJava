package br.senai.sp.jandira.model;

import java.util.List;

public class Loan {
    private User user;
    private Book book;
    private boolean isReturned;

    public Loan(User user, Book book) {
        this.user = user;
        this.book = book;
        this.isReturned = false;
    }

    public User getUser() {
        return user;
    }

    public Book getBook() {
        return book;
    }

    public boolean isReturned() {
        return isReturned;
    }

    public void markAsReturned() {
        isReturned = true;
    }

    public static boolean returnLoan(String clientName, String bookName, List<Loan> loans) {
        for (Loan loan : loans) {
            User user = loan.getUser();
            Book book = loan.getBook();
            if (user.name.equalsIgnoreCase(clientName) && book.name.equalsIgnoreCase(bookName)) {
                if (!loan.isReturned()) {
                    loan.markAsReturned();
                    return true;
                } else {
                    System.out.println("Este livro já foi devolvido anteriormente.");
                    return false;
                }
            }
        }
        System.out.println("Empréstimo não encontrado.");
        return false;
    }

    public static boolean makeLoan(String clientName, String bookName, List<User> users, List<Book> books, List<Loan> loans) {
        User selectedUser = null;
        for (User user : users) {
            if (user.name.equalsIgnoreCase(clientName)) {
                selectedUser = user;
                break;
            }
        }

        if (selectedUser == null) {
            System.out.println("Cliente não encontrado.");
            return false;
        }

        Book selectedBook = null;
        for (Book book : books) {
            if (book.name.equalsIgnoreCase(bookName)) {
                selectedBook = book;
                break;
            }
        }

        if (selectedBook == null) {
            System.out.println("Livro não encontrado.");
            return false;
        }

        LoanManager loanManager = new LoanManager(loans);
        loanManager.lendBook(selectedUser, selectedBook);
        System.out.println("Empréstimo realizado com sucesso.");
        return true;
    }
}
