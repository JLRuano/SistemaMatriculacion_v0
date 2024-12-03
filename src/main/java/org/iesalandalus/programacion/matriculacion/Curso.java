package org.iesalandalus.programacion.matriculacion;

public enum Curso {
    // paso 1 crear enumerado curso
    PRIMERO, SEGUNDO;

    //paso 2 crear atributo cadenaAMostrar
    private String cadenaAMostrar;

    //paso 3 crea el constructor

    Curso(String cadenaAMostrar) {
        this.cadenaAMostrar = cadenaAMostrar;
    }


}
