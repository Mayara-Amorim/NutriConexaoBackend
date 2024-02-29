package com.nutriconexao.apiNutri.Enum;

public enum Genero {
    MASCULINO("Masculino"),
    FEMININO("Feminino");

    private String genero;

    public Genero(String genero){
        this.genero = genero;
    }

    public String getGenero(){
        return this.genero;
    }
}
