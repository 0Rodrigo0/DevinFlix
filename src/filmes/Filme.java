package filmes;

import java.time.LocalDate;

public class Filme {

    private String nome;
    private String sinopse;
    private Genero genero;
    private String link;
    private LocalDate anoLancamento;
    private Integer curtiu = 0;
    private Integer descurtiu = 0;

    public Filme(String nome, String sinopse, Genero genero, String link, LocalDate anoLancamento) {
        this.nome = nome;
        this.sinopse = sinopse;
        this.genero = genero;
        this.link = link;
        this.anoLancamento = anoLancamento;

    }

    public LocalDate getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(LocalDate anoLancamento) {
        this.anoLancamento = anoLancamento;
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

    @Override
    public String toString() {
        return "Filme: " + nome + "  " + "Lançado em: " + anoLancamento + "\n" + "Sinopse: " + sinopse + "\n"
                + "Genero: " + genero + "  " + "Link: " + link + "\n";
    }

}
