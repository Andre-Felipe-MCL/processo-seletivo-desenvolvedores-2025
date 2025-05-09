package com.andre.carrinho.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.andre.carrinho.model.Carrinho;
import com.andre.carrinho.service.CarrinhoService;


@RestController
@RequestMapping("/carrinho")
public class CarrinhoController {

    @Autowired
    private CarrinhoService CarrinhoService;

    @PostMapping("/addProduto/{id}")
    public void adicionarProduto(@PathVariable Long id, @RequestParam int quantidade) {

    }

    @DeleteMapping("/removerProduto/{id}")
    public void removerProduto(@PathVariable Long id, @RequestParam int quantidade) {
    }

    @DeleteMapping("/limpar")
    public void limparCarrinho() {
    }

    @GetMapping("/mostrar")
    public Carrinho mostrarCarrinho() {
        return null;
    }
}