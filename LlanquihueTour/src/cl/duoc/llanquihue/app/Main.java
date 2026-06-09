package cl.duoc.llanquihue.app;

import cl.duoc.llanquihue.model.Direccion;
import cl.duoc.llanquihue.model.Empleado;
import cl.duoc.llanquihue.model.Persona;

/**
 * Clase principal de la aplicación Llanquihue Tour.
 * Se encarga de crear objetos de ejemplo de tipo Direccion, Persona
 * y Empleado, para luego mostrar sus datos por consola.
 * Versión 1.0
 * Autor: Nicolás Correa
 */
public class Main {

    /**
     * Método principal de ejecución del programa.
     * Crea direcciones, clientes y un empleado guía turístico,
     * mostrando la información correspondiente en consola.
     *
     * @param args argumentos recibidos desde la línea de comandos.
     */
    public static void main(String[] args) {
        System.out.println("\n---Llanquihue Tour - Gestión de personas---\n");

        Direccion dir1 = new Direccion("Av. Los Alerces", "1234",
                "Pto. Montt", "Los Lagos", "1313987");
        Direccion dir2 = new Direccion("San pablo", "7980",
                "Frutillar", "Los Lagos", "2352135");
        Direccion dir3 = new Direccion("Walker Martínez", "9876",
                "Puerto Varas", "Los Lagos", "2827666" );

        Persona cliente1 = new Persona("12345678-9", "Cristian", "Gutierrez",
                "cristian.gutierrez123@gmail.com", "56912349876", dir1);
        Persona cliente2 = new Persona("15432987-6", "Roberto", "Araya",
                "roberto123araya@email.com", "56913131234", dir2);

        System.out.println("Clientes:\n");
        System.out.println("Persona: " + cliente1);
        System.out.println();
        System.out.println("Persona: " + cliente2);
        System.out.println();




        Empleado guia = new Empleado("19876543-2", "Fernanda", "Acevedo",
                "fernandaacevedo@email.com", "569 98765432", dir3, "Guia Turístico",
                865000, "02-09-2019");

        System.out.println("Empleado Guía:\n");
        System.out.println(guia);
        System.out.println();
    }
}