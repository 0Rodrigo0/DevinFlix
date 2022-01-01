package main;

// mantém uma lista de dados e percorre ela para posterior impressao por ex. 
import java.util.ArrayList;
// utilitario cria listas de informções
import java.util.List;
// Importa o Scanner
import java.util.Scanner;
import usuarios.Usuario;
import filmes.Filme;
import filmes.ListaFilmes;

public class Main {

    // aqui chama a funcionalidade do menu inicial.
    public static void main(String[] args) {
        menuInicial();
    }

    public static void menuInicial() {
        // chama a classe Usuario e inicializa uma variavel u1
        Usuario u1;
        ListaFilmes lista;
        Filme film;
        // inicializa o scanner
        Scanner inicio = new Scanner(System.in);
        // inicializa a opcao do menu
        int opcao = 0;
        // inicializa a lista linkando a classe Usuario, com nome relacaoUsuario e
        // cria uma nova array com a classe Usuario
        List<Usuario> relacaoUsuario = new ArrayList<Usuario>();
        List<Filme> relacaoFilmes = new ArrayList<Filme>();
        do {

            System.out.println("****** BEM VINDO AO DevinFlix ******** ");
            System.out.println("O que você deseja fazer?");
            System.out.println(" ");
            System.out.println("Digite 1 para cadastrar um usuário.");
            System.out.println("Digite 2 para ver lista de usuários.");
            System.out.println("Digite 3 para ver lista de filmes.");
            System.out.println("Digite 4 para curtir/descurtir um filme.");
            System.out.println("Digite 5 para cadastrar um filme.");
            System.out.println("Digite 6 para indicar um filme.");
            System.out.println("Digite 7 para sair.");
            System.out.println(" ");
            // joga dentro de opcao o inteiro capturado pelo scanner
            opcao = Integer.parseInt(inicio.nextLine());
            System.out.println("_________________________________________");

            if (opcao == 1) {
                System.out.println(" ");
                System.out.println("Vamos começar a criar seu cadastro.");
                u1 = new Usuario();
                do {
                    System.out.println("Por favor digite seu nome APENAS com Letras!");
                    System.out.println(" ");
                    System.out.print("Digite seu Nome completo: ");
                    // definne as informações digitadas para nosso objeto da classe usuario
                    u1.setNomeUsuario(inicio.nextLine());
                } while (u1.nomeUsuario.matches("[0-9]*") | u1.nomeUsuario.matches("[ ]*"));

                do {
                    System.out.println("_________________________________________");
                    System.out.println("Digite seu endereço com numero!");
                    System.out.println(" ");
                    System.out.print("Digite seu Endereço: ");
                    // definne as informações digitadas para nosso objeto da classe usuario
                    u1.setEnderecoUsuario(inicio.nextLine());
                } while (u1.enderecoUsuario.matches("[ ]*") | u1.enderecoUsuario.matches("[a-z]*")
                        | u1.enderecoUsuario.matches("[0-9]*")
                        | u1.enderecoUsuario.matches("[A-Z]*"));

                do {
                    System.out.println("_________________________________________");
                    System.out.print("Digite sua data de nascimento: ");
                    // definne as informações digitadas para nosso objeto da classe usuario
                    u1.setDataNacimentoUsuario(inicio.nextLine());
                } while (u1.dataNacimentoUsuario.matches("[ ]*") | u1.dataNacimentoUsuario.matches("[a-z]*")
                        | u1.dataNacimentoUsuario.matches("[A-Z]*")
                        | u1.dataNacimentoUsuario.matches("[0-9]*"));

                System.out.println(" ");
                // adiciona a lista criada o primeiro usuário criado
                relacaoUsuario.add(u1);
            }
            if (opcao == 2) {
                System.out.println("_________________________________________");
                // puxa a configuração setada no Usuários.java
                System.out.println(relacaoUsuario.toString());
                System.out.println("_________________________________________");
            }
            if (opcao == 3) {

                ListaFilmes f1 = new ListaFilmes("Homem Aranha", "Ação", "Um homem e uma aranha.", "homemaranha.com");
                ListaFilmes f2 = new ListaFilmes("Star Wars", "Ficção", "Homens lutam pelo espaço.",
                        "starwars.com.com");
                ListaFilmes f3 = new ListaFilmes("Indiana Jones", "Aventura", "Um homem procura um tesouro.",
                        "indianajones.com");
                ListaFilmes f4 = new ListaFilmes("A Bela e a Fera", "Romance", "Uma bela e uma Fera.",
                        "abelaeafera.com");
                System.out.println("Estes são os filmes de nosso catálogo: ");
                System.out.println(" ");
                System.out.println("Nome: " + f1.nome + ". Genero: " + f1.genero + " Sinopse: " + f1.sinopse
                        + ". Link: " + f1.link);
                System.out.println("Nome: " + f2.nome + ". Genero: " + f2.genero + " Sinopse: " + f2.sinopse
                        + ". Link: " + f2.link);
                System.out.println("Nome: " + f3.nome + ". Genero: " + f3.genero + " Sinopse: " + f3.sinopse
                        + ". Link: " + f3.link);
                System.out.println("Nome: " + f4.nome + ". Genero: " + f4.genero + " Sinopse: " + f4.sinopse
                        + ". Link: " + f4.link);
                System.out.println(
                        "______________________________________________________________________________________________________");
                System.out.println("Filmes Sugeridos: ");
                System.out.println(relacaoFilmes.toString());
            }
            if (opcao == 4) {
            }
            if (opcao == 5) {

                System.out.println(" ");
                System.out.println("Se voce deseja cadastrar um filme digite '1', se deseja sair digite '2'. ");
                opcao = Integer.parseInt(inicio.nextLine());
                film = new Filme();
                if (opcao == 1) {
                    do {
                        System.out.println("Por favor digite seu nome APENAS com Letras!");
                        System.out.println(" ");
                        System.out.print("Digite o nome do Filme: ");
                        // definne as informações digitadas para nosso objeto da classe usuario
                        film.setNome(inicio.nextLine());
                    } while (film.nome.matches("[0-9]*") | film.nome.matches("[ ]*"));
                    relacaoFilmes.add(film);
                }
            }
            if (opcao == 6) {
            }
        } while (opcao != 7);
        System.out.println("Obrigado!");
        inicio.close();
    }

}
