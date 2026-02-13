import java.util.Scanner;

public class Holamundo {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        // Try para manejar posibles errores
        try {
            // Ponemos una variable para guardar el nombre del usuario
            String nombre = "";

            // Ponemos otra variable para guardar los integrantes del equipo
            String integrantesdelequipo = "";

            // Mensaje de bienvenida
            System.out.println("Bienvenido, este es tu primer hola Mundo");

            // Creamos un scanner para guardar datos
            Scanner informacion = new Scanner(System.in);

            // Preguntamos el nombre del usuario
            System.out.println("Ahora, ¿Cual es tu nombre?");

            // Guardamos el nombre del usuario
            nombre = informacion.nextLine();

            // Mostramos un mensaje incluyendo el nombre del usuario
            System.out.println("Muy bien, ahora haces parte del grupo, " + nombre);

            // Creamos un scanner para guardar datos
            Scanner equipo = new Scanner(System.in);

            // Preguntamos por los compañeros del usuario
            System.out.println("Quienes son tus compañeros?");

            // Guardamos el nombre de los compañeros del usuario
            integrantesdelequipo = equipo.nextLine();

            // Mostramos un mensaje final con toda la información ingresada
            System.out.println("Entonces " + nombre + " tus compañeros de equipo son " + integrantesdelequipo);

            // Cerramos los scanners
            informacion.close();
            equipo.close();


        } catch (Exception e) {

            // En caso de error mostramos un mensaje
            System.out.println("Error");

        }
    }
}
