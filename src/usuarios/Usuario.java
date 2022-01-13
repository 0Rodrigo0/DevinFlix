package usuarios;

import java.time.LocalDate;

public class Usuario {

    private String nome;
    private String endereco;
    private LocalDate dataNascimento;
    private LocalDate dataIndicouFilme;
    private LocalDate dataProximaIndicacao;

    public LocalDate getDataProximaIndicacao() {
        return dataProximaIndicacao;
    }

    public void setDataProximaIndicacao(LocalDate dataProximaIndicacao) {
        this.dataProximaIndicacao = dataProximaIndicacao;
    }

    public LocalDate getDataIndicouFilme() {
        return dataIndicouFilme;
    }

    public void setDataIndicouFilme(LocalDate dataIndicouFilme) {
        this.dataIndicouFilme = dataIndicouFilme;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    @Override
    public String toString() {
        return "Usuario dataNascimento=" + dataNascimento + ", endereco=" + endereco + ", nome=" + nome;
    }

}
