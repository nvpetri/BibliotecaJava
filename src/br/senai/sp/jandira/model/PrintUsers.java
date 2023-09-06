package br.senai.sp.jandira.model;

import java.util.List;

public class PrintUsers {
	public static void printUsers(List<User> users) {
		System.out.println("/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*");
        System.out.println("--------------------Usuários Cadastrados-------------------");
        System.out.println("/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*");

        for (User user : users) {
            System.out.println("Nome: " + user.name);
            System.out.println("Endereço: " + user.address);
            System.out.println("Telefone: " + user.telephone);
            System.out.println("Email: " + user.mail);
            System.out.println("--------------------------------------------");
        }
	}
}
