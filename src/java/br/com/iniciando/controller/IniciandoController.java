package br.com.iniciando.controller;

import br.com.iniciando.dao.CadastroDAO;
import br.com.iniciando.dominio.Cadastro;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author junior
 */
@Controller
public class IniciandoController {
    
    @RequestMapping("/olaMundo")
    public String iniciando(Model model, Cadastro cadastro){
        CadastroDAO dao = new CadastroDAO();
        
        try{
            dao.salvar(cadastro);
            model.addAttribute("nome",cadastro.getNome());
        }catch(SQLException ex){
            System.out.println("erro na controller: " + ex.getMessage());
        }
        return "index";
    }
    
    @RequestMapping("/cadastro")
    public String cadastro(){
        return "cadastro";
    }
    
    @RequestMapping("/lista")
    public String listaCadastro(Model model){
        CadastroDAO dao = new CadastroDAO();  
        try {
            model.addAttribute("listaCadastro",dao.listaTodos());
        } catch (SQLException ex) {
            Logger.getLogger(IniciandoController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "lista";
    }
}
