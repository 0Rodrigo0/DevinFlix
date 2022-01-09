package filmes;

public class ListaFilmes {
        public String id;
        public String nome;
        public String genero;
        public String sinopse;
        public String link;

        // forma de criar filme
        public ListaFilmes(String id, String nome, String genero, String sinopse, String link) {
                this.id = id;
                this.nome = nome;
                this.genero = genero;
                this.sinopse = sinopse;
                this.link = link;
        }
}
