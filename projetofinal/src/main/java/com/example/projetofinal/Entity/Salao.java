package com.example.projetofinal.Entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.UniqueConstraint;

import org.springframework.lang.NonNull;

public class Salao implements Serializable{
    private static final long serialVersionUID = 1L;

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
        joinColumns        = @JoinColumn(name = "id_salao"), 
        inverseJoinColumns = @JoinColumn(name = "id_funcionario")
    )
    private List<Funcionario> funcionarios;

    @OneToMany
    @JoinColumn(name = "id_salao")
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