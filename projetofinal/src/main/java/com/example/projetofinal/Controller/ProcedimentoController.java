package com.example.projetofinal.Controller;

import com.example.projetofinal.Entity.Procedimento;
import com.example.projetofinal.Service.ProcedimentoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ProcedimentoController {
    @Autowired
    private ProcedimentoService procedimentoService;

    @GetMapping("/procedimentos")
    public ModelAndView getProcedimentos(){
        ModelAndView mv = new ModelAndView("templateProcedimentos");

        mv.addObject("procedimento", new Procedimento());
        mv.addObject("procedimentos", procedimentoService.getProcedimentos());

        return mv;

    }

    @PostMapping("/salvarProcedimento")
    public String salvar(@ModelAttribute Procedimento procedimento){
        procedimentoService.salvar(procedimento);

        return "redirect:/procedimentos";
    }
}