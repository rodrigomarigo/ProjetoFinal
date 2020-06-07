package com.example.projetofinal.Entity;

import java.sql.Time;

import javax.persistence.Entity;

@Entity
public class Horario {
    private int id;

    private Cliente cliente;

    private Funcionario funcionario;

    private Procedimento procedimento;

    private Salao salao;

    private Time horario;
}