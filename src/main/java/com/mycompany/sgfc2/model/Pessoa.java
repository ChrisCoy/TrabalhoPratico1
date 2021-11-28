package com.mycompany.sgfc2.model;

public abstract class Pessoa {

    private String nome;
    private String ctps;
    private float salario;

    public Pessoa() {
    }

    public Pessoa(String nome, String ctps, float salario) {
        this.nome = nome;
        this.ctps = ctps;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCtps() {
        return ctps;
    }

    public void setCtps(String ctps) {
        this.ctps = ctps;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

}
