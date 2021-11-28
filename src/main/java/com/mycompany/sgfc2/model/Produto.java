package com.mycompany.sgfc2.model;

public class Produto {

    private int id;
    private String nome;
    private float peso;
    private float preco;

    public Produto() {
    }

    public Produto(int id, String nome, float peso, float preco) {
        this.id = id;
        this.nome = nome;
        this.peso = peso;
        this.preco = preco;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

}
