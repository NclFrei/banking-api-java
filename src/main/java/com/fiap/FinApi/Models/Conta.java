package com.fiap.FinApi.Models;

import java.sql.Date;
import java.time.LocalDateTime;
import java.util.Random;

public class Conta {
    private Long id;
    private String agencia;
    private String name;
    private String cpf;
    private LocalDateTime date;
    private Double saldoInicial;
    private int ativa;
    private Tipo tipo;

    public Conta(Long id, String name, String agencia, String cpf, Date date, Double saldoInicial, int ativa,
            Tipo tipo) {
        this.id = Math.abs(new Random().nextLong());
        this.name = name;
        this.agencia = agencia;
        this.cpf = cpf;
        this.date = LocalDateTime.now();
        this.saldoInicial = saldoInicial;
        this.ativa = 1;
        this.tipo = tipo;

    }

    public Long getId() {
        return id;
    }

    public String getAgencia() {
        return agencia;
    }

    public String getName() {
        return name;
    }

    public String getCpf() {
        return cpf;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public Double getSaldoInicial() {
        return saldoInicial;
    }

    public int getAtiva() {
        return ativa;
    }

    public Tipo getTipo() {
        return tipo;
    }

}
