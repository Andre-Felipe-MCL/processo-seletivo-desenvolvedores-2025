package com.andre.carrinho.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;
//Jakarta Persistence (JPA) Importa anotações jpa usadas para mapear classes java em tabelas de banco de dados 

@Entity // Diz que a classe seá uma tabela no banco de dados 
public class ItemCarrinho {

    @Id //marca esse campo como chave primaria 
    @GeneratedValue(strategy = GenerationType.IDENTITY) // O valor é gerado automaticamente pelo banco
    private Long id; // Campo indentificador unico de cada item no carrinho

    @ManyToOne // Um item está relacionado a um único produto, mas um mesmo produto pode estar em vários itens.
    @JoinColumn(name = "produto_id") // Define o nome da coluna no banco que liga o item ao produto
    private Produto produto; // O produto associado ao respectivo item no carrinho

    private int quantidade; // Define a quantidade de produtos comprado nesse item 

    public ItemCarrinho(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
        // Recebe um produto e uma quantidade e os atribui ao objeto
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
        // Métodos públicos para acessar e alterar os campos produto e quantidade
    }

    public double calcularPreco() {
        return produto.getPreco() * quantidade;
        // Calcula o valor total desse item no carrinho
    }
}
