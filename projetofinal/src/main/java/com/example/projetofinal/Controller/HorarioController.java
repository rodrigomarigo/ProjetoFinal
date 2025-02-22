package com.example.projetofinal.Controller;

import com.example.projetofinal.Entity.Cliente;
import com.example.projetofinal.Entity.Funcionario;
import com.example.projetofinal.Entity.Horario;
import com.example.projetofinal.Entity.Procedimento;
import com.example.projetofinal.Service.ClienteService;
import com.example.projetofinal.Service.FuncionarioService;
import com.example.projetofinal.Service.HorarioService;
import com.example.projetofinal.Service.ProcedimentoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HorarioController {
    @Autowired
    private HorarioService horarioService;

    @Autowired
    private ClienteService clienteService;

    @Autowired
    private FuncionarioService funcionarioService;

    @Autowired
    private ProcedimentoService procedimentoService;

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

    @PostMapping("/associarHorarioCliente")
    public String associarCliente(@ModelAttribute Cliente cliente, @RequestParam Integer idHorario) {
        Horario horario = horarioService.getHorarioById(idHorario);
        cliente = clienteService.getClienteById(cliente.getId());

        horario.setCliente(cliente);
        horarioService.salvar(horario);

        return "redirect:/detalhesHorario/" + idHorario;
    }
    
    @PostMapping("/associarHorarioFuncionario")
    public String associarFuncionario(@ModelAttribute Funcionario funcionario, @RequestParam Integer idHorario) {
        Horario horario = horarioService.getHorarioById(idHorario);
        funcionario = funcionarioService.getFuncionarioById(funcionario.getId());

        horario.setFuncionario(funcionario);
        horarioService.salvar(horario);

        return "redirect:/detalhesHorario/" + idHorario;
    }

    @PostMapping("/associarHorarioProcedimento")
    public String associarProcedimento(@ModelAttribute Procedimento procedimento, @RequestParam Integer idHorario) {
        Horario horario = horarioService.getHorarioById(idHorario);
        procedimento = procedimentoService.getProcedimentoById(procedimento.getId());

        horario.setProcedimento(procedimento);
        horarioService.salvar(horario);

        return "redirect:/detalhesHorario/" + idHorario;
    }

}