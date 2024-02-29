package com.nutriconexao.apiNutri.Model;

import jakarta.persistence.*;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;
@Embeddable
public class CadastroModel {
    @UpdateTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime dataCadastro;

    public CadastroModel(){

    }
    public CadastroModel(LocalDateTime dataCadastro){
        this.dataCadastro = dataCadastro;
    }







}
