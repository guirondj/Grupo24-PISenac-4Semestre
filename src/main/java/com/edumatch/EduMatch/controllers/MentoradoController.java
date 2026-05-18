package com.edumatch.EduMatch.controllers;

import com.edumatch.EduMatch.model.Mentorado;
import com.edumatch.EduMatch.repository.MentoradoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MentoradoController {

    @Autowired
    private MentoradoRepository mentoradoRepository;

    @PostMapping("/cadastrarMentorado")
    public String cadastrarMentorado(Mentorado mentorado) {
        mentoradoRepository.save(mentorado);
        
        // Altere para a rota que exibe o seu formulário de cadastro
        return "redirect:/"; 
    }
}