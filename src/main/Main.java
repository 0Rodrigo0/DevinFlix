package main;

import java.util.Scanner;
import java.time.LocalDate;
import filmes.Filme;
import filmes.Genero;
import filmes.Sugerido;
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

        public static void sugerirFilme(Sugerido nome, Sugerido sinopse, Genero genero, Sugerido anoLancamento) {
                System.out.println("Você sugeriu o filme " + nome.getNome() + "\n" + "Sinopse: "
                                + sinopse.getSinopse() + "\n"
                                + " Genero:" + genero + "\n" + " Lançado em: " + anoLancamento.getAnoLancamento());
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
                r1.setTexto(" Este filme é otimo, olhe ele ");
                r1.setUsuarioRecomnedado(u2.getNome());

                Sugerido s1 = new Sugerido();
                s1.setNome("Shazam");
                s1.setSinopse("Filme do homem que tem poderes de raio.");
                s1.setAnoLancamento(LocalDate.of(1970, 2, 2));
                s1.setGenero(Genero.ACAO);

                do {
                        System.out.println("Para assistir um filme digite 1");
                        System.out.println("Para sugerir um Título digite 2");
                        System.out.println("Para sair 9");
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

                                }
                                if (opcao == 2) {
                                        curtirDescurtir(u1, f1, false);
                                }
                        }
                        if (opcao == 2) {
                                System.out.println(" ");
                                LocalDate localDate = LocalDate.now();
                                u1.setDataIndicouFilme(localDate);
                                System.out.println("Dia da sugestão: " + u1.getDataIndicouFilme());
                                System.out.println(" ");
                                sugerirFilme(s1, s1, Genero.ACAO, s1);

                                localDate = localDate.plusDays(30);
                                u1.setDataProximaIndicacao(localDate);
                                System.out.println(" ");
                                System.out.println("Voce só pode sugerir novamente " + u1.getDataProximaIndicacao());

                        }
                } while (opcao != 9);
                inicio.close();

        }

}
