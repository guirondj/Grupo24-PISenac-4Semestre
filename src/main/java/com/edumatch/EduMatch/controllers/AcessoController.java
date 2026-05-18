package com.edumatch.EduMatch.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.edumatch.EduMatch.models.Acesso;
import com.edumatch.EduMatch.repository.AcessoRepository;

@Controller
public class AcessoController {

    @Autowired
    private AcessoRepository aR;

    @GetMapping("/EduMatch/loginUsuario")
    public String form() {
        return "EduMatch/loginUsuario";
    }

    @PostMapping("/EduMatch/loginUsuario")
    public String form(@Validated Acesso acesso, BindingResult result, RedirectAttributes attributes) {
        if (result.hasErrors()) {
            attributes.addFlashAttribute("mensagem", "Verifique os campos...");
            return "redirect:/EduMatch/loginUsuario";
        }
        aR.save(acesso);
        attributes.addFlashAttribute("mensagem", "Usuário Cadastrado com sucesso!");
        return "redirect:/EduMatch/loginUsuario";
    }
    
  
}
