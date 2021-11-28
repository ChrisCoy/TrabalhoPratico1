package com.mycompany.sgfc2.model;

import java.time.LocalDate;
import java.util.ArrayList;

public class NotaFiscal {

    private int numero;
    private ArrayList<Produto> produtos;
    private Endereco origem;
    private Endereco destino;
    private LocalDate dataExpedicao;
    private LocalDate dataEntrega;
    private Funcionario funcionario;

    public NotaFiscal() {
        produtos = new ArrayList<>();
        origem = new Endereco();
        destino = new Endereco();
        funcionario = new Funcionario();
    }

    public NotaFiscal(int numero, ArrayList<Produto> produtos, Endereco origem, Endereco destino, LocalDate dataExpedicao, LocalDate dataEnrega, Funcionario funcionario) {
        this.numero = numero;
        this.produtos = produtos;
        this.origem = origem;
        this.destino = destino;
        this.dataExpedicao = dataExpedicao;
        this.dataEntrega = dataEnrega;
        this.funcionario = funcionario;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(ArrayList<Produto> produtos) {
        this.produtos = produtos;
    }

    public Endereco getOrigem() {
        return origem;
    }

    public void setOrigem(Endereco origem) {
        this.origem = origem;
    }

    public Endereco getDestino() {
        return destino;
    }

    public void setDestino(Endereco destino) {
        this.destino = destino;
    }

    public LocalDate getDataExpedicao() {
        return dataExpedicao;
    }

    public void setDataExpedicao(LocalDate dataExpedicao) {
        this.dataExpedicao = dataExpedicao;
    }

    public LocalDate getDataEntrega() {
        return dataEntrega;
    }

    public void setDataEntrega(LocalDate dataEntrega) {
        this.dataEntrega = dataEntrega;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

}
