package com.agenda_service_back.entity;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
public class Estado implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Integer id;

    @Column(unique = true)
    protected String nome;

    protected String uf;
    @OneToMany(mappedBy = "estado")
    private List<Cidade> cidade = new ArrayList<>();


    public Estado() {
    }
    public Estado(Integer id, String nome, String uf) {
        this.id = id;
        this.nome = nome;
        this.uf = uf;
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

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Estado estado = (Estado) o;
        return Objects.equals(id, estado.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
