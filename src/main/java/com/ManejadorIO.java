package com;

import java.util.Scanner;

public class ManejadorIO {

    private static Scanner scanner = new Scanner(System.in);

    public static Scanner getScanner() {
        return scanner;
    }

    public static void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}