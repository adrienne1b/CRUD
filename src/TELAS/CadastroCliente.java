/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TELAS;

import DAO.CadastroDAO;
import DTO.CadastroDTO;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import TELAS.TelaPrincipal;
import TELAS.ConsultarCliente;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Nadya
 */
public class CadastroCliente extends javax.swing.JFrame {

    /**
     * Creates new form CadastroCliente
     */
    public CadastroCliente() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel10 = new javax.swing.JLabel();
        CPF = new javax.swing.JLabel();
        NOME = new javax.swing.JLabel();
        SOBRENOME = new javax.swing.JLabel();
        DATANASCIMENTO = new javax.swing.JLabel();
        CEP = new javax.swing.JLabel();
        TIPOLOGRADOURO = new javax.swing.JLabel();
        LOGRADOURO = new javax.swing.JLabel();
        NUMERO = new javax.swing.JLabel();
        BAIRRO = new javax.swing.JLabel();
        CIDADE = new javax.swing.JLabel();
        UF = new javax.swing.JLabel();
        TIPOTELEFONE = new javax.swing.JLabel();
        TELEFONE = new javax.swing.JLabel();
        campocpf = new javax.swing.JTextField();
        camponome = new javax.swing.JTextField();
        camposobrenome = new javax.swing.JTextField();
        campodn = new javax.swing.JTextField();
        campocep = new javax.swing.JTextField();
        campotipologradouro = new javax.swing.JTextField();
        campologradouro = new javax.swing.JTextField();
        camponumero = new javax.swing.JTextField();
        campobairro = new javax.swing.JTextField();
        campocidade = new javax.swing.JTextField();
        campouf = new javax.swing.JTextField();
        campotipotelefone = new javax.swing.JTextField();
        campotelefone = new javax.swing.JTextField();
        CADASTRAR = new javax.swing.JButton();
        VOLTAR = new javax.swing.JButton();

        jLabel10.setText("jLabel10");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Mercadinho do Paulo");

        CPF.setText("CPF:");

        NOME.setText("NOME:");

        SOBRENOME.setText("SOBRENOME:");

        DATANASCIMENTO.setText("DATA DE NASCIMENTO:");

        CEP.setText("CEP:");

        TIPOLOGRADOURO.setText("TIPO LOGRADOURO:");

        LOGRADOURO.setText("LOGRADOURO:");

        NUMERO.setText("NUMERO:");

        BAIRRO.setText("BAIRRO:");

        CIDADE.setText("CIDADE:");

        UF.setText("ESTADO:");

        TIPOTELEFONE.setText("TIPO TELEFONE:");

        TELEFONE.setText("TELEFONE:");

        CADASTRAR.setText("CADASTRAR");
        CADASTRAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CADASTRARActionPerformed(evt);
            }
        });

        VOLTAR.setText("VOLTAR");
        VOLTAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VOLTARActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(NUMERO)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(camponumero))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(LOGRADOURO)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campologradouro))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(TIPOLOGRADOURO)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campotipologradouro))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(DATANASCIMENTO)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(campodn, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CPF)
                            .addComponent(NOME))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(campocpf, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                            .addComponent(camponome)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(SOBRENOME)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(camposobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(CEP)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(campocep)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(TELEFONE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(campotelefone))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(CIDADE)
                                .addGap(18, 18, 18)
                                .addComponent(campocidade))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BAIRRO)
                                .addGap(18, 18, 18)
                                .addComponent(campobairro, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(UF)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(campouf))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(TIPOTELEFONE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(campotipotelefone)))
                        .addContainerGap(49, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(CADASTRAR, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(VOLTAR, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CPF)
                    .addComponent(BAIRRO)
                    .addComponent(campocpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campobairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NOME)
                    .addComponent(CIDADE)
                    .addComponent(camponome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campocidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SOBRENOME)
                    .addComponent(UF)
                    .addComponent(camposobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campouf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DATANASCIMENTO)
                    .addComponent(TIPOTELEFONE)
                    .addComponent(campodn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campotipotelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CEP)
                    .addComponent(TELEFONE)
                    .addComponent(campocep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campotelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TIPOLOGRADOURO)
                    .addComponent(campotipologradouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LOGRADOURO)
                            .addComponent(campologradouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CADASTRAR)
                            .addComponent(VOLTAR))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NUMERO)
                    .addComponent(camponumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CADASTRARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CADASTRARActionPerformed
       String CPF,Nome,Sobrenome,DatadeNascimento,CEP,TipoLogradouro,Logradouro,Numero,Bairro,Cidade,Estado,TipoTelefone,Telefone;
       
      CPF = campocpf.getText();
      Nome = camponome.getText();
      Sobrenome = camposobrenome.getText();
      DatadeNascimento = campodn.getText(); 
      System.out.println(DatadeNascimento);
      CEP = campocep.getText();       
      TipoLogradouro = campotipologradouro.getText();       
      Logradouro = campologradouro.getText();       
      Numero = camponumero.getText();
      Bairro = campobairro.getText();      
      Cidade = campocidade.getText();     
      Estado = campouf.getText();
      TipoTelefone = campotipotelefone.getText();      
      Telefone = campotelefone.getText();
      
      CADASTRAR.setEnabled(true);
      
      CadastroDTO objcadastrodto = new CadastroDTO ();
      objcadastrodto.setCPF(CPF);
      objcadastrodto.setNome(Nome);
      objcadastrodto.setSobrenome(Sobrenome);
      objcadastrodto.setDatadeNascimento(DatadeNascimento);
      objcadastrodto.setCep(CEP);
      objcadastrodto.setTipoLogradouro(TipoLogradouro);
      objcadastrodto.setLogradouro(Logradouro);
      objcadastrodto.setNumero(Numero);
      objcadastrodto.setBairro(Bairro);
      objcadastrodto.setCidade(Cidade);
      objcadastrodto.setEstado(Estado);
      objcadastrodto.setTipoTelefone(TipoTelefone);
      objcadastrodto.setTelefone(Telefone);
      
      
     CadastroDAO objclientedao = new CadastroDAO ();
     objclientedao.cadastrocliente(objcadastrodto);
                                      
       
    }//GEN-LAST:event_CADASTRARActionPerformed

    private void VOLTARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VOLTARActionPerformed
            TelaPrincipal objTelaPrincipal = new TelaPrincipal();
            objTelaPrincipal.setVisible(true);        
            this.dispose();
    }//GEN-LAST:event_VOLTARActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BAIRRO;
    private javax.swing.JButton CADASTRAR;
    private javax.swing.JLabel CEP;
    private javax.swing.JLabel CIDADE;
    private javax.swing.JLabel CPF;
    private javax.swing.JLabel DATANASCIMENTO;
    private javax.swing.JLabel LOGRADOURO;
    private javax.swing.JLabel NOME;
    private javax.swing.JLabel NUMERO;
    private javax.swing.JLabel SOBRENOME;
    private javax.swing.JLabel TELEFONE;
    private javax.swing.JLabel TIPOLOGRADOURO;
    private javax.swing.JLabel TIPOTELEFONE;
    private javax.swing.JLabel UF;
    private javax.swing.JButton VOLTAR;
    private javax.swing.JTextField campobairro;
    private javax.swing.JTextField campocep;
    private javax.swing.JTextField campocidade;
    private javax.swing.JTextField campocpf;
    private javax.swing.JTextField campodn;
    private javax.swing.JTextField campologradouro;
    private javax.swing.JTextField camponome;
    private javax.swing.JTextField camponumero;
    private javax.swing.JTextField camposobrenome;
    private javax.swing.JTextField campotelefone;
    private javax.swing.JTextField campotipologradouro;
    private javax.swing.JTextField campotipotelefone;
    private javax.swing.JTextField campouf;
    private javax.swing.JLabel jLabel10;
    // End of variables declaration//GEN-END:variables

}