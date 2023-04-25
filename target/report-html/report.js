$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Contas.feature");
formatter.feature({
  "name": "Vamos fazer teste web",
  "description": "    usando selenium webdriver\n    com cenário de criação de uma conta.\n    Como um usuário\n    gostaria de cadastrar contas\n    para que eu possa distribuir meu dinheiro de uma forma mais organizada",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "name": "@Funcionais"
    }
  ]
});
formatter.scenarioOutline({
  "name": "deve validar regras cadastro de contas",
  "description": "",
  "keyword": "Esquema do Cenário"
});
formatter.step({
  "name": "informo a conta \"\u003cconta\u003e\"",
  "keyword": "Quando "
});
formatter.step({
  "name": "seleciono Salvar",
  "keyword": "E "
});
formatter.step({
  "name": "Recebo a mensagem \"\u003cmensagem\u003e\"",
  "keyword": "Entao "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Exemplos",
  "rows": [
    {
      "cells": [
        "conta",
        "mensagem"
      ]
    },
    {
      "cells": [
        "conta de teste",
        "Conta adicionada com sucesso!"
      ]
    },
    {
      "cells": [
        "",
        "Informe o nome da conta"
      ]
    },
    {
      "cells": [
        "Conta mesmo nome",
        "Já existe uma conta com esse nome!"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Contexto"
});
formatter.step({
  "name": "que estou acessando a aplicação",
  "keyword": "Dado "
});
formatter.match({
  "location": "InserirConta.queEstouAcessandoAAplicação()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "informo o usuário \"Contateste@gmail.com\"",
  "keyword": "Quando "
});
formatter.match({
  "location": "InserirConta.informoOUsuário(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "a senha \"senha\"",
  "keyword": "E "
});
formatter.match({
  "location": "InserirConta.aSenha(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "seleciono entrar",
  "keyword": "E "
});
formatter.match({
  "location": "InserirConta.selecionoEntrar()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "visualizo a página inicial",
  "keyword": "Então "
});
formatter.match({
  "location": "InserirConta.visualizoAPáginaInicial()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "seleciono Contas",
  "keyword": "Quando "
});
formatter.match({
  "location": "InserirConta.selecionoContas()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "seleciono Adicionar",
  "keyword": "E "
});
formatter.match({
  "location": "InserirConta.selecionoAdicionar()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "deve validar regras cadastro de contas",
  "description": "",
  "keyword": "Esquema do Cenário",
  "tags": [
    {
      "name": "@Funcionais"
    }
  ]
});
formatter.step({
  "name": "informo a conta \"conta de teste\"",
  "keyword": "Quando "
});
formatter.match({
  "location": "InserirConta.informoAConta(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "seleciono Salvar",
  "keyword": "E "
});
formatter.match({
  "location": "InserirConta.selecionoSalvar()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Recebo a mensagem \"Conta adicionada com sucesso!\"",
  "keyword": "Entao "
});
formatter.match({
  "location": "InserirConta.receboAMensagem(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Contexto"
});
formatter.step({
  "name": "que estou acessando a aplicação",
  "keyword": "Dado "
});
formatter.match({
  "location": "InserirConta.queEstouAcessandoAAplicação()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "informo o usuário \"Contateste@gmail.com\"",
  "keyword": "Quando "
});
formatter.match({
  "location": "InserirConta.informoOUsuário(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "a senha \"senha\"",
  "keyword": "E "
});
formatter.match({
  "location": "InserirConta.aSenha(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "seleciono entrar",
  "keyword": "E "
});
formatter.match({
  "location": "InserirConta.selecionoEntrar()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "visualizo a página inicial",
  "keyword": "Então "
});
formatter.match({
  "location": "InserirConta.visualizoAPáginaInicial()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "seleciono Contas",
  "keyword": "Quando "
});
formatter.match({
  "location": "InserirConta.selecionoContas()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "seleciono Adicionar",
  "keyword": "E "
});
formatter.match({
  "location": "InserirConta.selecionoAdicionar()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "deve validar regras cadastro de contas",
  "description": "",
  "keyword": "Esquema do Cenário",
  "tags": [
    {
      "name": "@Funcionais"
    }
  ]
});
formatter.step({
  "name": "informo a conta \"\"",
  "keyword": "Quando "
});
formatter.match({
  "location": "InserirConta.informoAConta(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "seleciono Salvar",
  "keyword": "E "
});
formatter.match({
  "location": "InserirConta.selecionoSalvar()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Recebo a mensagem \"Informe o nome da conta\"",
  "keyword": "Entao "
});
formatter.match({
  "location": "InserirConta.receboAMensagem(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Contexto"
});
formatter.step({
  "name": "que estou acessando a aplicação",
  "keyword": "Dado "
});
formatter.match({
  "location": "InserirConta.queEstouAcessandoAAplicação()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "informo o usuário \"Contateste@gmail.com\"",
  "keyword": "Quando "
});
formatter.match({
  "location": "InserirConta.informoOUsuário(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "a senha \"senha\"",
  "keyword": "E "
});
formatter.match({
  "location": "InserirConta.aSenha(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "seleciono entrar",
  "keyword": "E "
});
formatter.match({
  "location": "InserirConta.selecionoEntrar()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "visualizo a página inicial",
  "keyword": "Então "
});
formatter.match({
  "location": "InserirConta.visualizoAPáginaInicial()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "seleciono Contas",
  "keyword": "Quando "
});
formatter.match({
  "location": "InserirConta.selecionoContas()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "seleciono Adicionar",
  "keyword": "E "
});
formatter.match({
  "location": "InserirConta.selecionoAdicionar()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "deve validar regras cadastro de contas",
  "description": "",
  "keyword": "Esquema do Cenário",
  "tags": [
    {
      "name": "@Funcionais"
    }
  ]
});
formatter.step({
  "name": "informo a conta \"Conta mesmo nome\"",
  "keyword": "Quando "
});
formatter.match({
  "location": "InserirConta.informoAConta(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "seleciono Salvar",
  "keyword": "E "
});
formatter.match({
  "location": "InserirConta.selecionoSalvar()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Recebo a mensagem \"Já existe uma conta com esse nome!\"",
  "keyword": "Entao "
});
formatter.match({
  "location": "InserirConta.receboAMensagem(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});