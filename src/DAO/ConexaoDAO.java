package DAO;


import java.sql.Connection;
import java.sql.*;
import javax.swing.JOptionPane;
import java.sql.SQLException;

public class ConexaoDAO {
    
    public Connection conector () throws SQLException{
    Connection conexao = null;
    
    
       
    
    try {
         String url = "jdbc:mysql://localhost:3306/dbMercadinho?user=root&password=";
         String driver = "com.mysql.cj.jdbc.Driver";
            Class.forName(driver);
            conexao = DriverManager.getConnection(url);
            
            
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Conexão não estabelecida:\n" + e, "Conexão", JOptionPane.ERROR_MESSAGE);
        }
    return conexao;
    }
}
        

