package conexao;

import com.sun.istack.internal.logging.Logger;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;

/**
 *
 * @author Junior
 */
public class Conexao {
    private Connection conn;
    
    private Connection conectar(){
        System.out.println("Conectando ao banco...");
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/iniciandospring","junior","junior");
            System.out.println("conectado com sucesso....");
            return conn;
        }catch(ClassNotFoundException ex){
            System.out.println("Classe nao encontrada, adicione o driver nas bibliotecas");
            java.util.logging.Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null,ex);
        }
        catch(SQLException ex){
            System.out.println("erro ao conectar ao banco: " +ex.getMessage());
            java.util.logging.Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null,ex);
        }
        return null;
    }
    
    public Connection getConexao(){        
        return conectar();
    }
}
