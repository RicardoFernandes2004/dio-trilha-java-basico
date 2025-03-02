package com.dio.ContaBanco.Models;

public class User {
    private String nomeCliente;
    private Integer numeroConta;
    private String agencia;
    private double saldo = 0;

    public User(String nomeCliente, Integer numeroConta, String agencia) {
        this.nomeCliente = nomeCliente;
        this.numeroConta = numeroConta;
        this.agencia = agencia;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public Integer getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(Integer numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void pagar(int valor){
        if ((saldo - valor) <= 0){
            System.out.println("Saldo Insuficiente");
        } else {
            this.saldo = this.saldo - valor;
            System.out.println("Novo saldo ="+this.saldo);
        }
    }
    public void receba(int valor){
        this.saldo = this.saldo+valor;
    }
}
