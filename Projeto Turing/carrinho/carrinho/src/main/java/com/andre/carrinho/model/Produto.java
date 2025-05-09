package com.andre.carrinho.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity // Diz que essa classe será uma tabela no banco ded dados 
public class Produto {

    @Id // Define qual será a chave primaria da tablea
    @GeneratedValue(strategy = GenerationType.IDENTITY) // O valor será gerado automaticamente no banco
    private Long id; // O campo long indentifica cada produto
    private String nome;
    private double preco;
    private String descricao;
    private String marca;

    public Produto() {
    }

    public Produto(String nome, double preco, String descricao, String marca) {
        this.nome = nome;
        this.preco = preco;
        this.descricao = descricao;
        this.marca = marca;
        //Consultor com parametros para criar objetos com valores definidos 
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
        // metodos para acessar e modificar o id 
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
        // acessa e modifica o nome do produto
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
        // acessa e modifica o preço 
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
        // acessa e modifica a descrição 
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
        // acessa e modifica a marca 
    }
}
