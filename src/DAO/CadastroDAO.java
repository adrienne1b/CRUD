package DAO;

import DTO.CadastroDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.util.ArrayList;

public class CadastroDAO {

    Connection conexao;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<CadastroDTO> lista = new ArrayList<>();

    /**
     *
     * @param objcadastrodto
     * @throws SQLException
     */
    public void cadastrocliente(CadastroDTO objcadastrodto) {

        String sql = "Insert into Clientes (CPF,Nome,Sobrenome,DataNascimento,TipoTelefone,Telefone,CEP,TipoLogradouro,Logradouro,Numero,Bairro,Cidade,Estado) values(?,?,?,?,?,?,?,?,?,?,?,?,?)";

        try {
            conexao = new ConexaoDAO().conector();
        } catch (SQLException ex) {
            Logger.getLogger(CadastroDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {

            pstm = conexao.prepareStatement(sql);
            pstm.setString(1, objcadastrodto.getCPF());
            pstm.setString(2, objcadastrodto.getNome());
            pstm.setString(3, objcadastrodto.getSobrenome());
            pstm.setString(4, objcadastrodto.getDatadeNascimento());
            pstm.setString(5, objcadastrodto.getTipoTelefone());
            pstm.setString(6, objcadastrodto.getTelefone());
            pstm.setString(7, objcadastrodto.getCep());
            pstm.setString(8, objcadastrodto.getTipoLogradouro());
            pstm.setString(9, objcadastrodto.getLogradouro());
            pstm.setString(10, objcadastrodto.getNumero());
            pstm.setString(11, objcadastrodto.getBairro());
            pstm.setString(12, objcadastrodto.getCidade());
            pstm.setString(13, objcadastrodto.getEstado());

            pstm.executeUpdate();
            pstm.close();

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "ClienteDAO" + erro);
        }

    }

    public ArrayList<CadastroDTO> ConsultarCliente() {

        String sql = (String) "Select * from Clientes";

        try {
            conexao = new ConexaoDAO().conector();
        } catch (SQLException ex) {
            Logger.getLogger(CadastroDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            pstm = conexao.prepareStatement(sql);
            rs = pstm.executeQuery();

            while (rs.next()) {
                CadastroDTO objcadastrodto = new CadastroDTO();
                objcadastrodto.setIdCliente(rs.getInt("IdCliente"));
                objcadastrodto.setCPF(rs.getString("CPF"));
                objcadastrodto.setNome(rs.getString("Nome"));
                objcadastrodto.setSobrenome(rs.getString("Sobrenome"));
                objcadastrodto.setDatadeNascimento(rs.getString("DataNascimento"));
                objcadastrodto.setTipoTelefone(rs.getString("TipoTelefone"));
                objcadastrodto.setTelefone(rs.getString("Telefone"));
                objcadastrodto.setCep(rs.getString("CEP"));
                objcadastrodto.setTipoLogradouro(rs.getString("TipoLogradouro"));
                objcadastrodto.setLogradouro(rs.getString("Logradouro"));
                objcadastrodto.setNumero(rs.getString("Numero"));
                objcadastrodto.setBairro(rs.getString("Bairro"));
                objcadastrodto.setCidade(rs.getString("Cidade"));
                objcadastrodto.setEstado(rs.getString("Estado"));

                lista.add(objcadastrodto);

            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "ClienteDAO ConsultarCliente: " + erro);
        }
        return lista;

    }

    public void Atualizarcliente(CadastroDTO objcadastrodto) {

        String sql = "update Clientes set CPF = ?, Nome = ?, Sobrenome = ?, DataNascimento = ?, TipoTelefone = ?, Telefone = ?, CEP = ?, TipoLogradouro = ?, Logradouro = ?, Numero = ?, Bairro = ?, Cidade = ?, Estado = ? where IdCliente = ?";

             try {
            conexao = new ConexaoDAO().conector();
        } catch (SQLException ex) {
            Logger.getLogger(CadastroDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {

            pstm = conexao.prepareStatement(sql);
            pstm.setString(1, objcadastrodto.getCPF());
            pstm.setString(2, objcadastrodto.getNome());
            pstm.setString(3, objcadastrodto.getSobrenome());
            pstm.setString(4, objcadastrodto.getDatadeNascimento());
            pstm.setString(5, objcadastrodto.getTipoTelefone());
            pstm.setString(6, objcadastrodto.getTelefone());
            pstm.setString(7, objcadastrodto.getCep());
            pstm.setString(8, objcadastrodto.getTipoLogradouro());
            pstm.setString(9, objcadastrodto.getLogradouro());
            pstm.setString(10, objcadastrodto.getNumero());
            pstm.setString(11, objcadastrodto.getBairro());
            pstm.setString(12, objcadastrodto.getCidade());
            pstm.setString(13, objcadastrodto.getEstado());
            pstm.setInt(14, objcadastrodto.getIdCliente());

            pstm.execute();
            pstm.close();

       } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "ClienteDAO Altualizar " + erro);
        }
    }

    public void Excluircliente(CadastroDTO objcadastrodto) {

        String sql = "delete from Clientes where IdCliente = ?";

        try {
            conexao = new ConexaoDAO().conector();
        } catch (SQLException ex) {
            Logger.getLogger(CadastroDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {

            pstm = conexao.prepareStatement(sql);
            pstm.setInt(1, objcadastrodto.getIdCliente());

            pstm.execute();
            pstm.close();

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "ClienteDAO Excluir " + erro);
        }
    }
}
