package com.mycompany.sgfc2.model;

public class Endereco {

    private int id;
    private String rua;
    private String municipio;
    private String bairro;
    private String estado;
    private String numero;
    private String cep;

    public Endereco() {

    }

    public Endereco(int id, String rua, String municipio, String bairro, String estado, String numero, String cep) {
        this.id = id;
        this.rua = rua;
        this.municipio = municipio;
        this.bairro = bairro;
        this.estado = estado;
        this.numero = numero;
        this.cep = cep;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

}
