package com.example.projetofinal.Service;

import java.util.List;

import com.example.projetofinal.Entity.Horario;
import com.example.projetofinal.Repository.HorarioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HorarioService {
    @Autowired
    private HorarioRepository repository;

    public List<Horario> getHorarios(){
        return repository.findAll();
    }
    
}