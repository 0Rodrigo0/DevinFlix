package main;

import java.util.Scanner;
import java.time.LocalDate;
import filmes.Filme;
import usuarios.Usuario;

public class Main {

        // aqui chama a funcionalidade do menu inicial.
        public static void main(String[] args) {
                devinFlix();
        }

        public static void escolheFilme(Usuario usuario, Filme filme) {
                System.out.println(" ");
                System.out.println(usuario.toString() + " esta assistindo " + filme.toString());
                System.out.println(" ");

        }

        public static void devinFlix() {

                Scanner inicio = new Scanner(System.in);
                int opcao = 0;
                Usuario u1 = new Usuario();
                u1.setNome("Joao");
                u1.setDataNascimento(LocalDate.of(1990, 1, 1));
                Usuario u2 = new Usuario();
                u2.setNome("Pedro");
                u2.setDataNascimento(LocalDate.of(1980, 1, 1));

                Filme f1 = new Filme();
                f1.setNome("Batman");
                Filme f2 = new Filme();
                f2.setNome("Jason");
                Filme f3 = new Filme();
                f3.setNome("Superman");
                Filme f4 = new Filme();
                f4.setNome("Homem de Ferro");

                System.out.println("Escolha opção:");
                opcao = Integer.parseInt(inicio.nextLine());

                if (opcao == 1) {
                        escolheFilme(u1, f1);
                }
                inicio.close();

        }

}
