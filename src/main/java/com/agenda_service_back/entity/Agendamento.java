package com.agenda_service_back.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Null;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Objects;

@Entity
public class Agendamento implements Serializable{

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Integer id;
    protected DateTimeFormat data_inicio;
    protected DateTimeFormat data_fim;
    @Null
    protected String observacao;
    @OneToOne
    @JoinColumn(name = "servico_id")
    protected Integer servico_id;
    @ManyToOne
    @JoinColumn(name = "pessoaFisica_id")
    protected Integer pessoaFisica_id;


    public Agendamento() {
    }
    public Agendamento(Integer id, DateTimeFormat data_inicio, DateTimeFormat data_fim, String observacao, Integer servico_id, Integer pessoaFisica_id) {
        this.id = id;
        this.data_inicio = data_inicio;
        this.data_fim = data_fim;
        this.observacao = observacao;
        this.servico_id = servico_id;
        this.pessoaFisica_id = pessoaFisica_id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public DateTimeFormat getData_inicio() {
        return data_inicio;
    }

    public void setData_inicio(DateTimeFormat data_inicio) {
        this.data_inicio = data_inicio;
    }

    public DateTimeFormat getData_fim() {
        return data_fim;
    }

    public void setData_fim(DateTimeFormat data_fim) {
        this.data_fim = data_fim;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public Integer getServico_id() {
        return servico_id;
    }

    public void setServico_id(Integer servico_id) {
        this.servico_id = servico_id;
    }

    public Integer getPessoaFisica_id() {
        return pessoaFisica_id;
    }

    public void setPessoaFisica_id(Integer pessoaFisica_id) {
        this.pessoaFisica_id = pessoaFisica_id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Agendamento that = (Agendamento) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
