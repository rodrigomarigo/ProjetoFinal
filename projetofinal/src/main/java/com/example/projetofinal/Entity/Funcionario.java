package com.example.projetofinal.Entity;

import java.sql.Time;
import java.util.List;

public class Funcionario {
    private int id;
    
    private String nome;

    private Salao salao;

    private List<Procedimento> procedimentosRealizaveis;

    //horarios marcados
    private List<Time> horarios;
}