package usuarios;

// Sempre comUsuarioaiuscula
public class Usuario {

    public String nomeUsuario;
    public String enderecoUsuario;
    public String dataNacimentoUsuario;
    
    // forma de criar usuario
    public Usuario(String nomeUsuario, String enderecoUsuario, String dataNacimentoUsuario) {

        this.nomeUsuario = nomeUsuario;
        this.enderecoUsuario = enderecoUsuario;
        this.dataNacimentoUsuario = dataNacimentoUsuario;
    }
    
}
