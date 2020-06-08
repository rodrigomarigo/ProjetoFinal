package com.example.projetofinal.Service;

import java.util.List;

import com.example.projetofinal.Entity.Cliente;
import com.example.projetofinal.Repository.ClienteRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {
    @Autowired
    private ClienteRepository repository;
    
    public List<Cliente> getClientes(){
        return repository.findAll();
    }

    public void salvar(Cliente cliente){
        repository.save(cliente);
    }

    public Cliente getClienteById(int id){
        return repository.findById(id).get();
    }
}