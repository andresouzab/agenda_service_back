package com.agenda_service_back.DTO;

import com.agenda_service_back.entity.Endereco;
import com.agenda_service_back.entity.Estado;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class CidadeDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    protected Integer id;

    @Column(unique = true)

    protected String nome;


    protected Estado estado;


    private List<Endereco> enderecos = new ArrayList<>();

}
