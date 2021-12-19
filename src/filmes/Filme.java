package filmes;

// Sempre com letra maiuscula
public class Filme {

    public String nome;
    public String genero;
    public String sinopse;
    public String link;

    // forma de criar filme
    // Filme(String nome, String genero, String sinopse, String link) {
    // this.nome = nome;
    // this.genero = genero;
    // this.sinopse = sinopse;
    // this.link = link;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}
