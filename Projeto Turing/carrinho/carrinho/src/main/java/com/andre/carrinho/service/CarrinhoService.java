package com.andre.carrinho.service;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.andre.carrinho.model.Carrinho;
import com.andre.carrinho.model.ItemCarrinho;
import com.andre.carrinho.repository.CarrinhoRepository;

@Service
public class CarrinhoService {

    @Autowired
    private CarrinhoRepository carrinhoRepository;

    public Carrinho criarCarrinho() {
        Carrinho carrinho = new Carrinho();
        return carrinhoRepository.save(carrinho);
    }

    public void adicionarProduto(Carrinho carrinho, ItemCarrinho itemCarrinho) {
        carrinho.getItens().add(itemCarrinho);
        carrinho.setPrecoTotal(calcularPrecoTotal(carrinho));
        carrinhoRepository.save(carrinho);
    }

    public void removerProduto(Carrinho carrinho, ItemCarrinho itemCarrinho) {
        carrinho.getItens().remove(itemCarrinho);
        carrinho.setPrecoTotal(calcularPrecoTotal(carrinho));
        carrinhoRepository.save(carrinho);
    }
    public void limparCarrinho(Carrinho carrinho) {
        carrinho.getItens().clear();
        carrinho.setPrecoTotal(0);
        carrinhoRepository.save(carrinho);
    }

    public double calcularPrecoTotal(Carrinho carrinho) {
        return carrinho.getItens().stream()
            .mapToDouble(ItemCarrinho::calcularPreco)
            .sum();
    }

    public Optional<Carrinho> buscarCarrinho(Long id) {
        return carrinhoRepository.findById(id);
    }
}