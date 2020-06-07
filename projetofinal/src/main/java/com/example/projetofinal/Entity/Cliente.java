package com.example.projetofinal.Entity;

import java.util.List;

import javax.persistence.Entity;

@Entity
public class Cliente {
    private int Id;

    private String nome;

    private List<Horario> horarios;


    public int getId() {
        return this.Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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
            " Id='" + getId() + "'" +
            ", nome='" + getNome() + "'" +
            ", horarios='" + getHorarios() + "'" +
            "}";
    }


}