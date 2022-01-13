package filmes;

import java.time.LocalDate;

public class Sugerido extends Filme {

    private String nome;
    private String sinopse;
    private Genero genero;
    private LocalDate anoLancamento;

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

    @Override
    public String toString() {
        return "Sugerido anoLancamento=" + anoLancamento + ", genero=" + genero + ", nome=" + nome + ", sinopse="
                + sinopse;
    }

}
