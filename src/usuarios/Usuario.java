package usuarios;

// Sempre comUsuarioaiuscula
public class Usuario {

    String nomeUsuario;
    String enderecoUsuario;
    String dataNacimentoUsuario;
    
    // forma de criar usuario
    Usuario(String nomeUsuario, String enderecoUsuario, String dataNacimentoUsuario) {

        this.nomeUsuario = nomeUsuario;
        this.enderecoUsuario = enderecoUsuario;
        this.dataNacimentoUsuario = dataNacimentoUsuario;
    }
    
}
