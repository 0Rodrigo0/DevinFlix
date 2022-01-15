package DevinFlix.recomendacoes;

import DevinFlix.filmes.Filme;

public class recomendar {

    private String usuarioIndica;
    private String usuarioIndicou;
    private Filme filme;
    private String texto;

    public recomendar() {
    }

    public recomendar(String usuarioIndica, String usuarioIndicou, Filme filme, String texto) {
        this.usuarioIndica = usuarioIndica;
        this.usuarioIndicou = usuarioIndicou;
        this.filme = filme;
        this.texto = texto;
    }

    public String getUsuarioIndica() {
        return usuarioIndica;
    }

    public void setUsuarioIndica(String usuarioIndica) {
        this.usuarioIndica = usuarioIndica;
    }

    public String getUsuarioIndicou() {
        return usuarioIndicou;
    }

    public void setUsuarioIndicou(String usuarioIndicou) {
        this.usuarioIndicou = usuarioIndicou;
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

}
