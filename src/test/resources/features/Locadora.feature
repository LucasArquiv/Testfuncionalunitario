# language: pt
@unitários
    Funcionalidade: Teste de locação de filmes
      como um usário eu quero cadastrar
      alugueis de filmes para controlar
      preços e datas de entrega

      Cenário: Deve alugar um filme com sucesso
        Dado um filme
        | estoque |  2   |
        | preco   |  3   |
        | tipo    | comum|
        Quando alugar
        Então o preço do aluguel será R$ 3
        E a data de entrega será em 1 dia
        E o estoque do filme será de 1 unidade

      Cenário: Não deve alugar filme sem estoque
        Dado um filme com estoque de 0 unidades
        Quando alugar
        Então não será possível por falta de estoque
        E o estoque do filme será de 0 unidade

     Esquema do Cenário: Deve dar condições conforme o tipo do aluguel
        Dado um filme com estoque de 2 unidades
        E que preço de aluguel seja R$ <preco>
        E que o tipo do aluguel seja <tipo>
        Quando alugar
        Então o preço do aluguel será R$ <valor>
        E a data de entrega será em <qtdias> dias
        E a pontuação será de <pontuacao> pontos

  Exemplos:
  | preco |       tipo     | valor | qtdias | pontuacao |
  |   4   |    estendido   |   8   |    3   |     2     |
  |   4   |    comum       |   4   |    1   |     1     |
  |   5   |    semanal     |   15  |    7   |     3     |
