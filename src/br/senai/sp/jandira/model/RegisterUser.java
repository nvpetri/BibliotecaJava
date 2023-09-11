package br.senai.sp.jandira.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RegisterUser {

    Scanner teclado = new Scanner(System.in);
    public List<User> users = new ArrayList<>();

    public void addUser() {
        do {
            System.out.println("/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*");
            System.out.println("------------------Cadastro Usuário--------------------");
            System.out.println("/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*");

            User user = new User();

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

            users.add(user);

            System.out.println("------------------------------------------------------");
            System.out.println("Deseja cadastrar mais um cliente? (S/N): ");

        } while (teclado.nextLine().equalsIgnoreCase("S"));
    }
}
