package com.andre.carrinho.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.andre.carrinho.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
