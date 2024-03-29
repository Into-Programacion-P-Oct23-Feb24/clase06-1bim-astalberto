/*
*   Ingrese una cadena de texto y verifique que pertenece a un  de un día de la 
*   semana.
 */
package paquete01;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        System.out.println("Ingrese el nombre del día de la semana");
        String cadena = entrada.nextLine();

        switch (cadena) {
            case "Lunes":
            case "LUNES":
                System.out.printf("%s, es el primer dia de la semana",
                        cadena);
                break;

            case "Martes":
            case "martes":
            case "MARTES":
                System.out.printf("%s, es el segundo dia de la semana\n",
                        cadena);
                break;

            case "Miercoles":
            case "miercoles":
            case "MIERCOLES":
                System.out.printf("%s, es el tercer dia de la semana\n",
                        cadena);
                break;

            case "jueves":
            case "JUEVES":
            case "Jueves":
                System.out.printf("%s, es el cuarto dia de la semana\n",
                        cadena);
                break;

            case "Viernes":
            case "VIERNES":
            case "viernes":
                System.out.printf("%s, es el quinto dia de la semana\n",
                         cadena);
                break;

            case "Sabado":
            case "sabado":
            case "SABADO":
                System.out.printf("%s, es el sexto dia de la semana\n",
                        cadena);
                break;

            case "Domingo":
            case "DOMINGO":
            case "domingo":
                System.out.printf("%s, es el septimo dia de la semana\n",
                        cadena);
                break;

            default:
                System.out.println("ninguna de las anteriores\n");
                break;
        }

    }
}
