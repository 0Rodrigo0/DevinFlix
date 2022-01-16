package DevinFlix.usuarios;

import java.time.LocalDate;

public class Usuario {

    private String nome;
    private String endereco;
    private LocalDate dataNascimento;
    private LocalDate dataIndicou = null;
    private LocalDate dataProximaIndicacao = null;

    public Usuario() {
    }

    public Usuario(String nome, String endereco, LocalDate dataNascimento, LocalDate dataIndicou,
            LocalDate dataProximaIndicacao) {
        this.nome = nome;
        this.endereco = endereco;
        this.dataNascimento = dataNascimento;
        this.dataIndicou = dataIndicou;
        this.dataProximaIndicacao = dataProximaIndicacao;
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

    public LocalDate getDataIndicou() {
        return dataIndicou;
    }

    public void setDataIndicou(LocalDate dataIndicou) {
        this.dataIndicou = dataIndicou;
    }

    public LocalDate getDataProximaIndicacao() {
        return dataProximaIndicacao;
    }

    public void setDataProximaIndicacao(LocalDate dataProximaIndicacao) {
        this.dataProximaIndicacao = dataProximaIndicacao;
    }

    @Override
    public String toString() {
        return "Usuario [dataIndicou=" + dataIndicou + ", dataNascimento=" + dataNascimento + ", dataProximaIndicacao="
                + dataProximaIndicacao + ", endereco=" + endereco + ", nome=" + nome + "]";
    }

}
