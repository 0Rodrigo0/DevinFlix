package DevinFlix.recomendacoes;

import DevinFlix.filmes.Filme;
import DevinFlix.usuarios.Usuario;

public class Recomendar {

    private Usuario usuario;
    private Usuario usuarioRecomendado;
    private Filme filme;
    private String textoIndicacao;

    public Recomendar(Usuario usuario, Usuario usuarioRecomendado, Filme filme, String textoIndicacao) {
        this.usuario = usuario;
        this.usuarioRecomendado = usuarioRecomendado;
        this.filme = filme;
        this.textoIndicacao = textoIndicacao;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Usuario getUsuarioRecomendado() {
        return usuarioRecomendado;
    }

    public void setUsuarioRecomendado(Usuario usuarioRecomendado) {
        this.usuarioRecomendado = usuarioRecomendado;
    }

    public Filme getFilme() {
        return filme;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }

    public String getTextoIndicacao() {
        return textoIndicacao;
    }

    public void setTextoIndicacao(String textoIndicacao) {
        this.textoIndicacao = textoIndicacao;
    }

    @Override
    public String toString() {
        return "Filme recomendado: " + filme.getNome()
                + " Texto: " + textoIndicacao
                + " Recomendado por " + usuario.getNome()
                + " para " + usuarioRecomendado.getNome() + "." + "\n"
                + "Filme recomendado " + filme.getRecomendado() + " vez(es)." + "\n"
                + "Curtido " + filme.getCurtiu() + " vez(es)." + " "
                + "Descurtido " + filme.getDescurtiu() + " vez(es).";
    }

}
