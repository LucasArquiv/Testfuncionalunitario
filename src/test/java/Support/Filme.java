package Support;

public class Filme {

    //atribuido valor nas variaveis globais
    private int estoque;
    private int aluguel;

    // clsse de métodos usados em package LocadoraTeste para contagem de estoque
    public void setEstoque(int arg1) {
        this.estoque = arg1;
    }

    public void setAluguel(int arg1) {
        this.aluguel = arg1;
    }

    public int getAluguel() {
        return aluguel;
    }

    public int getEstoque() {
        return estoque;
    }
}
