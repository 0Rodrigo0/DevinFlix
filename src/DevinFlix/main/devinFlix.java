package DevinFlix.main;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

import DevinFlix.filmes.Filme;
import DevinFlix.filmes.Genero;
import DevinFlix.usuarios.Usuario;

public class devinFlix {

    public void curtirDescurtir(Usuario usuario, Filme filme, boolean curtir) {

        if (curtir == true) {
            filme.setCurtiu(filme.getCurtiu() + 1);
            System.out.println("Que bom  que gostou, o filme tem " + filme.getCurtiu() + " curtida(s).");
        } else {
            filme.setDescurtiu(filme.getDescurtiu() + 1);
            System.out.println("Que pena, o filme tem " + filme.getDescurtiu() + " descurtida(s).");
        }

    }

    public static void podeRecomendaFilme(Usuario usuario, Filme filme, boolean recomenda) {

        long diferencaEmDias = ChronoUnit.DAYS.between(usuario.getDataIndicou(), LocalDate.now());
        if (diferencaEmDias > 30) {

            usuario.setDataIndicou(LocalDate.now());
            usuario.setDataProximaIndicacao(LocalDate.now().plusDays(30));
            System.out.println("Indicação feita");

        } else {
            System.out.println("Voce só pode indicar " + usuario.getDataProximaIndicacao());
        }

    }

    public static void main(String[] args) {

        Scanner inicio = new Scanner(System.in);

        Usuario lu[] = new Usuario[5];
        lu[0] = new Usuario("Joao", "Rua 123", LocalDate.of(1991, 1, 1), LocalDate.of(2021, 01, 15),
                LocalDate.of(2021, 01, 15).plusMonths(1));
        lu[1] = new Usuario("Pedro", "Rua 456", LocalDate.of(1992, 2, 2), LocalDate.of(2021, 12, 16),
                LocalDate.of(2021, 12, 16).plusMonths(1));
        lu[2] = new Usuario("Jorge", "Rua 789", LocalDate.of(1993, 3, 3), LocalDate.of(2022, 01, 16),
                LocalDate.of(2022, 01, 16).plusMonths(1));
        lu[3] = new Usuario("Silva", "Rua 741", LocalDate.of(1994, 4, 4), LocalDate.of(1900, 1, 1),
                LocalDate.of(1900, 1, 1).plusMonths(1));
        lu[4] = new Usuario("Lucas", "Rua 852", LocalDate.of(1995, 5, 5), LocalDate.of(1900, 2, 1),
                LocalDate.of(1900, 2, 1).plusMonths(1));

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

        // teste se pode recomendar
        podeRecomendaFilme(lu[0], lf[0], true);
        podeRecomendaFilme(lu[1], lf[1], true);
        podeRecomendaFilme(lu[2], lf[2], true);
        podeRecomendaFilme(lu[3], lf[3], true);
        podeRecomendaFilme(lu[4], lf[4], true);
        System.out.println(lu[0].getDataProximaIndicacao().toString());
        System.out.println(lu[1].getDataProximaIndicacao().toString());
        System.out.println(lu[2].getDataProximaIndicacao().toString());
        System.out.println(lu[3].getDataProximaIndicacao().toString());
        System.out.println(lu[4].getDataProximaIndicacao().toString());

        inicio.close();
    }

}
