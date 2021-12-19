package usuarios;

// Sempre comUsuarioaiuscula
public class Usuario {

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

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    // Getther e Setters
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

    @Override
    public String toString() {
        return "Nome: " + nomeUsuario + ". Endereço: " + enderecoUsuario + ". Data de Nascimento: "
                + dataNacimentoUsuario + "\n";
    }

}
