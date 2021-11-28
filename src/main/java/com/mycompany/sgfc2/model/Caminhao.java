package com.mycompany.sgfc2.model;

import java.time.LocalDate;

public class Caminhao {

    private int id;
    private String marca;
    private int anoModelo;
    private int quilometragem;
    private float capacidadeCarga;
    private LocalDate ultimaRevisao;
    private Motorista motorista;
    private boolean disponivel;
    private Carga carga;

    public Caminhao() {
        motorista = new Motorista();
    }

    public Caminhao(int id, String marca, int anoModelo, int quilometragem, float capacidadeCarga, LocalDate ultimaRevisao, Motorista motorista, boolean disponivel, Carga carga) {
        this.id = id;
        this.marca = marca;
        this.anoModelo = anoModelo;
        this.quilometragem = quilometragem;
        this.capacidadeCarga = capacidadeCarga;
        this.ultimaRevisao = ultimaRevisao;
        this.motorista = motorista;
        this.disponivel = disponivel;
        this.carga = carga;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAnoModelo() {
        return anoModelo;
    }

    public void setAnoModelo(int anoModelo) {
        this.anoModelo = anoModelo;
    }

    public int getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(int quilometragem) {
        this.quilometragem = quilometragem;
    }

    public float getCapacidadeCarga() {
        return capacidadeCarga;
    }

    public void setCapacidadeCarga(float capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }

    public LocalDate getUltimaRevisao() {
        return ultimaRevisao;
    }

    public void setUltimaRevisao(LocalDate ultimaRevisao) {
        this.ultimaRevisao = ultimaRevisao;
    }

    public Motorista getMotorista() {
        return motorista;
    }

    public void setMotorista(Motorista motorista) {
        this.motorista = motorista;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public Carga getCarga() {
        return carga;
    }

    public void setCarga(Carga carga) {
        this.carga = carga;
    }

}
