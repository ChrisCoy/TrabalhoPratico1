package com.mycompany.sgfc2.model;

public class Funcionario extends Pessoa {

    private String funcao;
    private int nivelPermissao;

    public Funcionario() {
    }

    public Funcionario(int id, String funcao, int nivelPermissao, String nome, String ctps, float salario) {
        super(nome, ctps, salario);
        this.funcao = funcao;
        this.nivelPermissao = nivelPermissao;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public int getNivelPermissao() {
        return nivelPermissao;
    }

    public void setNivelPermissao(int nivelPermissao) {
        this.nivelPermissao = nivelPermissao;
    }

}
