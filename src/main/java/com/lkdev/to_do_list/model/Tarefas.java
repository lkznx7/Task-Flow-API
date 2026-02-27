package com.lkdev.to_do_list.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
@Entity
@Data

public class Tarefas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id ;
    private String nome ;
    private String descricao;
    private Boolean Concluida;

    public Tarefas(){}
    public Tarefas(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
        this.Concluida = false;
    }

}
