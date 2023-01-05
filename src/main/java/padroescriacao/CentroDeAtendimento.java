package padroescriacao;

public class CentroDeAtendimento implements Setor {

    private static CentroDeAtendimento instancia = new CentroDeAtendimento();

    private CentroDeAtendimento() {}

    public static CentroDeAtendimento getInstancia() {
        return instancia;
    }

    @Override
    public String receberReclamacao(String mensagem) {
        return "A Cemig vai procurar melhorar o serviço da reclamação: " + mensagem;
    }

    @Override
    public String receberDenuncia(String mensagem) {
        return "A Cemig vai analisar a sua denuncia: " + mensagem;
    }

    @Override
    public String receberElogio(String mensagem) {
        return "A Cemig agradece a mensagem de elogio: " + mensagem;
    }

    @Override
    public String receberSugestao(String mensagem) {
        return "A Cemig vai analisar a sua sugestão: " + mensagem;
    }
}
