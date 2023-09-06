package br.senai.sp.jandira.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RegisterBook {

    Scanner teclado = new Scanner(System.in);
    public List<Book> books = new ArrayList<>();

    public void addBook() {
        do {
            System.out.println("/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*");
            System.out.println("--------------------Cadastro Livro--------------------");
            System.out.println("/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*");

            Book book = new Book();

            System.out.print("Insira o nome do livro: ");
            book.name = teclado.nextLine();

            System.out.println("------------------------------------------------------");
            System.out.print("Quantas páginas tem o livro? ");
            book.pages = Integer.parseInt(teclado.nextLine());

            System.out.println("------------------------------------------------------");
            System.out.print("Qual o gênero do livro? ");
            book.genre = teclado.nextLine();

            System.out.println("------------------------------------------------------");
            System.out.print("Qual o autor do livro? ");
            book.author = teclado.nextLine();

            System.out.println("------------------------------------------------------");
            System.out.print("Qual o ISBN do livro? ");
            book.isbn = teclado.nextLine();

            books.add(book);

            System.out.println("------------------------------------------------------");
            System.out.println("Deseja cadastrar mais um livro? (S/N): ");
        } while (teclado.nextLine().equalsIgnoreCase("S"));
    }
}
