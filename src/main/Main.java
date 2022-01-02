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

        public static void filmesLoja() {
                ListaFilmes f1 = new ListaFilmes("1", "Homem Aranha", "Ação", "Um homem e uma aranha.",
                                "homemaranha.com");
                ListaFilmes f2 = new ListaFilmes("2", "Star Wars", "Ficção", "Homens lutam pelo espaço.",
                                "starwars.com.com");
                ListaFilmes f3 = new ListaFilmes("3", "Indiana Jones", "Aventura",
                                "Um homem procura um tesouro.",
                                "indianajones.com");
                ListaFilmes f4 = new ListaFilmes("4", "A Bela e a Fera", "Romance", "Uma bela e uma Fera.",
                                "abelaeafera.com");
                System.out.println("Estes são os filmes de nosso catálogo: ");
                System.out.println(" ");
                System.out.println("Id: " + f1.id + " Nome: " + f1.nome + ". Genero: " + f1.genero + " Sinopse: "
                                + f1.sinopse + ". Link: " + f1.link);
                System.out.println("Id: " + f2.id + " Nome: " + f2.nome + ". Genero: " + f2.genero + " Sinopse: "
                                + f2.sinopse + ". Link: " + f2.link);
                System.out.println("Id: " + f3.id + " Nome: " + f3.nome + ". Genero: " + f3.genero + " Sinopse: "
                                + f3.sinopse + ". Link: " + f3.link);
                System.out.println("Id: " + f4.id + " Nome: " + f4.nome + ". Genero: " + f4.genero + " Sinopse: "
                                + f4.sinopse + ". Link: " + f4.link);
        }

        public static void menuInicial() {
                // chama a classe Usuario e inicializa uma variavel u1
                Usuario u1;
                Filme film;
                int curtida1 = 0;
                int curtida2 = 0;
                int curtida3 = 0;
                int curtida4 = 0;
                // inicializa o scanner
                Scanner inicio = new Scanner(System.in);
                // inicializa a opcao do menu
                int opcao = 0;
                // inicializa a lista linkando a classe Usuario, com nome relacaoUsuario e
                // cria uma nova array com a classe Usuario
                List<Usuario> relacaoUsuario = new ArrayList<Usuario>();
                List<Filme> relacaoFilmes = new ArrayList<Filme>();

                System.out.println("****** Bem Vindo ao DevinFlix ******** ");
                do {
                        System.out.println("O que você deseja fazer?");
                        System.out.println(" ");
                        System.out.println("Digite 1 para cadastrar um usuário.");
                        System.out.println("Digite 2 para ver lista de usuários.");
                        System.out.println("Digite 3 para ver lista de filmes.");
                        System.out.println("Digite 4 para curtir/descurtir um filme.");
                        System.out.println("Digite 5 para sugerir um filme.");
                        System.out.println("Digite 6 para ????????.");
                        System.out.println("Digite 7 para sair.");
                        System.out.println(" ");
                        // joga dentro de opcao o inteiro capturado pelo scanner
                        opcao = Integer.parseInt(inicio.nextLine());
                        System.out.println(
                                        "______________________________________________________________________________________________________");
                        // cadastrar um usuário
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
                                        System.out.println(
                                                        "______________________________________________________________________________________________________");
                                        System.out.println("Digite seu endereço com numero!");
                                        System.out.println(" ");
                                        System.out.print("Digite seu Endereço: ");
                                        // definne as informações digitadas para nosso objeto da classe usuario
                                        u1.setEnderecoUsuario(inicio.nextLine());
                                } while (u1.enderecoUsuario.matches("[ ]*") | u1.enderecoUsuario.matches("[a-z]*")
                                                | u1.enderecoUsuario.matches("[0-9]*")
                                                | u1.enderecoUsuario.matches("[A-Z]*"));

                                do {
                                        System.out.println(
                                                        "______________________________________________________________________________________________________");
                                        System.out.print("Digite sua data de nascimento: ");
                                        // definne as informações digitadas para nosso objeto da classe usuario
                                        u1.setDataNacimentoUsuario(inicio.nextLine());
                                } while (u1.dataNacimentoUsuario.matches("[ ]*")
                                                | u1.dataNacimentoUsuario.matches("[a-z]*")
                                                | u1.dataNacimentoUsuario.matches("[A-Z]*")
                                                | u1.dataNacimentoUsuario.matches("[0-9]*"));

                                System.out.println(" ");
                                // adiciona a lista criada o primeiro usuário criado
                                relacaoUsuario.add(u1);
                        }
                        // lista de usuários
                        if (opcao == 2) {
                                System.out.println("_________________________________________");
                                // puxa a configuração setada no Usuários.java
                                System.out.println(relacaoUsuario.toString());
                                System.out.println("_________________________________________");
                        }
                        // lista de filmes
                        if (opcao == 3) {
                                filmesLoja();
                                System.out.println(
                                                "______________________________________________________________________________________________________");
                                System.out.println("Filmes Sugeridos por você: ");
                                System.out.println(relacaoFilmes.toString());
                                System.out.println(
                                                "______________________________________________________________________________________________________");
                        }
                        // curtir/descurtir
                        if (opcao == 4) {

                                do {
                                        System.out.println("Você deseja 'Curtir' ou 'Descurtir' um filme?");
                                        System.out.println("Curtir = 1 | Descurtir = 2 | Sair = 0");
                                        opcao = Integer.parseInt(inicio.nextLine());
                                        // curtir
                                        if (opcao == 1) {
                                                System.out.println("Digite o ID do filme que seseja Curtir:");
                                                filmesLoja();
                                                opcao = Integer.parseInt(inicio.nextLine());
                                                if (opcao == 1) {
                                                        curtida1 = curtida1 + 1;
                                                        System.out.println("");
                                                        System.out.println(
                                                                        "Homem Aranha ganhou uma curtida");
                                                        System.out.println("");
                                                }
                                                if (opcao == 2) {
                                                        curtida2 = curtida2 + 1;
                                                        System.out.println("");
                                                        System.out.println(
                                                                        "Star Wars ganhou uma curtida");
                                                        System.out.println("");
                                                }
                                                if (opcao == 3) {
                                                        curtida3 = curtida3 + 1;
                                                        System.out.println("");
                                                        System.out.println(
                                                                        "Indiana Jones uma curtida");
                                                        System.out.println("");
                                                }
                                                if (opcao == 4) {
                                                        curtida4 = curtida4 + 1;
                                                        System.out.println("");
                                                        System.out.println(
                                                                        "A Bela e a Fera uma curtida");
                                                        System.out.println("");
                                                }

                                        }
                                        // descuritr
                                        if (opcao == 2) {
                                                System.out.println("Digite o ID do filme que seseja Curtir:");
                                                filmesLoja();
                                                opcao = Integer.parseInt(inicio.nextLine());
                                                if (opcao == 1) {
                                                        curtida1 = curtida1 - 1;
                                                        System.out.println("");
                                                        System.out.println(
                                                                        "Homem Aranha perdeu uma curtida");
                                                        System.out.println("");
                                                }
                                                if (opcao == 2) {
                                                        curtida2 = curtida2 - 1;
                                                        System.out.println("");
                                                        System.out.println(
                                                                        "Star Wars perdeu uma curtida");
                                                        System.out.println("");
                                                }
                                                if (opcao == 3) {
                                                        curtida3 = curtida3 - 1;
                                                        System.out.println("");
                                                        System.out.println(
                                                                        "Indiana Jones perdeu uma curtida");
                                                        System.out.println("");
                                                }
                                                if (opcao == 4) {
                                                        curtida4 = curtida4 - 1;
                                                        System.out.println("");
                                                        System.out.println(
                                                                        "A Bela e a Fera perdeu uma curtida");
                                                        System.out.println("");
                                                }
                                        }
                                } while (opcao != 0);
                                System.out.println("Curtidas:");
                                System.out.println("");
                                System.out.println("Homem Aranha tem " + curtida1 + " curtida(s)");
                                System.out.println("Star Wars tem " + curtida2 + " curtida");
                                System.out.println("Indiana Jones " + curtida3 + " curtida");
                                System.out.println("A Bela e a Fera " + curtida4 + " curtida");
                                System.out.println("");
                                System.out.println("");

                        }
                        // sugerir um filme
                        if (opcao == 5) {
                                System.out.println(" ");
                                // System.out.println(
                                // "Se voce deseja sugerir um filme digite '1', se não digite '2'. ");
                                // opcao = Integer.parseInt(inicio.nextLine());
                                film = new Filme();
                                // if (opcao == 1) {
                                do {
                                        // System.out.println(" ");
                                        System.out.print("Digite o nome do Filme: ");
                                        // definne as informações digitadas para nosso objeto da classe usuario
                                        film.setNome(inicio.nextLine());
                                } while (film.nome.matches("[0-9]*") | film.nome.matches("[ ]*"));
                                relacaoFilmes.add(film);
                                // }
                        }
                        // ????????
                        if (opcao == 6) {
                        }
                } while (opcao != 7);
                System.out.println("Obrigado!");
                inicio.close();
        }

}
