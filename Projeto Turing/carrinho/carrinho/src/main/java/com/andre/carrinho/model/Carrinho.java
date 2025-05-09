package com.andre.carrinho.model;

import java.util.ArrayList;
import java.util.List;
// importa classes da java collection framework
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
// Importa anotações jpa usadas para mapear classes java em tabelas de banco de dados 

    @Entity //Diz que essa classe será uma tabela no banco
public class Carrinho {

    @Id // Marca o atributo que é a chave primaria da tabela
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Define como o valor da chave será gerado nesse caso automaticamente 
    private Long id; //atributo que representa o indentificador unico do carrinho
    private double precoTotal; // Armazena o preço total dos itens dentro do Carrinho

    @OneToMany //indica que um carrinho pode ter varios itens
    private List<ItemCarrinho> itens = new ArrayList<>(); // Lista que armazena todos os itens do cariinho

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    // metodo para acessar e modificar o Id do carrinho
    public double getPrecoTotal() {
        return precoTotal;
    }

    public void setPrecoTotal(double precoTotal) {
        this.precoTotal = precoTotal;
    }
    // metodo para acessar e modificar o preço total do carrinho
    public List<ItemCarrinho> getItens() {
        return itens;
    }

    public void setItens(List<ItemCarrinho> itens) {
        this.itens = itens;
    }
    // metodo para acessar e modificar a lista de itens do carrinho 
}

