package main;

import java.util.Date;
import java.util.Scanner;

import usuarios.Usuario;


public class Main {
    
    public static void main(String[] args) {

        System.out.println("_________________________________________");
        System.out.println(" ");
        System.out.println("****** BEM VINDO AO DevinFlix ******** ");
        System.out.println("_________________________________________");

        System.out.println(" ");
        System.out.println("Vamos começar criando seu cadastro.");
        System.out.println(" ");

        String nome;
        String endereco;
        String dataNascimento;

        //inicia scanner
        Scanner entrada = new Scanner(System.in);
        System.out.println("Pressione ENTER para começar...");

        //aguarda o enter
        entrada.nextLine();
        
        do {
            System.out.println(" ");
            System.out.println("Por favor digite seu nome APENAS com Letras!");
            System.out.println(" ");
		    System.out.print("Digite seu Nome completo: ");
            nome = entrada.nextLine();
        } while (nome.matches("[0-9]*") | nome.matches("[ ]*"));
        
        do {
            System.out.println("_________________________________________");
            System.out.println("Digite seu endereço com numero!");
            System.out.println(" ");
            System.out.print("Digite seu Endereço: ");
            endereco = entrada.nextLine();
        } while (endereco.matches("[ ]*") | endereco.matches("[a-z]*") | endereco.matches("[0-9]*") | endereco.matches("[A-Z]*"));
        
        do {
            System.out.println("_________________________________________");
            System.out.print("Digite sua data de nascimento: ");
            dataNascimento = entrada.nextLine();
        } while (dataNascimento.matches("[ ]*") | dataNascimento.matches("[a-z]*") | dataNascimento.matches("[A-Z]*") | dataNascimento.matches("[0-9]*"));
        
        entrada.close();
        System.out.println(" ");
        Usuario u1 = new Usuario(nome, endereco, dataNascimento);
        System.out.println("Seja muito bem vindo: " + u1.nomeUsuario + ".");
        System.out.println("O endereço cadastrado é: " + u1.enderecoUsuario + ".");
        System.out.println("Sua data de nascimento: " + u1.dataNacimentoUsuario + ".");
    }

    
}


