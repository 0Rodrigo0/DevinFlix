package DevinFlix.usuarios;

import java.time.LocalDate;

public class Usuario {

    private String nome;
    private String endereco;
    private LocalDate dataNascimento;
    private static LocalDate dataIndicou = null;
    private static LocalDate dataProximaIndicacao = null;

    public Usuario() {
    }

    public Usuario(String nome, String endereco, LocalDate dataNascimento) {
        this.nome = nome;
        this.endereco = endereco;
        this.dataNascimento = dataNascimento;
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

    public static LocalDate getDataIndicou() {
        return dataIndicou;
    }

    public static void setDataIndicou(LocalDate dataIndicou) {
        Usuario.dataIndicou = dataIndicou;
    }

    public static LocalDate getDataProximaIndicacao() {
        return dataProximaIndicacao;
    }

    public static void setDataProximaIndicacao(LocalDate dataProximaIndicacao) {
        Usuario.dataProximaIndicacao = dataProximaIndicacao;
    }

}
