package DevinFlix.filmes;

import java.time.LocalDate;

import DevinFlix.categoria.Categoria;

public class Filme extends Categoria {

    private String link;

    public Filme(String nome, String sinopse, Genero genero, String link, LocalDate anoLancamento) {
        super(nome, sinopse, genero, anoLancamento);
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

}
