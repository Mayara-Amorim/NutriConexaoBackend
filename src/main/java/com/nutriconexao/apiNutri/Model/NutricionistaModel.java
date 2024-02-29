package com.nutriconexao.apiNutri.Model;

import com.nutriconexao.apiNutri.Enum.Genero;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDate;

public class NutricionistaModel {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;
    private String nome;
    private String email;

    private LocalDate dataNascimento;

    private String crm;
    @Enumerated(EnumType.STRING)
    private Genero genero;


    private ContatoModel contato;
    @UpdateTimestamp
    private CadastroModel cadastro;
}
