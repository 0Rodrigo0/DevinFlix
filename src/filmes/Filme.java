package filmes;

// Sempre com letra maiuscula
public class Filme {

    public String nome;
    public String genero;
    public String sinopse;
    public String link;

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

    @Override
    public String toString() {
        // o metodo precisa do retorno para ser impresso depois na Main
        return "Nome: " + nome + "\n";
        // return "Nome: " + nome + ". Genero: " + genero + ". Sinopse: "
        // + sinopse + ". Link: " + link + "\n";
    }

}
