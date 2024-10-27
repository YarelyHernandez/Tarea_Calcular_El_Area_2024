package th.geom.calcularelarea_junit_app;


import static org.junit.Assert.*;
import org.junit.Test;

public class AppTest {

    @Test
    public void testCalcularAreaCirculo() {
        assertEquals(28.27, App.calcularAreaCirculo(3), 0.01);
        assertEquals(78.54, App.calcularAreaCirculo(5), 0.01);
        assertEquals(12.57, App.calcularAreaCirculo(2), 0.01);
    }

    @Test
    public void testCalcularAreaCuadrado() {
        assertEquals(16.0, App.calcularAreaCuadrado(4), 0.01);
        assertEquals(9.0, App.calcularAreaCuadrado(3), 0.01);
        assertEquals(1.0, App.calcularAreaCuadrado(1), 0.01);
    }

    @Test
    public void testCalcularAreaRectangulo() {
        assertEquals(20.0, App.calcularAreaRectangulo(5, 4), 0.01);
        assertEquals(50.0, App.calcularAreaRectangulo(10, 5), 0.01);
        assertEquals(6.0, App.calcularAreaRectangulo(3, 2), 0.01);
    }

    @Test
    public void testCalcularAreaTriangulo() {
        assertEquals(10.0, App.calcularAreaTriangulo(5, 4), 0.01);
        assertEquals(25.0, App.calcularAreaTriangulo(10, 5), 0.01);
        assertEquals(3.0, App.calcularAreaTriangulo(3, 2), 0.01);
    }
}


