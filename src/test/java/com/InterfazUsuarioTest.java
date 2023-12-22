package com;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class InterfazUsuarioTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final InputStream originalIn = System.in;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
        System.setIn(originalIn);
    }

    @Test
    public void testLeerCuerpo() {
        // Simular entrada del usuario
        String input = "Sol\n1000000\n";
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        // Llamar al método leerCuerpo
        Cuerpo cuerpo = InterfazUsuario.leerCuerpo(ManejadorIO.getScanner());

        // Verificar que el cuerpo se haya creado correctamente
        assertNotNull(cuerpo);
        assertEquals("Sol", cuerpo.getNombre());
        assertEquals(1000000.0, cuerpo.getMasa(), 0.001);
    }

    @Test
    public void testMostrarResultado() {
        // Redirigir la salida estándar para capturarla
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // Llamar al método mostrarResultado
        InterfazUsuario.mostrarResultado(50.5);

        // Verificar que la salida es la esperada
        assertEquals("Fuerza de atraccion gravitatoria: 50.5 N\n", outContent.toString().replace("\r", ""));
    }
}


