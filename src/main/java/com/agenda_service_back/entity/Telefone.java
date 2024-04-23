package com.agenda_service_back.entity;

import jakarta.persistence.*;
import jakarta.persistence.criteria.CriteriaBuilder;

import java.io.Serializable;
import java.util.Objects;

@Entity
public class Telefone implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Integer id;
    protected String numero;
    @ManyToOne
    @JoinColumn(name = "pessoaFisica_id")
    protected Integer pessoaFisica_id;
    @ManyToOne
    @JoinColumn(name = "pessoaJuridica_id")
    protected Integer pessoaJuridica_id;


    public Telefone() {
    }

    public Telefone(Integer id, String numero, Integer pessoaFisica_id, Integer pessoaJuridica_id) {
        this.id = id;
        this.numero = numero;
        this.pessoaFisica_id = pessoaFisica_id;
        this.pessoaJuridica_id = pessoaJuridica_id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Integer getPessoaFisica_id() {
        return pessoaFisica_id;
    }

    public void setPessoaFisica_id(Integer pessoaFisica_id) {
        this.pessoaFisica_id = pessoaFisica_id;
    }

    public Integer getPessoaJuridica_id() {
        return pessoaJuridica_id;
    }

    public void setPessoaJuridica_id(Integer pessoaJuridica_id) {
        this.pessoaJuridica_id = pessoaJuridica_id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Telefone telefone = (Telefone) o;
        return Objects.equals(id, telefone.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
