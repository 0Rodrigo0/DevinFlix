package cadastraUsuario;

import java.util.Scanner;

public class CadastraUsuario {

	public static void main(String[] args) {
		
	    String nome;
	    String sobrenome;  
	    Scanner entrada = new Scanner(System.in);
	    do {
	    	System.out.println("Digite apenas Letras!");
	    	  
		    System.out.print("Digite seu primeiro Nome: ");
			nome = entrada.next();
			
			System.out.print("Digite todo seu Sobrenome: ");
		    sobrenome = entrada.next();
		    
	    }while (nome.matches("[0-9]*"));
        entrada.close();
            System.out.println(" ");
	    	System.out.println("Seu nome completo é: "+nome+" "+sobrenome);
    }
    
		
}

    

