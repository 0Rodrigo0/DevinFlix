package recomendados;

public class Recomendado {

    private String filme;
    private String usuarioQueRecomenda;
    private String texto;
    private String usuarioRecomnedado;

    public String getFilme() {
        return filme;
    }

    public void setFilme(String filme) {
        this.filme = filme;
    }

    public String getUsuarioQueRecomenda() {
        return usuarioQueRecomenda;
    }

    public void setUsuarioQueRecomenda(String usuarioQueRecomenda) {
        this.usuarioQueRecomenda = usuarioQueRecomenda;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getUsuarioRecomnedado() {
        return usuarioRecomnedado;
    }

    public void setUsuarioRecomnedado(String usuarioRecomnedado) {
        this.usuarioRecomnedado = usuarioRecomnedado;
    }

    @Override
    public String toString() {
        return "Recomendado [filme=" + filme + ", texto=" + texto + ", usuarioQueRecomenda=" + usuarioQueRecomenda
                + ", usuarioRecomnedado=" + usuarioRecomnedado + "]";
    }

}
