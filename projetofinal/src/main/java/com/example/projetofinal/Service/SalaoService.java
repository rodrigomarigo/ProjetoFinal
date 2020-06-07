package com.example.projetofinal.Service;

import java.util.List;

import com.example.projetofinal.Entity.Salao;
import com.example.projetofinal.Repository.SalaoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SalaoService {
    @Autowired
    private SalaoRepository repository;

    public List<Salao> getSaloes(){
        return repository.findAll();
    }
}