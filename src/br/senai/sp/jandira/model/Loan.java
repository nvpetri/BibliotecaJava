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

    public static boolean makeLoan(String clientName, String bookName, List<User> users, List<Book> books) {
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

        LoanManager loanManager = new LoanManager();
        loanManager.lendBook(selectedUser, selectedBook);
        System.out.println("Empréstimo realizado com sucesso.");
        return true;
    }
}