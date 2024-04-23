package com.agenda_service_back.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Null;

import java.io.Serializable;
import java.util.Objects;
@Entity
public class Servico implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Integer id;

    protected String nome;
    @Null
    protected Double preco;
    protected String descricao;

    @Null
    protected String informacoes_extras;
    protected String status;

    @ManyToOne
    @JoinColumn(name = "categoria_id")
    protected Integer categoria_id;
    @ManyToOne
    @JoinColumn(name = "pessoaJuridica_id")
    protected Integer pessoaJuridica_id;


    public Servico() {
    }
    public Servico(Integer id, String nome, Double preco, String descricao, String informacoes_extras, String status, Integer categoria_id, Integer pessoaJuridica_id) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.descricao = descricao;
        this.informacoes_extras = informacoes_extras;
        this.status = status;
        this.categoria_id = categoria_id;
        this.pessoaJuridica_id = pessoaJuridica_id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getInformacoes_extras() {
        return informacoes_extras;
    }

    public void setInformacoes_extras(String informacoes_extras) {
        this.informacoes_extras = informacoes_extras;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getCategoria_id() {
        return categoria_id;
    }

    public void setCategoria_id(Integer categoria_id) {
        this.categoria_id = categoria_id;
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
        Servico servico = (Servico) o;
        return Objects.equals(id, servico.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}

