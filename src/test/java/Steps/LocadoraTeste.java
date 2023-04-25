package Steps;

import Runner.RunnerTest;
import Runner.TipoAluguel;
import Support.AluguelService;
import Support.Filme;
import Support.NotaAluguel;
import Support.Utils;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import io.cucumber.datatable.DataTable;
import org.junit.Assert;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import java.util.Date;
import java.util.Map;

public class LocadoraTeste extends RunnerTest {
    //variaveis global
    private Filme filme;
    private AluguelService aluguel = new AluguelService();
    private NotaAluguel nota;
    private String erro;

    private TipoAluguel tipoAlugel;

    @Dado("^um filme com estoque de (\\d+) unidades$")
    public void umFilmeComEstoqueDeUnidades(int arg1) {
        //inicializando classe Filme informando qual a quantidade que está no estoque
        filme = new Filme();
        //setando atributo Filme
        filme.setEstoque(arg1);
    }

    @Dado("^que preço de aluguel seja R\\$ (\\d+)$")
    public void quePreçoDeAluguelSejaR$(int arg1) {
        filme.setAluguel(arg1);
    }

    @Dado("^um filme$")
    public void umFilme(DataTable table) {
        Map<String, String> map = table.asMap(String.class, String.class);
        //inicializando classe Filme informando qual a quantidade que está no estoque
        filme = new Filme();
        //setando atributo Filme
        filme.setEstoque(Integer.parseInt(map.get("estoque")));
        filme.setAluguel(Integer.parseInt(map.get("preco")));
        String tipo = map.get("tipo");
        tipoAlugel = tipo.equals("semanal")? TipoAluguel.SEMANAL:
        tipo.equals("estendido")? tipoAlugel.ESTENDIDO:
        tipoAlugel.COMUM;
    }

    @Quando("^alugar$")
    public void alugar() throws Throwable {
        try {
            // Metod que verifica a quantidade no estoque, e o tipo de aluguel
            nota = aluguel.alugar(filme, tipoAlugel);
        }catch (RuntimeException e) {
        erro = e.getMessage();
        }
    }

    @Então("^o preço do aluguel será R\\$ (\\d+)$")
    public void oPreçoDoAlugeulSeráR$(int arg1){
        Assert.assertEquals(arg1,nota.getPreco());
    }

    @Então("^o estoque do filme será de (\\d+) unidade$")
    public void oEstoqueDoFilmeSeráDeUnidade(int arg1) {
        Assert.assertEquals(arg1, filme.getEstoque());
    }

    // Cenário @NaoAlugar
    @Então("não será possível por falta de estoque")
    public void nãoSeráPossívelPorFaltaDeEstoque() {
        Assert.assertEquals("Estoque indisponível", erro);
    }


    // Cenario @Cindicao
    @Dado("que o tipo do aluguel seja (.*)$")

    public void queOTipoDoAluguelSejaEstendido( String tipo) {
    tipoAlugel = tipo.equals("semanal")? TipoAluguel.SEMANAL:
    tipo.equals("estendido")? tipoAlugel.ESTENDIDO:
    tipoAlugel.COMUM;
    }

    //Reutilizando cenário apenas mudando a forma de redefinição. mudando "dia" para "dias",
    //deixando "s" opcional com dias?.
    @Então("a data de entrega será em (\\d+) dias?$")
    public void aDataDeEntregaSeráEmDias(int arg1) {
    Date dataEsperada = Utils.obterDataDiferencaDias(arg1);
    Date dataReal = nota.getDataEntrega();

        DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
    // formatando a data para dia/mes/ano
    Assert.assertEquals(format.format(dataEsperada), format.format(dataReal));
    }
    //Reutilizando cenário apenas mudando a forma de redefinição. mudando "ponto" para "pontos",
    //deixando "s" opcional com pontos?.
    @Então("a pontuação será de (\\d+) pontos?$")
    public void aPontuaçãoSeráDePontos(int  arg1) {
    Assert.assertEquals(arg1, nota.getPontuacao());
    }

}
