package main;

import java.util.Scanner;
import java.time.LocalDate;
import filmes.Filme;
import filmes.Genero;
import usuarios.Usuario;

public class Main {

        public static void main(String[] args) {
                devinFlix();
        }

        public static void curtirDescurtir(Usuario usuario, Filme filme, boolean curtir) {

                if (curtir == true) {
                        filme.setCurtiu(filme.getCurtiu() + 1);
                        System.out.println("Que bom  que gostou, o filme tem " + filme.getCurtiu() + " curtida(s).");
                } else {
                        filme.setDescurtiu(filme.getDescurtiu() + 1);
                        System.out.println("Que pena, o filme tem " + filme.getDescurtiu() + " descurtida(s).");
                }

        }

        public static void escolheFilme(Usuario usuario, Filme filme) {
                System.out.println(" ");
                System.out.println(usuario.getNome() + " esta assistindo " + filme.getNome());
                System.out.println(" ");

        }

        public static void devinFlix() {

                Scanner inicio = new Scanner(System.in);
                int opcao = 0;
                String texto;
                boolean existe = false;

                Usuario lu[] = new Usuario[5];
                lu[0] = new Usuario("Joao", "Rua 123", LocalDate.of(1991, 1, 1));
                lu[1] = new Usuario("Pedro", "Rua 456", LocalDate.of(1992, 2, 2));
                lu[2] = new Usuario("Jorge", "Rua 789", LocalDate.of(1993, 3, 3));
                lu[3] = new Usuario("Silva", "Rua 741", LocalDate.of(1994, 4, 4));
                lu[4] = new Usuario("Lucas", "Rua 852", LocalDate.of(1995, 5, 5));

                Filme lf[] = new Filme[5];
                lf[0] = new Filme("Batman", "Filme do homem morcego que salva a cidade", Genero.ACAO, "batman.com",
                                LocalDate.of(1950, 10, 10));
                lf[1] = new Filme("Hulk", "Filme do homem verde que salva a cidade", Genero.ROAMNCE, "hulk.com",
                                LocalDate.of(1960, 10, 10));
                lf[2] = new Filme("Filme do Pelé", "Filme do homem jogador que salva a cidade", Genero.COMEDIA,
                                "pele.com", LocalDate.of(1970, 10, 10));
                lf[3] = new Filme("Xuxa", "Filme da mulher que salva a cidade", Genero.FICCAO, "xuxa.com",
                                LocalDate.of(1980, 10, 10));
                lf[4] = new Filme("Lagoa Azul", "Filme do homem loiro que salva a ilha", Genero.TERROR, "lagoa.com",
                                LocalDate.of(1990, 10, 10));

                System.out.println("****** DevinFlix ******");
                do {

                        System.out.println("Usuario:");
                        texto = inicio.nextLine();
                        System.out.println("");
                        for (int i = 0; i < lu.length; i++) {
                                if (lu[i].getNome().equals(texto)) {
                                        existe = true;
                                }
                        }
                } while (existe != true);

                do {
                        System.out.println("Ola " + texto + " escolha o filme digitando o nome, ou 9 sair.");
                        System.out.println("");
                        for (int i = 0; i < lu.length; i++)
                                System.out.println(lf[i]);
                        System.out.println("");
                        opcao = Integer.parseInt(inicio.nextLine());

                        if (opcao == 1) {
                                for (int i = 0; i < lu.length; i++)
                                        System.out.println(lu[i]);
                        }
                        if (opcao == 2) {

                        }
                } while (opcao != 9);
                inicio.close();

        }

}
