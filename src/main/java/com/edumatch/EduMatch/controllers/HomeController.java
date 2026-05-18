package com.edumatch.EduMatch.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	@GetMapping("/")
    public String index() {
        return "EduMatch/index";
    }
	
	@GetMapping("/cadastrar")
    public String cadastrar() {
        return "EduMatch/cadastrar"; 
    }
	
	@GetMapping("/loginCadastrado")
    public String loginCadastrado() {
        return "EduMatch/loginCadastrado"; 
    }
	
	@GetMapping("/cadastrarMentor")
    public String cadastrarMentor() {
        return "EduMatch/cadastrarMentor"; 
    }
	
	@GetMapping("/cadastrarMentorado")
    public String cadastrarMentorado() {
        return "EduMatch/cadastrarMentorado"; 
    }



}
