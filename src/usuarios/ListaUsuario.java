package usuarios;

public class ListaUsuario {
    
    public static void main(String[] args) {
    
        Usuario u1 = new Usuario("Rodrigo.", "Rua A, 123.", "01/01/1999.");
        Usuario u2 = new Usuario("Ana.", "Rua B, 456.", "02/02/1980.");
        Usuario u3 = new Usuario("Pedro.", "Rua C, 678.", "03/03/2010.");

        System.out.println("Nome: " + u1.nomeUsuario + " " + "Endereço: ".concat(u1.enderecoUsuario) + " " + "Idade:".concat(u1.dataNacimentoUsuario));
        System.out.println(" ");
        System.out.println("Nome: " + u2.nomeUsuario + " " + "Endereço: ".concat(u2.enderecoUsuario) + " " + "Idade:".concat(u2.dataNacimentoUsuario));
        System.out.println(" ");
        System.out.println("Nome: " + u3.nomeUsuario + " " + "Endereço: ".concat(u3.enderecoUsuario) + " " + "Idade:".concat(u3.dataNacimentoUsuario));
        System.out.println(" ");

    }
}
