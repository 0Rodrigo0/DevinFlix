package main;

// mantém uma lista de dados e percorre ela para posterior impressao por ex. 
import java.util.ArrayList;
// utilitario cria listas de informções
import java.util.List;
// Importa o Scanner
import java.util.Scanner;
import usuarios.Usuario;
import filmes.Filme;
import filmes.Indicacao;
import filmes.ListaFilmes;
import usuarios.ListaUsuarios;

public class Main {
        public static int curtida1;
        public static int curtida2;
        public static int curtida3;
        public static int curtida4;
        public static ListaUsuarios user1;
        public static ListaUsuarios user2;
        public static ListaUsuarios user3;

        // aqui chama a funcionalidade do menu inicial.
        public static void main(String[] args) {
                menuInicial();
        }

        // lista de usuários pré cadastrados.
        public static void listaUsuarios() {
                ListaUsuarios us1 = new ListaUsuarios("1", "Rodrigo.", "Rua Aparecida 123.", "1/1/1998.");
                user1 = us1;
                ListaUsuarios us2 = new ListaUsuarios("2", "Eduardo.", "Rua Desaparecida 123.", "2/2/1998.");
                user2 = us2;
                ListaUsuarios us3 = new ListaUsuarios("3", "Fabricio.", "Rua Desconhecida 123.", "3/3/1998.");
                user3 = us3;
                System.out.println("Usuarios pré-cadastrados: ");
                System.out.println(" ");
                System.out.println("Id: " + us1.id + " - Nome: " + us1.nome + " Endereço: " + us1.endereco
                                + " Data de Nascimento: "
                                + us1.dataNascimento);
                System.out.println("Id: " + us2.id + " - Nome: " + us2.nome + " Endereço: " + us2.endereco
                                + " Data de Nascimento: "
                                + us2.dataNascimento);
                System.out.println("Id: " + us3.id + " - Nome: " + us3.nome + " Endereço: " + us3.endereco
                                + " Data de Nascimento: "
                                + us3.dataNascimento);
        }

        // lista de filmes.
        public static void filmesLoja() {
                ListaFilmes f1 = new ListaFilmes("1 -", "Homem Aranha.", "Ação.", "Um homem e uma aranha.",
                                "homemaranha.com");
                ListaFilmes f2 = new ListaFilmes("2 -", "Star Wars.", "Ficção.", "Homens lutam pelo espaço.",
                                "starwars.com.com");
                ListaFilmes f3 = new ListaFilmes("3 -", "Indiana Jones.", "Aventura.", "Um homem procura um tesouro.",
                                "indianajones.com");
                ListaFilmes f4 = new ListaFilmes("4 -", "A Bela e a Fera.", "Romance.", "Uma bela e uma Fera.",
                                "abelaeafera.com");
                System.out.println("Estes são os filmes de nosso catálogo: ");
                System.out.println(" ");
                System.out.println("Id: " + f1.id + " Nome: " + f1.nome + " Genero: " + f1.genero + " Sinopse: "
                                + f1.sinopse + "\n" + " Link: " + f1.link + ". Curtidas: " + curtida1 + "\n");
                System.out.println("Id: " + f2.id + " Nome: " + f2.nome + " Genero: " + f2.genero + " Sinopse: "
                                + f2.sinopse + "\n" + " Link: " + f2.link + ". Curtidas: " + curtida2 + "\n");
                System.out.println("Id: " + f3.id + " Nome: " + f3.nome + " Genero: " + f3.genero + " Sinopse: "
                                + f3.sinopse + "\n" + " Link: " + f3.link + ". Curtidas: " + curtida3 + "\n");
                System.out.println("Id: " + f4.id + " Nome: " + f4.nome + " Genero: " + f4.genero + " Sinopse: "
                                + f4.sinopse + "\n" + " Link: " + f4.link + ". Curtidas: " + curtida4 + "\n");
        }

        public static void menuInicial() {
                // chama a classe Usuario e inicializa uma variavel u1
                Usuario u1;
                Filme film;
                Indicacao indica;
                curtida1 = 0;
                curtida2 = 0;
                curtida3 = 0;
                curtida4 = 0;
                // inicializa o scanner
                Scanner inicio = new Scanner(System.in);
                // inicializa a opcao do menu
                int opcao = 0;
                // inicializa a lista linkando a classe Usuario, com nome relacaoUsuario e
                // cria uma nova array com a classe Usuario
                List<Usuario> relacaoUsuario = new ArrayList<Usuario>();
                List<Filme> relacaoFilmes = new ArrayList<Filme>();
                List<Indicacao> relacaoIndicacao = new ArrayList<Indicacao>();

                System.out.println("****** Bem Vindo ao DevinFlix ******** ");
                do {
                        System.out.println("O que você deseja fazer?");
                        System.out.println(" ");
                        System.out.println("Digite 1 para cadastrar um usuário.");
                        System.out.println("Digite 2 para ver lista de usuários.");
                        System.out.println("Digite 3 para ver lista de filmes.");
                        System.out.println("Digite 4 para curtir/descurtir um filme.");
                        System.out.println("Digite 5 para sugerir um filme.");
                        System.out.println("Digite 6 para Recomendação.");
                        System.out.println("Digite 7 para sair.");
                        System.out.println(" ");
                        // joga dentro de opcao o inteiro capturado pelo scanner
                        opcao = Integer.parseInt(inicio.nextLine());
                        System.out.println("_________________________________________");
                        // Quem paga a conta? cadastrar um usuário
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
                                        System.out.println(
                                                        "___________________________________________________________________");
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
                                listaUsuarios();
                                System.out.println("_________________________________________");
                                System.out.println("Usuários cadastrados pelo App: ");
                                // puxa a configuração setada no Usuários.java
                                System.out.println(relacaoUsuario.toString().replace("[", "").replace("]", ""));
                                System.out.println("_________________________________________");
                        }
                        // lista de filmes
                        if (opcao == 3) {
                                filmesLoja();
                                System.out.println(
                                                "___________________________________________________________________");
                                System.out.println("Filmes Sugeridos: ");
                                System.out.println(relacaoFilmes.toString());
                                System.out.println(
                                                "___________________________________________________________________");
                        }
                        // Interatividade curtir/descurtir
                        if (opcao == 4) {
                                do {
                                        System.out.println("Você deseja 'Curtir' ou 'Descurtir' um filme?");
                                        System.out.println("Curtir = 5 | Descurtir = 6 | Sair = 0");
                                        opcao = Integer.parseInt(inicio.nextLine());
                                        // curtir
                                        if (opcao == 5) {
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
                                        if (opcao == 6) {
                                                System.out.println("Digite o ID do filme que seseja Descurtir:");
                                                filmesLoja();
                                                opcao = Integer.parseInt(inicio.nextLine());
                                                if (opcao == 1) {
                                                        if (curtida1 >= 1) {
                                                                curtida1 = curtida1 - 1;
                                                                System.out.println("");
                                                                System.out.println(
                                                                                "Homem Aranha perdeu uma curtida");
                                                                System.out.println("");
                                                        } else {
                                                                System.out.println("Este filme não possui curtidas.");
                                                                System.out.println("");
                                                        }
                                                }
                                                if (opcao == 2) {
                                                        if (curtida1 >= 1) {
                                                                curtida2 = curtida2 - 1;
                                                                System.out.println("");
                                                                System.out.println("Star Wars perdeu uma curtida");
                                                                System.out.println("");
                                                        } else {
                                                                System.out.println("Este filme não possui curtidas.");
                                                                System.out.println("");
                                                        }
                                                }
                                                if (opcao == 3) {
                                                        if (curtida1 >= 1) {
                                                                curtida3 = curtida3 - 1;
                                                                System.out.println("");
                                                                System.out.println("Indiana Jones perdeu uma curtida");
                                                                System.out.println("");
                                                        } else {
                                                                System.out.println("Este filme não possui curtidas.");
                                                                System.out.println("");
                                                        }
                                                }
                                                if (opcao == 4) {
                                                        if (curtida1 >= 1) {
                                                                curtida4 = curtida4 - 1;
                                                                System.out.println("");
                                                                System.out.println(
                                                                                "A Bela e a Fera perdeu uma curtida");
                                                                System.out.println("");
                                                        } else {
                                                                System.out.println("Este filme não possui curtidas.");
                                                                System.out.println("");
                                                        }
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
                        // O melhor catálogo de filmes!
                        if (opcao == 5) {
                                System.out.println(" ");
                                film = new Filme();
                                do {
                                        // System.out.println(" ");
                                        System.out.print("Digite o nome do Filme: ");
                                        // definne as informações digitadas para nosso objeto da classe usuario
                                        film.setNome(inicio.nextLine());
                                } while (film.nome.matches("[0-9]*") | film.nome.matches("[ ]*"));
                                relacaoFilmes.add(film);
                                System.out.println(
                                                "Sugertão cadastrada com sucesso! Você pode conferir na opção 3 do menu.");
                                System.out.println("");
                        }
                        // Recomendação
                        if (opcao == 6) {
                                indica = new Indicacao();
                                System.out.println("Para recomendar um filme primeiro escolha o ID de um usuário: ");
                                System.out.println("Para sair digite '0'.");
                                listaUsuarios();
                                System.out.println("");
                                opcao = Integer.parseInt(inicio.nextLine());
                                if (opcao == 1) {
                                        System.out.println("Você escolheu o usuário " + user1.nome);
                                        indica.setIndicado(user1.nome);
                                        System.out.println("Qual o filme e porque você o indica?");
                                        indica.setTexto(inicio.nextLine());
                                        System.out.println("");
                                        System.out.println("Agora se identifque, escreva seu nome...");
                                        indica.setQuemIndicou(inicio.nextLine());
                                        relacaoIndicacao.add(indica);
                                        System.out.println("");
                                        System.out.println(relacaoIndicacao.toString().replace("[", "").replace("]",
                                                        "").replace(",", ""));
                                }
                                if (opcao == 2) {
                                        System.out.println("Você escolheu o usuário " + user2.nome);
                                        indica.setIndicado(user2.nome);
                                        System.out.println("Qual o filme e porque você o indica?");
                                        indica.setTexto(inicio.nextLine());
                                        System.out.println("");
                                        System.out.println("Agora se identifque, escreva seu nome...");
                                        indica.setQuemIndicou(inicio.nextLine());
                                        relacaoIndicacao.add(indica);
                                        System.out.println("");
                                        System.out.println(relacaoIndicacao.toString().replace("[", "").replace("]",
                                                        "").replace(",", ""));
                                }
                                if (opcao == 3) {
                                        System.out.println("Você escolheu o usuário " + user3.nome);
                                        indica.setIndicado(user3.nome);
                                        System.out.println("Qual o filme e porque você o indica?");
                                        indica.setTexto(inicio.nextLine());
                                        System.out.println("");
                                        System.out.println("Agora se identifque, escreva seu nome...");
                                        indica.setQuemIndicou(inicio.nextLine());
                                        relacaoIndicacao.add(indica);
                                        System.out.println("");
                                        System.out.println(relacaoIndicacao.toString().replace("[", "").replace("]",
                                                        "").replace(",", ""));
                                }

                        }
                } while (opcao != 7);
                System.out.println("Obrigado!");
                inicio.close();
        }

}
