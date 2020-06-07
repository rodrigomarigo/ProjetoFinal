package com.example.projetofinal.Entity;

import java.util.List;

public class Procedimento {
    private int id;

    private String nome;

    //armazena lista de funcionarios que realizam esse procedimento
    private List<Funcionario> funcionarios;

    //em minutos
    private int duracao;
}