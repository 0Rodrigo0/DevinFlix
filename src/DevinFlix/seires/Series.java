package DevinFlix.seires;

import java.time.LocalDate;

import DevinFlix.categoria.Categoria;
import DevinFlix.filmes.Genero;

public class Series extends Categoria {

    private String link;

    public Series(String nome, String sinopse, Genero genero, LocalDate anoLancamento) {
        super(nome, sinopse, genero, anoLancamento);
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

}
