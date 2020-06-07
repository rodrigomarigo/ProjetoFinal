package com.example.projetofinal.Entity;

import java.util.List;

import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.UniqueConstraint;

import org.springframework.lang.NonNull;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

public class Funcionario {
    @Id
    @NonNull
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
    
    @NonNull
    private String nome;

    @ManyToMany
    @JoinTable(
        name = "SalaoFuncionario",
        uniqueConstraints = @UniqueConstraint (columnNames = { "id_salao", "id_funcionario" }),
        joinColumns        = @JoinColumn(name = "id_funcionario"), 
        inverseJoinColumns = @JoinColumn(name = "id_salao")
    )
    private List<Salao> saloes;

    @ManyToMany
    @JoinTable(
        name = "FuncionarioProcedimento",
        uniqueConstraints = @UniqueConstraint (columnNames = { "id_funcionario", "id_procedimento" }),
        joinColumns        = @JoinColumn(name = "id_funcionario"), 
        inverseJoinColumns = @JoinColumn(name = "id_procedimento")
    )
    private List<Procedimento> procedimentosRealizaveis;

    //horarios marcados
    @OneToMany
    @JoinColumn(name = "id_funcionario")
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