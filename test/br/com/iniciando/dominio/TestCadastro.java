package br.com.iniciando.dominio;

import br.com.iniciando.dao.CadastroDAO;
import conexao.Conexao;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Junior
 */
public class TestCadastro {
    
    public static void main(String[] args) {
        Cadastro c = new Cadastro();
        c.setNome("Teste");
        c.setEndereco("Rua Amazonas viela senagal 179");
        c.setTelefone(45548441);
        c.setEmail("teste@teste.com.br");
        
        CadastroDAO dao = new CadastroDAO();
        
        try {
            dao.salvar(c);
            System.out.println("Operação realizada com sucesso!");
        } catch (SQLException ex) {
            System.out.println("erro ao salvar cadastro: " + ex.getMessage());
            Logger.getLogger(TestCadastro.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
}
