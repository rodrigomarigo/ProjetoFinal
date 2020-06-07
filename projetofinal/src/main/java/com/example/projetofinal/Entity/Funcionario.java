package com.example.projetofinal.Entity;

import java.util.List;

public class Funcionario {
    private int id;
    
    private String nome;

    private List<Salao> saloes;

    private List<Procedimento> procedimentosRealizaveis;

    //horarios marcados
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


    public List<Salao> getSaloes() {
        return this.saloes;
    }

    public void setSaloes(List<Salao> saloes) {
        this.saloes = saloes;
    }
    

    public List<Procedimento> getProcedimentosRealizaveis() {
        return this.procedimentosRealizaveis;
    }

    public void setProcedimentosRealizaveis(List<Procedimento> procedimentosRealizaveis) {
        this.procedimentosRealizaveis = procedimentosRealizaveis;
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
            ", saloes='" + getSaloes() + "'" +
            ", procedimentosRealizaveis='" + getProcedimentosRealizaveis() + "'" +
            ", horarios='" + getHorarios() + "'" +
            "}";
    }
    


}