package br.senai.sp.jandira.model;

import java.util.List;

public class LoanManager {
	  public List<Loan> loans;

	    public LoanManager(List<Loan> loans) {
	        this.loans = loans;
	    }
	

    public void lendBook(User user, Book book) {
        Loan loan = new Loan(user, book);
        loans.add(loan);
    }

    public void returnBook(Loan loan) {
        loan.markAsReturned();
    }

    public void printLoans() {
        System.out.println("/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*");
        System.out.println("---------------- Empréstimos Ativos -------------------");
        System.out.println("/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*");
        System.out.println("Número de empréstimos ativos: " + loans.size());

        for (Loan loan : loans) {
            User user = loan.getUser();
            Book book = loan.getBook();
            System.out.println("Cliente: " + user.name);
            System.out.println("Livro: " + book.name);
            System.out.println("Status: " + (loan.isReturned() ? "Devolvido" : "Em andamento"));
            System.out.println("--------------------------------------------");
        }
    }
}