package com;

import java.util.Scanner;

public class InterfazUsuario {

    static Cuerpo leerCuerpo(Scanner scanner) {
        System.out.print("Nombre del cuerpo celeste: ");
        String nombre = scanner.nextLine();
        System.out.print("Masa del cuerpo celeste (kg): ");
        double masa = Double.parseDouble(scanner.nextLine());

        return new Cuerpo(nombre, masa);
    }

    static double leerDistancia(Scanner scanner) {
        System.out.print("Escribe la distancia entre los cuerpos: ");
        double distancia = Double.parseDouble(scanner.nextLine());

        return distancia;
    }

    static void mostrarResultado(double fuerza) {
        System.out.println("Fuerza de atraccion gravitatoria: " + fuerza + " N");
    }
}
