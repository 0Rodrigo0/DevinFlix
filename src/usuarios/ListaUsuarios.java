package usuarios;

public class ListaUsuarios {
    public String id;
    public String nome;
    public String endereco;
    public String dataNascimento;

    // forma de criar filme
    public ListaUsuarios(String id, String nome, String endereco, String dataNascimento) {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
        this.dataNascimento = dataNascimento;
    }

}
