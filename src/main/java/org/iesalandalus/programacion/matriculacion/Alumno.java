package org.iesalandalus.programacion.matriculacion;
public class Alumno {

    //paso 1 crear la clase alumno

    //paso 2 crea los atributos
    private static String ER_TELEFONO;
    private static String ER_CORREO;
    private static String ER_DNI;
    public static String FORMATO_FECHA = "dd/MM/YYYY";
    private static String ER_NIA;
    private static int MIN_EDAD_ALUMNADO;

    private String nombre;
    private String telefono;
    private String correo;
    private String dni;
    private LocalDate fechaNacimiento;
    private String nia;

    // paso 3 crear metodo formateaNombre
    private String FormateaNombre(String nombre) {
        // copiado
        String[] palabras = nombre.trim().split("\\s+");
        StringBuilder nombreFormateado = new StringBuilder();
        for (String palabra : palabras) {
            nombreFormateado.append(Character.toUpperCase(palabra.charAt(0)))
                    .append(palabra.substring(1).toLowerCase())
                    .append(" ");
        }
        return nombreFormateado.toString().trim();
    }
}
