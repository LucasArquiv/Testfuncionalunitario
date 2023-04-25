# language: pt

# Os cenários descritos falam por si só, porém vou dar uma breve explicação:
#Nesse caso de teste foi escritos cenários onde o primeiro cenário serve como validador, o segundo
#serve como um clone descrito para negar uma ocorrência específica no cenário, o terceiro serve como negação de todos
#os passos descritos ele cenário exemplo quando trabalhando com vários cenários iguais que podem ocorrer erros.

@unitários
@cenarios
Funcionalidade: Aprender Cucumber

@Controle
  Cenário: Deve criar steps genéricos para estes passos
    Dado que o ticket é AF345
    E que o valor da passagem é R$ 230,45
    E que o nome do passageiro é "Fulano da Silva"
    E que o telefone do passageiro é 9999-9999
    Quando criar os steps
    Então o teste vai funcionar

@clone
  Cenário: Deve reaproveitar os steps "Dado" do cenário anterior
    Dado que o ticket é AB167
    Dado que o ticket especial é AB167
    Dado que o valor da passagem é R$ 1120,23
    Dado que o nome do passageiro é "Cicrano de Oliveira"
    Dado que o telefone do passageiro é 9888-8888

@Negacao
  Cenário: Deve negar todos os steps "Dado" dos cenários anteriores
    Dado que o ticket é CD123
    Dado que o ticket é AG1234
    Dado que o valor da passagem é R$ 1.1345,56
    Dado que o nome do passageiro é "Beltrano Souza Matos de Alcântara Azevedo"
    Dado que o telefone do passageiro é 1234-5678
    Dado que o telefone do passageiro é 999-2223
