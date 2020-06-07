package com.example.projetofinal.Entity;

import java.util.List;

public class Salao {
    private int id;

    private String nome;

    private List<Funcionario> funcionarios;

    private List<Horario> horarios;


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

    public List<Horario> getHorarios() {
        return this.horarios;
    }

    public void setHorarios(List<Horario> horarios) {
        this.horarios = horarios;
    }


    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", nome='" + getNome() + "'" +
            ", funcionarios='" + getFuncionarios() + "'" +
            ", horarios='" + getHorarios() + "'" +
            "}";
    }


}