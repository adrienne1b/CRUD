/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author Nadya
 */
public class CadastroDTO {
        private String CPF;
        private String Nome;
        private String Sobrenome;
        private String DatadeNascimento;
        private String tipoTelefone;
        private String Telefone;
        private String cep;
        private String tipoLogradouro;
        private String logradouro;
        private String numero;
        private String bairro;
        private String cidade;
        private String Estado;
        private int idCliente;
   
    public CadastroDTO(String CPF, String Nome, String Sobrenome, String DatadeNascimento, String tipoTelefone, String Telefone,String cep,String tipoLogradouro, String logradouro, String numero, String bairro, String cidade, String Estado) {
        this.CPF = CPF;
        this.Nome = Nome;
        this.Sobrenome = Sobrenome;
        this.DatadeNascimento = DatadeNascimento;
        this.tipoTelefone = tipoTelefone;  
        this.Telefone = Telefone; 
        this.cep = cep;
        this.tipoLogradouro = tipoLogradouro;
        this.logradouro = logradouro;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.Estado = Estado;

        
    
}

    public CadastroDTO() {
      //To change body of generated methods, choose Tools | Templates.
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getSobrenome() {
        return Sobrenome;
    }

    public void setSobrenome(String Sobrenome) {
        this.Sobrenome = Sobrenome;
    }

    public String getDatadeNascimento() {
        return DatadeNascimento;
    }

    public void setDatadeNascimento(String DatadeNascimento) {
        this.DatadeNascimento = DatadeNascimento;
    }

    public String getTipoTelefone() {
        return tipoTelefone;
    }

    public void setTipoTelefone(String tipoTelefone) {
        this.tipoTelefone = tipoTelefone;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getTipoLogradouro() {
        return tipoLogradouro;
    }

    public void setTipoLogradouro(String tipoLogradouro) {
        this.tipoLogradouro = tipoLogradouro;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }


    public String getDataNascimento() {
            return null;
         //To change body of generated methods, choose Tools | Templates.
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }
}

   