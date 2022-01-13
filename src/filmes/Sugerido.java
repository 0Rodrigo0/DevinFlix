package filmes;

import java.time.LocalDate;

public class Sugerido extends Filme {

    private String nome;
    private String sinopse;
    private Genero genero;
    private LocalDate anoLancamento;

    @Override
    public String toString() {
        return "Sugerido anoLancamento=" + anoLancamento + ", genero=" + genero + ", nome=" + nome + ", sinopse="
                + sinopse;
    }

}