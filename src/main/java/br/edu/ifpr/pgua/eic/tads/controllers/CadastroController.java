package br.edu.ifpr.pgua.eic.tads.controllers;

import java.util.Map;
import java.util.HashMap;

import io.javalin.http.Context;
import io.javalin.http.Handler;

public class CadastroController {
    
  private Cadastro cadastro;

    public Handler get = (Context ctx)->{
        ctx.render("cadastro.html");
    };

    public Handler post = (Context ctx)->{
      String nome = ctx.formParam("nome");
      String cpf = ctx.formParam("cpf");

      Map<String,Object> dados = new HashMap<>();

      dados.put("nome",nome);
      dados.put("cpf",cpf);

      ctx.render("resposta.html",dados);
    };
}