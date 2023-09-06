package br.senai.sp.jandira.model;

import java.util.List;

public class PrintBooks {
    public static void printBooks(List<Book> books) {
        System.out.println("/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*");
        System.out.println("--------------------Livros Cadastrados-------------------");
        System.out.println("/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*");

        for (Book book : books) {
            System.out.println("Nome: " + book.name);
            System.out.println("Páginas: " + book.pages);
            System.out.println("Gênero: " + book.genre);
            System.out.println("Autor: " + book.author);
            System.out.println("ISBN: " + book.isbn);
            System.out.println("--------------------------------------------");
        }
    }
}
