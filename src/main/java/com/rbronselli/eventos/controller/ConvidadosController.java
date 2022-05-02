package com.rbronselli.eventos.controller;

import com.rbronselli.eventos.service.ConvidadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/convidados")
public class ConvidadosController {

    @Autowired
    private ConvidadoService convidadoService;

    @GetMapping
    public ModelAndView listarTodos() {
        ModelAndView modelAndView = new ModelAndView("ListaConvidados");
        modelAndView.addObject("convidados",convidadoService.listarTodos());
        return modelAndView;
    }

}
