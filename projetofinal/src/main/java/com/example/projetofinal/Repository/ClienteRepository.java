package com.example.projetofinal.Repository;

import com.example.projetofinal.Entity.Cliente;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
    
}