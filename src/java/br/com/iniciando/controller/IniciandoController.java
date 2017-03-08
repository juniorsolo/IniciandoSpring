package br.com.iniciando.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author junior
 */
@Controller
public class IniciandoController {
    
    @RequestMapping("/olaMundo")
    public String iniciando(){
        return "index";
    }
    
    @RequestMapping("/cadastro")
    public String cadastro(){
        return "cadastro";
    }
    
}
