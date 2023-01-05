package padroescriacao;

public interface Setor {
    String receberReclamacao(String mensagem);
    String receberDenuncia(String mensagem);
    String receberElogio(String mensagem);
    String receberSugestao(String mensagem);
}
