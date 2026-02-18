/*3. Crea un HashMap donde la clave sea el nombre de una persona y el valor su
edad. Añade varios elementos y muestra la edad de una persona concreta.
(MainHashMapPersona)*/

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MainHashMapPersona {

    public static void main(String[] args) {
        Map<String, Integer> personas = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        boolean continuar = true;

        while (continuar) {
            System.out.print("Introduce el nombre (escribe 'salir' si has acabado): ");
            String nombre = sc.nextLine();

            if (nombre.equalsIgnoreCase("salir")) {
                continuar = false;
            } else {

                System.out.print("Introduce la edad;  ");
                String entradaEdad = sc.nextLine();

                if (entradaEdad.matches("\\d+")) {
                    int edad = Integer.parseInt(entradaEdad);
                    personas.put(nombre, edad);
                } else {
                    System.out.println("Edad no válida. Registro saltado.");
                }
            }
        }


        // Búsqueda
        boolean buscando = true;
        while (buscando) {
            System.out.print("Introduce nombre a buscar (o 'salir'): ");
            String busqueda = sc.nextLine();

            if (busqueda.equalsIgnoreCase("salir")) {
                buscando = false;
            } else {
                if (personas.containsKey(busqueda)) {
                    System.out.println("Resultado: " + busqueda + " tiene " + personas.get(busqueda) + " años.");
                } else {
                    System.out.println(busqueda + " no esta registrado.");
                }
            }
        }

        sc.close();

    }
}
