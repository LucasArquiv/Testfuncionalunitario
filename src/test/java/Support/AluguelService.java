package Support;

import Runner.TipoAluguel;


public class AluguelService {
    // clss de métodos usados em package LocadoraTeste para valores de aluguel de filme
    public NotaAluguel alugar(Filme filme, TipoAluguel tipo) {
        // Criada uma excesão quando for igual a 0
        if(filme.getEstoque() == 0)
            throw new RuntimeException("Estoque indisponível");

        NotaAluguel nota = new NotaAluguel();
        switch (tipo){
            case COMUM:
                nota.setPreco(filme.getAluguel());
                nota.setDataEntrega(Utils.obterDataDiferencaDias(1));
                nota.setPontuacao(1);
                break;
            case ESTENDIDO:
                nota.setPreco(filme.getAluguel() * 2);
                nota.setDataEntrega(Utils.obterDataDiferencaDias(3));
                nota.setPontuacao(2);
                break;
            case SEMANAL:
                nota.setPreco(filme.getAluguel() * 3);
                nota.setDataEntrega(Utils.obterDataDiferencaDias(7));
                nota.setPontuacao(3);
                break;
        }
        filme.setEstoque(filme.getEstoque() -1);
        return nota;
    }
}
