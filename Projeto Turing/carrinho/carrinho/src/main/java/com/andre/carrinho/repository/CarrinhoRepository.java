package com.andre.carrinho.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.andre.carrinho.model.Carrinho;


public interface CarrinhoRepository extends JpaRepository<Carrinho, Long> {
}