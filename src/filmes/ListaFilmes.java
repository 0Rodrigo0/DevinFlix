package filmes;

public class ListaFilmes {

    public static void main(String[] args) {
       
        Filme f1 = new Filme("Homem Aranha", "Ação", "Um homem e uma aranha.", "homemaranha.com");
        Filme f2 = new Filme("Star Wars", "Ficção", "Homens lutam pelo espaço.", "starwars.com.com");
        Filme f3 = new Filme("Indiana Jones", "Aventura", "Um homem procuraum tesouro.", "indianajones.com");
        Filme f4 = new Filme("A Bela e a Fera", "Romance", "Uma bela e uma Fera.", "abelaeafera.com");
        
        System.out.println("Nome do filme: " + f1.nome+ "." + " Genero: ".concat(f1.genero)+ "."
                + " Sinopse: ".concat(f1.sinopse) + " Link: ".concat(f1.link));
        System.out.println(" ");
        System.out.println("Nome do filme: " + f2.nome+ "." + " Genero: ".concat(f2.genero)+ "."
                + " Sinopse: ".concat(f2.sinopse) + " Link: ".concat(f2.link));
        System.out.println(" ");
        System.out.println("Nome do filme: " + f3.nome+ "." + " Genero: ".concat(f3.genero)+ "."
                + " Sinopse: ".concat(f3.sinopse) + " Link: ".concat(f3.link));
        System.out.println(" ");
        System.out.println("Nome do filme: " + f4.nome+ "." + " Genero: ".concat(f4.genero)+ "."
                + " Sinopse: ".concat(f4.sinopse) + " Link: ".concat(f4.link));
        System.out.println(" ");

    }
    
}
