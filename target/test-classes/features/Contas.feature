# language: pt

  # Cenario imperativo
  # Cenários com teste funcionais. onde será definido a integração do usuário
  #Com a aplicação.
@Funcionais
  Funcionalidade: Vamos fazer teste web
    usando selenium webdriver
    com cenário de criação de uma conta.
    Como um usuário
    gostaria de cadastrar contas
    para que eu possa distribuir meu dinheiro de uma forma mais organizada

    Contexto:
      Dado que estou acessando a aplicação
      Quando informo o usuário "Contateste@gmail.com"
      E a senha "senha"
      E seleciono entrar
      Então visualizo a página inicial
      Quando seleciono Contas
      E seleciono Adicionar

    Esquema do Cenário: deve validar regras cadastro de contas
    Quando informo a conta "<conta>"
    E seleciono Salvar
    Entao Recebo a mensagem "<mensagem>"

    Exemplos:
      | conta            | mensagem                          |
      | conta de teste   | Conta adicionada com sucesso!     |
      |                  | Informe o nome da conta           |
      | Conta mesmo nome | Já existe uma conta com esse nome!|

