package com.nutriconexao.apiNutri.Model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class ConsultaModel {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;
    @NotNull
    private PacienteModel paciente;
    @NotNull
    private NutricionistaModel nutricionista;
    @NotNull
    private BigDecimal valor;
    @NotNull
    private LocalDateTime horario;

    private LocalDateTime consultaMarcada;

    private CadastroModel cadastro;

    public ConsultaModel(){

    }

}
