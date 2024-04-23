package com.agenda_service_back.entity;

import java.util.Date;

public class PessoaJuridica extends Pessoa{
    private static final long serialVersionUID = 1L;

    protected String cnpj;
    protected String razao_social;

    public PessoaJuridica() {
       super();
    }

    public PessoaJuridica(Integer id, String nome, String email, String senha, Telefone telefone, Endereco endereco, String cnpj, String razao_social) {
        super(id, nome, email, senha, telefone, endereco);
        this.cnpj = cnpj;
        this.razao_social = razao_social;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazao_social() {
        return razao_social;
    }

    public void setRazao_social(String razao_social) {
        this.razao_social = razao_social;
    }
}

