package usuarios;

// Sempre comUsuarioaiuscula
public class Usuario {

    // campos do usuário
    public String nomeUsuario;
    public String enderecoUsuario;
    public String dataNacimentoUsuario;

    // forma de criar usuario
    // public Usuario(String nomeUsuario, String enderecoUsuario, String
    // dataNacimentoUsuario) {
    //
    // this.nomeUsuario = nomeUsuario;
    // this.enderecoUsuario = enderecoUsuario;
    // this.dataNacimentoUsuario = dataNacimentoUsuario;
    // }

    // Getter e Setters para poder inserir opcoes automaticamente nos objetos.
    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getEnderecoUsuario() {
        return enderecoUsuario;
    }

    public void setEnderecoUsuario(String enderecoUsuario) {
        this.enderecoUsuario = enderecoUsuario;
    }

    public String getDataNacimentoUsuario() {
        return dataNacimentoUsuario;
    }

    public void setDataNacimentoUsuario(String dataNacimentoUsuario) {
        this.dataNacimentoUsuario = dataNacimentoUsuario;
    }

    // converte os dados do objeto para serem legiveis como String
    @Override
    public String toString() {
        // o metodo precisa do retorno para ser impresso depois na Main
        return "Nome: " + nomeUsuario + ". Endereço: " + enderecoUsuario + ". Data de Nascimento: "
                + dataNacimentoUsuario + "\n";
    }

}
