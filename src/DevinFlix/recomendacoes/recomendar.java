package DevinFlix.recomendacoes;

import DevinFlix.filmes.Filme;
import DevinFlix.usuarios.Usuario;

public class Recomendar extends Usuario {

    private String usuarioIndica;
    private String usuarioIndicado;
    private Filme filme;
    private String texto;

    public Recomendar() {
    }

    public Recomendar(String usuarioIndica, String usuarioIndicado, Filme filme, String texto) {
        this.usuarioIndica = usuarioIndica;
        this.usuarioIndicado = usuarioIndicado;
        this.filme = filme;
        this.texto = texto;
    }

    public String getUsuarioIndica() {
        return usuarioIndica;
    }

    public void setUsuarioIndica(String usuarioIndica) {
        this.usuarioIndica = usuarioIndica;
    }

    public String getUsuarioIndicado() {
        return usuarioIndicado;
    }

    public void setUsuarioIndicado(String usuarioIndicado) {
        this.usuarioIndicado = usuarioIndicado;
    }

    public Filme getFilme() {
        return filme;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    @Override
    public String toString() {
        return "Filme: " + filme.getNome() + "Texto: " + texto
                + ". Quem indicou: " + usuarioIndica + ". Para: " + usuarioIndicado;
    }

}
