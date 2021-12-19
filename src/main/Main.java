package main;

//
import java.util.ArrayList;
// importa utilitario de listas
import java.util.List;
// Importa o Scanner
import java.util.Scanner;

import usuarios.Usuario;

public class Main {

    public static void main(String[] args) {
        menuInicial();
    }

    public static void menuInicial() {
        Usuario u1;
        Scanner inicio = new Scanner(System.in);
        int opcao = 0;
        List<Usuario> relacaoUsuario = new ArrayList<Usuario>();
        do {

            System.out.println("****** BEM VINDO AO DevinFlix ******** ");
            System.out.println("O que você deseja fazer?");
            System.out.println(" ");
            System.out.println("Digite 1 para cadastrar um usuário.");
            System.out.println("Digite 2 para ver lista de usuários.");
            System.out.println("Digite 3 para ver lista de filmes.");
            System.out.println("Digite 4 para curtir/descurtir um filme.");
            System.out.println("Digite 5 para cadastrar um filme.");
            System.out.println("Digite 6 para indicar um filme.");
            System.out.println("Digite 7 para sair.");
            System.out.println(" ");
            opcao = Integer.parseInt(inicio.nextLine());
            System.out.println("_________________________________________");

            if (opcao == 1) {
                System.out.println(" ");
                System.out.println("Vamos começar a criar seu cadastro.");
                u1 = new Usuario();
                do {
                    System.out.println("Por favor digite seu nome APENAS com Letras!");
                    System.out.println(" ");
                    System.out.print("Digite seu Nome completo: ");
                    u1.setNomeUsuario(inicio.nextLine());
                } while (u1.nomeUsuario.matches("[0-9]*") | u1.nomeUsuario.matches("[ ]*"));

                do {
                    System.out.println("_________________________________________");
                    System.out.println("Digite seu endereço com numero!");
                    System.out.println(" ");
                    System.out.print("Digite seu Endereço: ");
                    u1.setEnderecoUsuario(inicio.nextLine());
                } while (u1.enderecoUsuario.matches("[ ]*") | u1.enderecoUsuario.matches("[a-z]*")
                        | u1.enderecoUsuario.matches("[0-9]*")
                        | u1.enderecoUsuario.matches("[A-Z]*"));

                do {
                    System.out.println("_________________________________________");
                    System.out.print("Digite sua data de nascimento: ");
                    u1.setDataNacimentoUsuario(inicio.nextLine());
                } while (u1.dataNacimentoUsuario.matches("[ ]*") | u1.dataNacimentoUsuario.matches("[a-z]*")
                        | u1.dataNacimentoUsuario.matches("[A-Z]*")
                        | u1.dataNacimentoUsuario.matches("[0-9]*"));

                System.out.println(" ");
                relacaoUsuario.add(u1);
            }
            if (opcao == 2) {
                System.out.println("_________________________________________");
                // puxa a configuração setada no Usuários.java
                System.out.println(relacaoUsuario.toString());
                System.out.println("_________________________________________");
            }
        } while (opcao != 7);
        System.out.println("Obrigado!");
        inicio.close();
    }

}
