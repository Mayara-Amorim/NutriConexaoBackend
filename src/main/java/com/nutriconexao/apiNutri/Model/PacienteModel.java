package com.nutriconexao.apiNutri.Model;

import com.nutriconexao.apiNutri.Enum.Genero;
import com.nutriconexao.apiNutri.Enum.Objetivo;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import org.hibernate.annotations.UpdateTimestamp;


import java.time.LocalDate;


public class PacienteModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message = "O atributo nome é obrigatório!")
    private String nome;
    @NotNull
    private LocalDate dataNascimento;
    @NotNull
    @Enumerated(EnumType.STRING)
    private Genero genero;
    @NotNull
    private double altura;
    @NotNull
    private double peso;
    @NotNull
    @Enumerated(EnumType.STRING)
    private Objetivo objetivo;

    @NotNull(message = "O Atributo email é obrigatório!")
    @Email(message = "O Atributo email deve ser um e-mail válido!")
    private String email;
    @NotBlank(message = "O atributo Senha é obrigatório!")
    @Size(min = 8, message = "A senha deve ter no mínimo 8 caracteres")
    private String senha;

    private ContatoModel contato;
    @Embedded
    private CadastroModel cadastro;

    public PacienteModel() {

    }

}
