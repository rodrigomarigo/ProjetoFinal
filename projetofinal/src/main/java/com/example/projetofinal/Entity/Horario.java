package com.example.projetofinal.Entity;

import java.sql.Time;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Horario {
    private int id;

    @ManyToOne
    @JoinColumn(name = "id_cliente")
    private Cliente cliente;

    private Funcionario funcionario;

    private Procedimento procedimento;

    @ManyToOne
    @JoinColumn(name = "id_salao")
    private Salao salao;

    private Time horario;


    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return this.cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Funcionario getFuncionario() {
        return this.funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Procedimento getProcedimento() {
        return this.procedimento;
    }

    public void setProcedimento(Procedimento procedimento) {
        this.procedimento = procedimento;
    }

    public Salao getSalao() {
        return this.salao;
    }

    public void setSalao(Salao salao) {
        this.salao = salao;
    }

    public Time getHorario() {
        return this.horario;
    }

    public void setHorario(Time horario) {
        this.horario = horario;
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", cliente='" + getCliente() + "'" +
            ", funcionario='" + getFuncionario() + "'" +
            ", procedimento='" + getProcedimento() + "'" +
            ", salao='" + getSalao() + "'" +
            ", horario='" + getHorario() + "'" +
            "}";
    }

}