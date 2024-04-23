package com.agenda_service_back.entity;

import java.util.Date;

public class PessoaFisica extends Pessoa{
    private static final long serialVersionUID = 1L;

    protected String cpf;
    protected Date data_nascimento;


    public PessoaFisica() {
       super();
    }

    public PessoaFisica(Integer id, String nome, String email, String senha, Telefone telefone, Endereco endereco, String cpf, Date data_nascimento) {
        super(id, nome, email, senha, telefone, endereco);
        this.cpf = cpf;
        this.data_nascimento = data_nascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(Date data_nascimento) {
        this.data_nascimento = data_nascimento;
    }
}

