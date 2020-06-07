package com.example.projetofinal.Controller;

import com.example.projetofinal.Entity.Funcionario;
import com.example.projetofinal.Service.FuncionarioService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@Controller
public class FuncionarioController {
    @Autowired
    private FuncionarioService funcionarioService;

    @GetMapping("/funcionarios")
    public ModelAndView getFuncionarios(){
        ModelAndView mv = new ModelAndView("templateFuncionarios");

        mv.addObject("funcionario", new Funcionario());
        mv.addObject("funcionarios", funcionarioService.getFuncionarios());

        return mv;
    }

    @PostMapping("/salvarFuncionario")
    public String salvar(@ModelAttribute Funcionario funcionario) {
        funcionarioService.salvar(funcionario);

        return "redirect:/funcionarios";
    }
    
}