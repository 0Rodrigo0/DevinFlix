package DevinFlix.main;

import DevinFlix.filmes.Filme;
import DevinFlix.usuarios.Usuario;

public class devinFlix {

    public static void curtirDescurtir(Usuario usuario, Filme filme, boolean curtir) {

        if (curtir == true) {
            filme.setCurtiu(filme.getCurtiu() + 1);
            System.out.println("Que bom  que gostou, o filme tem " + filme.getCurtiu() + " curtida(s).");
        } else {
            filme.setDescurtiu(filme.getDescurtiu() + 1);
            System.out.println("Que pena, o filme tem " + filme.getDescurtiu() + " descurtida(s).");
        }

    }

    public static void main(String[] args) {

    }

}
