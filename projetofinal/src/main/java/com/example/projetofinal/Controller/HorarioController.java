package com.example.projetofinal.Controller;

import com.example.projetofinal.Entity.Horario;
import com.example.projetofinal.Service.HorarioService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HorarioController {
    @Autowired
    private HorarioService horarioService;

    @GetMapping("/horarios")
    public ModelAndView getHorarios(){
        ModelAndView mv = new ModelAndView("templateHorarios");

        mv.addObject("horario", new Horario());
        mv.addObject("horarios", horarioService.getHorarios());

        return mv;
    }

    @PostMapping("/salvarHorario")
    public String salvar(@ModelAttribute Horario horario){
        horarioService.salvar(horario);

        return "redirect:/horarios";
    }

    @GetMapping("/detalhesHorario/{id}")
    public ModelAndView getHorarioDetalhres(@PathVariable(name = "id") Integer id) {
        Horario horario = horarioService.getHorarioById(id);
        ModelAndView mv = new ModelAndView("detalhesHorario");
        mv.addObject("horario", horario);

        // List<Autor> autoresNaoAssociados = autorService.getAutores();
        // autoresNaoAssociados.removeAll(livro.getAutor());
        // mv.addObject("autores", autoresNaoAssociados);
        // List<Editora> editorasNaoAssociadas = editoraService.getEditoras();
        // editorasNaoAssociadas.remove(livro.getEditora());
        // mv.addObject("editoras", editorasNaoAssociadas);

        return mv;
    }
    
}