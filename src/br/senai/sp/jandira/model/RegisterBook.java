package br.senai.sp.jandira.model;

import java.util.Scanner;

public class RegisterBook {

	Scanner teclado = new Scanner(System.in);
	Book book = new Book();
	
	public Book Book() {
		System.out.println("/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*");
		System.out.println("--------------------Cadastro Livro--------------------");
		System.out.println("/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*");
		System.out.print("Insira o nome do livro: ");
		book.name = teclado.nextLine();
		System.out.println("------------------------------------------------------");
		System.out.print("Quantas páginas tem o livro? ");
		book.pages = teclado.nextInt();
		System.out.println("------------------------------------------------------");
		System.out.print("Qual o gênero do livro? ");
		book.genre = teclado.nextLine();
		System.out.println("------------------------------------------------------");
		System.out.print("Qual o autor do livro? ");
		book.author = teclado.nextLine();
		System.out.print("Qual o ISBN do livro? ");
		book.isbn = teclado.nextLine();
		
		return book;
	}
}
