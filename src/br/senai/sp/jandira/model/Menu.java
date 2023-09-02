package br.senai.sp.jandira.model;

import java.util.Scanner;

public class Menu {
	
	Scanner teclado = new Scanner(System.in);
	
	RegisterUser user = new RegisterUser();
	RegisterBook book = new RegisterBook();
	
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
			System.out.println("********************* [5] - Livros Emprestados");
			System.out.println("********************* [6] - Sair");
			System.out.println("-------------------------------------------");
			System.out.println("/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/");
			
			int userOption = teclado.nextInt();
			
			switch (userOption) {
				case 1:
					user.UserRegister();
					break;
				case 2:
					book.Book();
					break;
				case 3:
					System.out.println("Feature in development");
					break;
				case 4:
					System.out.println("Feature in development");
					break;
				case 5:
					System.out.println("Feature in development");
					break;
				case 6:
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
