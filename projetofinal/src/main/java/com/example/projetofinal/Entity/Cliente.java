package com.example.projetofinal.Entity;

import java.util.List;

import javax.persistence.Entity;

@Entity
public class Cliente {
    private int Id;

    private String nome;

    private List<Horario> horarios;

}