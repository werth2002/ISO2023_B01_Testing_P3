package com;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.fail;

public class PrincipalTest {

    @Test
    public void testCalcularFuerzaDistanciaCero() {
        try {
            double fuerzaGravedad = Principal.calcularFuerza(new Cuerpo("Cuerpo1", 100.0), new Cuerpo("Cuerpo2", 200.0), 0);

            // Este test debería lanzar una excepción y no llegar aquí
            fail("Se esperaba una excepción debido a la distancia cero.");
        } catch (IllegalArgumentException e) {
            assertEquals("La distancia no puede ser cero, los cuerpos no pueden estar en la misma posición.", e.getMessage());
        }
    }

    @Test
    public void testCalcularFuerza() {
        Cuerpo cuerpo1 = new Cuerpo("Cuerpo1", 10.0);
        Cuerpo cuerpo2 = new Cuerpo("Cuerpo2", 15.0);
        double fuerza = Principal.calcularFuerza(cuerpo1, cuerpo2, 20.0);
    }
}
