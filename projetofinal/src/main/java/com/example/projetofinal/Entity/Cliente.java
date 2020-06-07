package com.example.projetofinal.Entity;

import javax.persistence.Entity;

import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;

@Entity
public class Cliente {
    private int Id;

    private String nome;

    // private List<datetime> horarios;

}