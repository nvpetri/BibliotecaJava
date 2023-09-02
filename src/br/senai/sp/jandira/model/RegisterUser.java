package br.senai.sp.jandira.model;

import java.util.Scanner;

public class RegisterUser {

	Scanner teclado = new Scanner(System.in);
	User user = new User();
	
	public User UserRegister() {
		System.out.println("/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*");
		System.out.println("------------------Cadastro Usuário--------------------");
		System.out.println("/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*");
		System.out.print("Insira o nome do cliente: ");
		user.name = teclado.nextLine();
		System.out.println("------------------------------------------------------");
		System.out.print("Qual o endereço do cliente? ");
		user.address = teclado.nextLine();
		System.out.println("------------------------------------------------------");
		System.out.print("Qual o número de telefone do cliente? ");
		user.telephone = teclado.nextLine();
		System.out.println("------------------------------------------------------");
		System.out.print("Qual o email do cliente? ");
		user.mail = teclado.nextLine();
		
		return user;
	}
}
