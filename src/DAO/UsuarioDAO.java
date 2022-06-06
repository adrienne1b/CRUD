
package DAO;

import DTO.UsuarioDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLDataException;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class UsuarioDAO {
    
    Connection conexao;
    
    public ResultSet autenticacaoUsuario (UsuarioDTO objusuariodto) throws SQLException {
      conexao = new ConexaoDAO().conector();
      
      try {
          String sql = "select * from usuario where usuario = ? and SenhaUsuario= ?";
          PreparedStatement pstm = conexao.prepareStatement(sql);
          pstm.setString(1, objusuariodto.getNome_usuario());
          pstm.setString(2, objusuariodto.getSenha_usuario());
          
          ResultSet rs =  pstm.executeQuery();
          return rs;
          
      } catch (SQLDataException erro) {
          JOptionPane.showMessageDialog(null,"UsuarioDAO:"+ erro);
          return null;
      }
    }
    
}
