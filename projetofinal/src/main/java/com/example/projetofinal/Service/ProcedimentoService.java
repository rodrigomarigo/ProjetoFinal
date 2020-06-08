package com.example.projetofinal.Service;

import java.util.List;

import com.example.projetofinal.Entity.Procedimento;
import com.example.projetofinal.Repository.ProcedimentoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProcedimentoService {
    @Autowired
    private ProcedimentoRepository repository;

    public List<Procedimento> getProcedimentos(){
        return repository.findAll();
    }

    public void salvar(Procedimento procedimento){
        repository.save(procedimento);
    }

    public Procedimento getProcedimentoById(int id){
        return repository.findById(id).get();
    }
}