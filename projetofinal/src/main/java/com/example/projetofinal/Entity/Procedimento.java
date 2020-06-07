package com.example.projetofinal.Entity;

import java.util.List;

public class Procedimento {
    private int id;

    private String nome;

    //armazena lista de funcionarios que realizam esse procedimento
    private List<Funcionario> funcionarios;

    //em minutos
    private int duracao;


    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Funcionario> getFuncionarios() {
        return this.funcionarios;
    }

    public void setFuncionarios(List<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }

    public int getDuracao() {
        return this.duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }


    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", nome='" + getNome() + "'" +
            ", funcionarios='" + getFuncionarios() + "'" +
            ", duracao='" + getDuracao() + "'" +
            "}";
    }

}