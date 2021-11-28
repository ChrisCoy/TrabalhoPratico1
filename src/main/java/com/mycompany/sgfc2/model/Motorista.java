package com.mycompany.sgfc2.model;

import java.time.LocalDate;

public class Motorista extends Pessoa {

    private String cnh;
    private String tipoCarteira;
    private LocalDate dataValidade;

    public Motorista() {
    }

    public Motorista(String cnh, String tipoCarteira, LocalDate dataValidade, String nome, String ctps, float salario) {
        super(nome, ctps, salario);
        this.cnh = cnh;
        this.tipoCarteira = tipoCarteira;
        this.dataValidade = dataValidade;
    }

    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }

    public String getTipoCarteira() {
        return tipoCarteira;
    }

    public void setTipoCarteira(String tipoCarteira) {
        this.tipoCarteira = tipoCarteira;
    }

    public LocalDate getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(LocalDate dataValidade) {
        this.dataValidade = dataValidade;
    }

}
