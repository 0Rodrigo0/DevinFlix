package main;

import java.util.Scanner;
import java.time.LocalDate;
import filmes.Filme;
import recomendados.Recomendado;
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

        public static void recomendar(Recomendado filme, Recomendado usuarioQueRecomenda, Recomendado texto,
                        Recomendado usuarioRecomnedado) {
                System.out.println("O filme " + filme.getFilme() + " foi recomendado por "
                                + usuarioQueRecomenda.getUsuarioQueRecomenda() + ":"
                                + texto.getTexto() + "" + usuarioRecomnedado.getUsuarioRecomnedado() + ".");
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

                Recomendado r1 = new Recomendado();
                r1.setFilme(f1.getNome());
                r1.setUsuarioQueRecomenda(u1.getNome());
                r1.setTexto(" este filme é otimo, olhe ele ");
                r1.setUsuarioRecomnedado(u2.getNome());

                System.out.println("Para assistir um filme digite 1");
                opcao = Integer.parseInt(inicio.nextLine());

                if (opcao == 1) {
                        escolheFilme(u1, f1);
                        System.out.println("Voce curtiu este filme?");
                        System.out.println("1 - SIM | 2 = NAO ");
                        opcao = Integer.parseInt(inicio.nextLine());
                        if (opcao == 1) {
                                curtirDescurtir(u1, f1, true);
                                System.out.println("");
                                System.out.println("Já que você curtiu, deseja recomendar?");
                                System.out.println("1 - SIM | 2 = NAO ");
                                opcao = Integer.parseInt(inicio.nextLine());
                                if (opcao == 1) {
                                        System.out.println("");
                                        recomendar(r1, r1, r1, r1);

                                }

                        } else {
                                curtirDescurtir(u1, f1, false);
                        }
                }
                inicio.close();

        }

}
