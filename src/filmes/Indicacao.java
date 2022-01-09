package filmes;

public class Indicacao {

    String indicado;
    String texto;
    String quemIndicou;

    public String getIndicado() {
        return indicado;
    }

    public void setIndicado(String indicado) {
        this.indicado = indicado;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getQuemIndicou() {
        return quemIndicou;
    }

    public void setQuemIndicou(String quemIndicou) {
        this.quemIndicou = quemIndicou;
    }

    @Override
    public String toString() {
        // o metodo precisa do retorno para ser impresso depois na Main
        return "Indicado: " + indicado + "\n" + "Texto: " + texto + "\n" + "Quem indicou: " + quemIndicou + "\n" + "\n";

    }
}
