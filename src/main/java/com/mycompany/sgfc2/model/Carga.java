package com.mycompany.sgfc2.model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Carga {

    private int id;
    private ArrayList<NotaFiscal> notasFiscais;
    private Funcionario autorizadoPor;
    private Funcionario conferidoPor;
    private LocalDate dataAutorizacao;
    private LocalDate dataConferencia;

    public Carga() {
        notasFiscais = new ArrayList<>();
        autorizadoPor = new Funcionario();
        conferidoPor = new Funcionario();
    }

    public Carga(int id, ArrayList<NotaFiscal> notasFiscais, Funcionario autorizadoPor, Funcionario conferidoPor, LocalDate dataAutorizacao, LocalDate dataConferencia) {
        this.id = id;
        this.notasFiscais = notasFiscais;
        this.autorizadoPor = autorizadoPor;
        this.conferidoPor = conferidoPor;
        this.dataAutorizacao = dataAutorizacao;
        this.dataConferencia = dataConferencia;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<NotaFiscal> getNotasFiscais() {
        return notasFiscais;
    }

    public void setNotasFiscais(ArrayList<NotaFiscal> notasFiscais) {
        this.notasFiscais = notasFiscais;
    }

    public Funcionario getAutorizadoPor() {
        return autorizadoPor;
    }

    public void setAutorizadoPor(Funcionario autorizadoPor) {
        this.autorizadoPor = autorizadoPor;
    }

    public Funcionario getConferidoPor() {
        return conferidoPor;
    }

    public void setConferidoPor(Funcionario conferidoPor) {
        this.conferidoPor = conferidoPor;
    }

    public LocalDate getDataAutorizacao() {
        return dataAutorizacao;
    }

    public void setDataAutorizacao(LocalDate dataAutorizacao) {
        this.dataAutorizacao = dataAutorizacao;
    }

    public LocalDate getDataConferencia() {
        return dataConferencia;
    }

    public void setDataConferencia(LocalDate dataConferencia) {
        this.dataConferencia = dataConferencia;
    }

}
