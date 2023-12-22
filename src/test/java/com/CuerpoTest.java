package com;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class CuerpoTest {

    @Test
    public void testSetNombre() {
        Cuerpo cuerpo = new Cuerpo("", 0.0);
        cuerpo.setNombre("Sol");
        assertEquals("Sol", cuerpo.getNombre());
    }

    @Test
    public void testSetMasa() {
        Cuerpo cuerpo = new Cuerpo("", 0.0);
        cuerpo.setMasa(5.0);
        assertEquals(5.0, cuerpo.getMasa(), 0.001); // Utilizamos un margen de tolerancia
    }

    @Test
    public void testConstructor() {
        Cuerpo cuerpo = new Cuerpo("Tierra", 6.0);
        assertEquals("Tierra", cuerpo.getNombre());
        assertEquals(6.0, cuerpo.getMasa(), 0.001); // Utilizamos un margen de tolerancia
    }
}
