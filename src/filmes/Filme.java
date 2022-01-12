package filmes;

import java.net.URL;
import java.time.LocalDate;

public class Filme {

    private String nome;
    private String sinopse;
    private Genero genero;
    private URL link;
    private LocalDate anoLancamento;
    private Integer curtiu = 0;
    private Integer descurtiu = 0;

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

    public URL getLink() {
        return link;
    }

    public void setLink(URL link) {
        this.link = link;
    }

    @Override
    public String toString() {
        return "Filme anoLancamento=" + anoLancamento + ", curtiu=" + curtiu + ", descurtiu=" + descurtiu + ", genero="
                + genero + ", link=" + link + ", nome=" + nome + ", sinopse=" + sinopse;
    }

}
