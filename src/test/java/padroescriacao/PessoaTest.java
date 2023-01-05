package padroescriacao;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PessoaTest {
    Cliente cliente ;
    Funcionario funcionario;
    @BeforeEach
    void setUp() {
      cliente = new Cliente();
      funcionario = new Funcionario();
    }

    @AfterEach
    void tearDown() {
        cliente = null;
        funcionario = null;
    }

    @Test
    void deveElogiarCliente(){
        assertEquals("A Ouvidoria Cemig agradece seu contato.\n" +
                        "O Centro de atendimento Cemig respondeu sua demanda conforme mensagem a seguir.\n" +
                        ">>A Cemig agradece a mensagem de elogio: Ótimo atendimento",
                cliente.elogiarCentroDeAtendimento("Ótimo atendimento"));
    }

    @Test
    void deveReclamarCliente(){
        assertEquals("A Ouvidoria Cemig agradece seu contato.\n" +
                        "O Centro de atendimento Cemig respondeu sua demanda conforme mensagem a seguir.\n" +
                        ">>A Cemig vai procurar melhorar o serviço da reclamação: Lentidão no atendimento por falta de energia",
                cliente.reclamarCentroDeAtendimento("Lentidão no atendimento por falta de energia"));

    }

    @Test
    void deveDenunciarFuncionario(){
        assertEquals("A Ouvidoria Cemig agradece seu contato.\n" +
                        "O Centro de atendimento Cemig respondeu sua demanda conforme mensagem a seguir.\n" +
                        ">>A Cemig vai analisar a sua denuncia: Furto de materiais em depósito",
                funcionario.denunciarCentroDeAtendimento("Furto de materiais em depósito"));
    }
    @Test
    void deveSugerirSecretaria(){
        assertEquals("A Ouvidoria Cemig agradece seu contato.\n" +
                        "O Centro de atendimento Cemig respondeu sua demanda conforme mensagem a seguir.\n" +
                        ">>A Cemig vai analisar a sua sugestão: Leitura de medidor rural via WhatsApp",
                cliente.sugerirCentroDeAtendimento("Leitura de medidor rural via WhatsApp"));

    }























}