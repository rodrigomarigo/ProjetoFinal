package com.example.projetofinal.Controller;

import com.example.projetofinal.Entity.Cliente;
import com.example.projetofinal.Service.ClienteService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ClienteController {
    @Autowired
    private ClienteService clienteService;

    @GetMapping("/clientes")
    public ModelAndView getClientes(){
        ModelAndView mv = new ModelAndView("templateClientes");

        mv.addObject("cliente", new Cliente());
        mv.addObject("clientes", clienteService.getClientes());

        return mv;
    }

    @PostMapping("/salvarCliente")
    public String salvar(@ModelAttribute Cliente cliente){
        clienteService.salvar(cliente);

        return "redirect:/clientes";
    }
}