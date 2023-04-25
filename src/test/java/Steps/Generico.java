package Steps;



import Runner.RunnerTest;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class Generico extends RunnerTest {

    @Dado("^que o ticket (especial)? é (A.\\d{3})$")
    public void queOTicketÉAF(String Tipo,String arg1) throws Throwable {
    }

    @Dado("^que o valor da passagem é R\\$ (\\d+),(\\d+)$")
    public void queOValorDaPassagemÉR$(int arg1, int arg2) throws Throwable {

    }

    @Dado("^que o nome do passageiro é \"(.{5,20})\"$")
    public void queONomeDoPassageiroÉ(String arg1) throws Throwable {

    }

    @Dado("^que o telefone do passageiro é (9\\d{3})-(\\d{4})$")
    public void queOTelefoneDoPassageiroÉ(String Telefone) throws Throwable {

    }

    @Quando("^criar os steps$")
    public void criarOsSteps() throws Throwable {

    }

    @Então("^o teste vai funcionar$")
    public void oTesteVaiFuncionar() throws Throwable {

    }


}