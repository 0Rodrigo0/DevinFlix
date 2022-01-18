package DevinFlix.main;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

import DevinFlix.filmes.Filme;
import DevinFlix.filmes.Genero;
import DevinFlix.recomendacoes.Recomendar;
import DevinFlix.usuarios.Usuario;

public class DevinFlix {

        public void curtirDescurtir(Usuario usuario, Filme filme, boolean curtir) {

                if (curtir == true) {
                        filme.setCurtiu(filme.getCurtiu() + 1);
                        System.out.println("Que bom  que gostou, o filme tem " + filme.getCurtiu() + " curtida(s).");
                } else {
                        filme.setDescurtiu(filme.getDescurtiu() + 1);
                        System.out.println("Que pena, o filme tem " + filme.getDescurtiu() + " descurtida(s).");
                }

        }

        public static void podeRecomendaFilme(Usuario usuario, Filme filme) {

                long diferencaEmDias = ChronoUnit.MONTHS.between(usuario.getDataIndicou(),
                                usuario.getDataProximaIndicacao());

                if (LocalDate.now().equals(usuario.getDataIndicou())) {
                        System.out.println(usuario.getNome() + " voce só pode indicar "
                                        + usuario.getDataProximaIndicacao());
                } else {
                        if (diferencaEmDias < 1) {
                                System.out.println(usuario.getNome() + " voce só pode indicar "
                                                + usuario.getDataProximaIndicacao());
                        } else {

                                usuario.setDataIndicou(LocalDate.now());
                                usuario.setDataProximaIndicacao(LocalDate.now().plusMonths(1));
                                System.out.println(usuario.getNome() + " indicação feita");
                        }
                }
        }

        public static void recomendarFilme(Usuario usuario, Filme filme, boolean recomenda) {

                if (recomenda == true) {
                        filme.setRecomendado(filme.getRecomendado() + 1);
                        usuario.setDataIndicou(LocalDate.now());
                        usuario.setDataProximaIndicacao(LocalDate.now().plusMonths(1));
                } else {
                        System.out.println(usuario.getNome() + ", você não pode recomendar. :( ");
                }
        }

        public static void devendoouNao(Usuario usuario) {

                if (usuario.isInadimplete() == true) {
                        System.out.println(
                                        usuario.getNome() + ", você esta inadimplente, por favor acesse o financeiro!");
                } else {
                        System.out.println(usuario.getNome() + ", pagamento em dia, curta a plataforma!!");
                }
        }

        public static void main(String[] args) {

                Scanner inicio = new Scanner(System.in);

                // lista usuarios
                Usuario lu[] = new Usuario[5];
                lu[0] = new Usuario("Joao", "Rua 123", LocalDate.of(1991, 1, 1), LocalDate.of(2021, 01, 15),
                                LocalDate.of(2021, 01, 15).plusMonths(1), true);
                lu[1] = new Usuario("Pedro", "Rua 456", LocalDate.of(1992, 2, 2), LocalDate.of(2021, 12, 18),
                                LocalDate.of(2021, 12, 18).plusMonths(1), false);
                lu[2] = new Usuario("Jorge", "Rua 789", LocalDate.of(1993, 3, 3), LocalDate.of(2022, 01, 16),
                                LocalDate.of(2022, 01, 16).plusMonths(1), true);
                lu[3] = new Usuario("Silva", "Rua 741", LocalDate.of(1994, 4, 4), LocalDate.of(1900, 1, 1),
                                LocalDate.of(1900, 1, 1).plusMonths(1), false);
                lu[4] = new Usuario("Lucas", "Rua 852", LocalDate.of(1995, 5, 5), LocalDate.of(1900, 2, 1),
                                LocalDate.of(1900, 2, 1).plusMonths(1), true);

                // lista filmes
                Filme lf[] = new Filme[5];
                lf[0] = new Filme("Batman", "Filme do homem morcego que salva a cidade.", Genero.ACAO, "batman.com",
                                LocalDate.of(1950, 10, 10));
                lf[1] = new Filme("Hulk", "Filme do homem verde que salva a cidade.", Genero.ROAMNCE, "hulk.com",
                                LocalDate.of(1960, 10, 10));
                lf[2] = new Filme("Pelé", "Filme do homem jogador que salva a cidade.", Genero.COMEDIA,
                                "pele.com", LocalDate.of(1970, 10, 10));
                lf[3] = new Filme("Xuxa", "Filme da mulher que salva a cidade.", Genero.FICCAO, "xuxa.com",
                                LocalDate.of(1980, 10, 10));
                lf[4] = new Filme("Lagoa Azul", "Filme do homem loiro que salva a ilha.", Genero.TERROR, "lagoa.com",
                                LocalDate.of(1990, 10, 10));

                // teste recomendação
                System.out.println("Teste de recomendação");
                System.out.println("");
                Recomendar r1 = new Recomendar(lu[0], lu[1], lf[3], "Ótimo filme, recomendo!");
                Recomendar r2 = new Recomendar(lu[4], lu[3], lf[3], "Ótimo filme, recomendo!");
                Recomendar r3 = new Recomendar(lu[2], lu[2], lf[2], "Ótimo filme, recomendo!");
                recomendarFilme(r1.getUsuario(), r1.getFilme(), true);
                recomendarFilme(r2.getUsuario(), r2.getFilme(), true);
                recomendarFilme(r3.getUsuario(), r2.getFilme(), false);
                System.out.println(r1);
                System.out.println(r2);
                System.out.println(r3);
                System.out.println("");

                // teste data se pode recomendar

                System.out.println("Teste data se pode recomendar");
                System.out.println("");
                podeRecomendaFilme(lu[0], lf[0]);
                podeRecomendaFilme(lu[1], lf[1]);
                podeRecomendaFilme(lu[2], lf[2]);
                podeRecomendaFilme(lu[3], lf[3]);
                podeRecomendaFilme(lu[4], lf[4]);
                System.out.println(lu[0].getDataProximaIndicacao().toString());
                System.out.println(lu[1].getDataProximaIndicacao().toString());
                System.out.println(lu[2].getDataProximaIndicacao().toString());
                System.out.println(lu[3].getDataProximaIndicacao().toString());
                System.out.println(lu[4].getDataProximaIndicacao().toString());
                System.out.println("");

                // inadimplente?
                System.out.println("Está inadimplente?");
                devendoouNao(lu[0]);
                devendoouNao(lu[1]);
                devendoouNao(lu[2]);
                devendoouNao(lu[3]);
                devendoouNao(lu[4]);
                System.out.println("");

                inicio.close();
        }

}
