package com.nutriconexao.apiNutri.Enum;

public enum Objetivo {

        PERDA_DE_PESO ("Perda de peso"),
        GANHO_DE_FORCA ("Ganho de força"),
        GANHO_MUSCULAR("Ganho muscular"),
        DESEMPENHO_ATLETICO ("Desempenho atletico"),
        OUTROS ("Outros");

        private final String objetivo;

        private Objetivo(String objetivo) {
                this.objetivo = objetivo;
        }

        public String getObjetivo() {
                return objetivo;
        }
}
