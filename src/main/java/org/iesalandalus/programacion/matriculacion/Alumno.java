package org.iesalandalus.programacion.matriculacion;
import java.time.LocalDate;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
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
    //paso 4 crea el metodo comprobarLetraDNI
    public boolean comprobarLetraDNI() {
        String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
        String patron = "(\\d+)([A-Z])";
        Pattern pattern = Pattern.compile(patron);

        Matcher matcher = pattern.matcher(dni);

        if (matcher.matches()) {
            String numero = matcher.group(1);
            char letra = matcher.group(2).charAt(0);

            int num = Integer.parseInt(numero);
            char letraCorrecta = letras.charAt(num % 23);

            return letra == letraCorrecta;
        }

        return false;
    }

    //paso 5 crear metodos de acceso
}
