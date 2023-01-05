package padroescriacao;

public class OuvidoriaCemig {

    private static OuvidoriaCemig instancia = new OuvidoriaCemig();

    private OuvidoriaCemig() {}

    public static OuvidoriaCemig getInstancia() {
        return instancia;
    }

    public String receberElogioCentroDeAtendimento(String mensagem) {
        return "A Ouvidoria Cemig agradece seu contato.\n"+
                "O Centro de atendimento Cemig respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>" + CentroDeAtendimento.getInstancia().receberElogio(mensagem);
    }

    public String receberReclamacaoCentroDeAtendimento(String mensagem) {
        return "A Ouvidoria Cemig agradece seu contato.\n"+
                "O Centro de atendimento Cemig respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>" + CentroDeAtendimento.getInstancia().receberReclamacao(mensagem);
    }

    public String receberSugestaoCentroDeAtendimento(String mensagem) {
        return "A Ouvidoria Cemig agradece seu contato.\n"+
                "O Centro de atendimento Cemig respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>" + CentroDeAtendimento.getInstancia().receberSugestao(mensagem);
    }


    public String receberDenunciaCentroDeAtendimento(String mensagem) {
        return "A Ouvidoria Cemig agradece seu contato.\n"+
                "O Centro de atendimento Cemig respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>" + CentroDeAtendimento.getInstancia().receberDenuncia(mensagem);
    }
}
