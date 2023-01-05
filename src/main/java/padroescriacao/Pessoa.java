package padroescriacao;

public class Pessoa {

    public String elogiarCentroDeAtendimento(String mensagem) {
        return OuvidoriaCemig.getInstancia().receberElogioCentroDeAtendimento(mensagem);
    }

    public String reclamarCentroDeAtendimento(String mensagem) {
        return OuvidoriaCemig.getInstancia().receberReclamacaoCentroDeAtendimento(mensagem);
    }

    public String sugerirCentroDeAtendimento(String mensagem) {
        return OuvidoriaCemig.getInstancia().receberSugestaoCentroDeAtendimento(mensagem);
    }

    public String denunciarCentroDeAtendimento(String mensagem) {
        return OuvidoriaCemig.getInstancia().receberDenunciaCentroDeAtendimento(mensagem);
    }
}
