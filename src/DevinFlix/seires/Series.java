package DevinFlix.seires;

import java.time.LocalDate;

import DevinFlix.categoria.Categoria;
import DevinFlix.filmes.Genero;

public class Series extends Categoria {

    private String nome;
    private String sinopse;
    private Genero genero;
    private String link;
    private LocalDate anoLancamento;
    private Integer recomendado = 0;
    private Integer curtiu = 0;
    private Integer descurtiu = 0;

    public Series(String nome, String sinopse, Genero genero, String link, LocalDate anoLancamento) {
        this.nome = nome;
        this.sinopse = sinopse;
        this.genero = genero;
        this.link = link;
        this.anoLancamento = anoLancamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public LocalDate getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(LocalDate anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public Integer getRecomendado() {
        return recomendado;
    }

    public void setRecomendado(Integer recomendado) {
        this.recomendado = recomendado;
    }

    public Integer getCurtiu() {
        return curtiu;
    }

    public void setCurtiu(Integer curtiu) {
        this.curtiu = curtiu;
    }

    public Integer getDescurtiu() {
        return descurtiu;
    }

    public void setDescurtiu(Integer descurtiu) {
        this.descurtiu = descurtiu;
    }

}
