package com;

public class Principal {

    public static void main(String[] args) {
        try {
            ManejadorIO.mostrarMensaje("Ingrese los datos del primer cuerpo:");
            Cuerpo cuerpo1 = InterfazUsuario.leerCuerpo(ManejadorIO.getScanner());

            ManejadorIO.mostrarMensaje("Ingrese los datos del segundo cuerpo:");
            Cuerpo cuerpo2 = InterfazUsuario.leerCuerpo(ManejadorIO.getScanner());

            double distancia = InterfazUsuario.leerDistancia(ManejadorIO.getScanner());

            double fuerzaGravedad = calcularFuerza(cuerpo1, cuerpo2, distancia);

            InterfazUsuario.mostrarResultado(fuerzaGravedad);

        } catch (Exception e) {
            ManejadorIO.mostrarMensaje("Ocurrió un error inesperado: " + e.getMessage());
        }
    }

    static double calcularFuerza(Cuerpo cuerpo1, Cuerpo cuerpo2, double distancia) {
        double G = 6.672 * Math.pow(10, -11); // Constante de gravitación universal de Newton

        try {
            if (distancia == 0) {
                throw new IllegalArgumentException("La distancia no puede ser cero, los cuerpos no pueden estar en la misma posición.");
            }
        } catch (IllegalArgumentException e) {
            ManejadorIO.mostrarMensaje("Error: " + e.getMessage());
            throw e;
        }

        return (G * cuerpo1.getMasa() * cuerpo2.getMasa()) / Math.pow(distancia, 2);
    }
}
