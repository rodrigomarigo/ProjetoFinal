package com.example.projetofinal.Entity;

import java.util.List;

public class Funcionario {
    private int id;
    
    private String nome;

    private Salao salao;

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

    public Salao getSalao() {
        return this.salao;
    }

    public void setSalao(Salao salao) {
        this.salao = salao;
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
            ", salao='" + getSalao() + "'" +
            ", procedimentosRealizaveis='" + getProcedimentosRealizaveis() + "'" +
            ", horarios='" + getHorarios() + "'" +
            "}";
    }


}