package main;

import java.util.Scanner;


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
        String sobrenome;

        //inicia scanner
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite enter para começar...");

        //aguarda o enter
        entrada.nextLine();
        do {
            System.out.println(" ");
            System.out.println("Por favor digite apenas Letras!");
            System.out.println(" ");  
		    System.out.print("Digite seu primeiro Nome: ");
			nome = entrada.next();
			System.out.print("Digite todo seu Sobrenome: ");
            sobrenome = entrada.next();
            
	    }while (nome.matches("[0-9]*") | sobrenome.matches("[0-9]*"));
        entrada.close();
            System.out.println(" ");
	    	System.out.println("Bem vindo: "+nome+" "+sobrenome);
    }

    
}


