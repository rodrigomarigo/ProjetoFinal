package com.example.projetofinal.Repository;

import com.example.projetofinal.Entity.Funcionario;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Integer>{
    
}