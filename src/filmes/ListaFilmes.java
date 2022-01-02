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

        public String getId() {
                return id;
        }

        public void setId(String id) {
                this.id = id;
        }

        public String getNome() {
                return nome;
        }

        public void setNome(String nome) {
                this.nome = nome;
        }

        public String getGenero() {
                return genero;
        }

        public void setGenero(String genero) {
                this.genero = genero;
        }

        public String getSinopse() {
                return sinopse;
        }

        public void setSinopse(String sinopse) {
                this.sinopse = sinopse;
        }

        public String getLink() {
                return link;
        }

        public void setLink(String link) {
                this.link = link;
        }

}
