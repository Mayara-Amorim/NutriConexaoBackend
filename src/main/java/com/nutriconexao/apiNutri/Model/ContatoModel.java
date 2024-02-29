package com.nutriconexao.apiNutri.Model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;

public class ContatoModel {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private long id;
    private String telefone;
    @NotNull
    private String pais;
    @NotNull
    private String estado;
    @NotNull
    private String cidade;
    private String bairro;
    private String cep;
    private String rua;
    private String numero;


    public ContatoModel(){

    }
    public ContatoModel(String pais, String estado, String cidade){
        this.pais= pais;
        this.estado = estado;
        this.cidade = cidade;

    }
}
