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

    //paso 4 crea el metodo imprimir
    public String imprimir() {
        return this.ordinal() + ".-" + this.cadenaAMostrar;
    }

    //paso 5 crea el metodo toString

    @Override
    public String toString() {
        return "Curso{" +
                "cadenaAMostrar='" + cadenaAMostrar + '\'' +
                '}';
    }

}
