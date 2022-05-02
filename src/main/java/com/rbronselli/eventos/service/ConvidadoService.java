package com.rbronselli.eventos.service;

import com.rbronselli.eventos.model.Convidado;
import com.rbronselli.eventos.repository.ConvidadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConvidadoService {

    @Autowired
    private ConvidadoRepository convidadoRepository;

    public List<Convidado> listarTodos() {
        return convidadoRepository.findAll();
    }

}
