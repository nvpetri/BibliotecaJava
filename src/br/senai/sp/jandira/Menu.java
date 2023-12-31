package br.senai.sp.jandira;

import br.senai.sp.jandira.model.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {

    Scanner teclado = new Scanner(System.in);

    RegisterUser user = new RegisterUser();
    RegisterBook book = new RegisterBook();
    List<Loan> loans = new ArrayList<>(); 
    LoanManager loanManager = new LoanManager(loans);

    boolean continuar = true;

    public void startMenu() {
        while (continuar) {
            System.out.println("/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/");
            System.out.println("---------------- Bem Vindo ----------------");
            System.out.println("******* Escolha uma das opções: ***********");
            System.out.println("********************* [1] - Cadastrar Usuário");
            System.out.println("********************* [2] - Cadastrar Livro");
            System.out.println("********************* [3] - Usuários Cadastrados");
            System.out.println("********************* [4] - Livros Cadastrados");
            System.out.println("********************* [5] - Realizar Empréstimos");
            System.out.println("********************* [6] - Livros Emprestados");
            System.out.println("********************* [7] - Devolução de Livros");
            System.out.println("********************* [8] - Sair");
            System.out.println("-------------------------------------------");
            System.out.println("/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/");

            int userOption = teclado.nextInt();

            switch (userOption) {
                case 1:
                    user.addUser();
                    break;

                case 2:
                    book.addBook();
                    break;

                case 3:
                    PrintUsers.printUsers(user.users);
                    break;

                case 4:
                    PrintBooks.printBooks(book.books);
                    break;

                case 5:
                    teclado.nextLine();
                    System.out.print("Digite o nome do cliente: ");
                    String clientName = teclado.nextLine();

                    System.out.print("Digite o nome do livro: ");
                    String bookName = teclado.nextLine();

                    boolean loanSuccessful = Loan.makeLoan(clientName, bookName, user.users, book.books, loans);

                    if (!loanSuccessful) {
                        System.out.println("Empréstimo não realizado.");
                    }
                    break;

                case 6:
                    loanManager.printLoans();
                    break;

                case 7:
                    teclado.nextLine();
                    System.out.print("Digite o nome do cliente: ");
                    String clientName1 = teclado.nextLine();

                    System.out.print("Digite o nome do livro a ser devolvido: ");
                    String bookName1 = teclado.nextLine();

                    boolean returnSuccessful = Loan.returnLoan(clientName1, bookName1, loans);

                    if (!returnSuccessful) {
                        System.out.println("Devolução não realizada.");
                    } else {
                        System.out.println("Devolução realizada com sucesso.");
                    }
                    break;

                case 8:
                    System.out.println("Tchauuu!!");
                    continuar = false;
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
    }
}