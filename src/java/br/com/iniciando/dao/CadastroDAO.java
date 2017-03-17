package br.com.iniciando.dao;

import br.com.iniciando.dominio.Cadastro;
import conexao.Conexao;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Zeus
 */
public class CadastroDAO implements Serializable{
     
    
        public void salvar(Cadastro cadastro) throws SQLException{
            Conexao conn = new Conexao();
            String sql = "insert into cadastro(nome, endereco, telefone, email) values(?,?,?,?)";
            PreparedStatement ps =  conn.getConexao().prepareStatement(sql);
            ps.setString(1, cadastro.getNome());
            ps.setString(2, cadastro.getEndereco());
            ps.setInt(3, cadastro.getTelefone());
            ps.setString(4,cadastro.getEmail());
            
            ps.execute();
      }
    
}
