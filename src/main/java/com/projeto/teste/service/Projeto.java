package com.projeto.teste.service;

import com.projeto.teste.model.Cliente;
import com.projeto.teste.model.Produto;
import com.projeto.teste.repository.ClienteRepository;
import com.projeto.teste.repository.ProdutoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class Projeto{
    @Autowired
    private ClienteRepository repo;
    @Autowired
    private ProdutoRepository repoP;

    public void sCliente(Cliente cliente){
        repo.saveAndFlush(cliente);
    }

    public void sProduto(Produto produto){
        repoP.saveAndFlush(produto);
    }
}