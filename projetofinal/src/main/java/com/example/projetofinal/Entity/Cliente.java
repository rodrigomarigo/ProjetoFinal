package com.example.projetofinal.Entity;

import java.sql.Time;
import java.util.List;

import javax.persistence.Entity;

@Entity
public class Cliente {
    private int Id;

    private String nome;

    private List<Time> horarios;

}