package com.projeto.teste.controller;


import com.projeto.teste.model.Cliente;
import com.projeto.teste.model.Produto;
import com.projeto.teste.service.Projeto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ProjetoController{
    @Autowired
    private Projeto service;
    @GetMapping("/")
    public String index(){
        return "index";
    }
    @GetMapping("/produtosCadastrados")
    public String i(){
        return "produtos";
    }

    @GetMapping(value="/cadastrarProduto")
    public String exibirForm(Produto produto){
        return "formProduto";
    }

    @PostMapping(value="/salvarProduto")
    public String salvarProduto(Produto produto){
        service.sProduto(produto);
        return "index";
    }

    @GetMapping(value="/cadastrarCliente")
    public String exibirFormCliente(Cliente cliente){
        return "formCliente";
    }

    @PostMapping(value="/salvarCliente")
    public String salvarCliente(Cliente cliente){
        service.sCliente(cliente);
        return "index";
    }
}