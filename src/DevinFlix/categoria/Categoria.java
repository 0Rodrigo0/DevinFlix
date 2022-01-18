package DevinFlix.categoria;

import java.time.LocalDate;

import DevinFlix.filmes.Genero;

public abstract class Categoria {

    private String nome;
    private String sinopse;
    private Genero genero;
    private LocalDate anoLancamento;
    private Integer recomendado = 0;
    private Integer curtiu = 0;
    private Integer descurtiu = 0;

    public Categoria(String nome, String sinopse, Genero genero, LocalDate anoLancamento) {
        this.nome = nome;
        this.sinopse = sinopse;
        this.genero = genero;
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

    @Override
    public String toString() {
        return "Filme: " + nome + ". Sinopse: " + sinopse + "\n" + " Lançado em: " + anoLancamento
                + ". Curtido: " + curtiu + ". Descurtido: " + descurtiu + "\n";
    }

}
