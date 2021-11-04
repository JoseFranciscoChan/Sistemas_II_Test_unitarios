/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author J-CHAN
 */
public class CalculatorTest {
    
    Operaciones operacion1 = new Operaciones();
    
    
    @Test
    public void testSuma1(){
        assertEquals(5, operacion1.suma(3,2));
    }
    
    @Test
    public void testSuma2(){
        assertEquals(-3, operacion1.suma(-1,-2));
    }
    
        @Test
    public void testResta1(){
        assertEquals(5, operacion1.resta(7,2));
    }
    
    @Test
    public void testResta2(){
        assertEquals(-3, operacion1.resta(-4,-1));
    }

    @Test
    public void testMultiplicacion1(){
        assertEquals(6, operacion1.multiplicacion(3,2));
    }
    
    @Test
    public void testMultiplicacion2(){
        assertEquals(6, operacion1.multiplicacion(-3,-2));
    }    
    

    @Test
    public void testDivision1(){
        assertEquals(3, operacion1.division(6,2));
    }
    
    @Test
    public void testDivision2(){
        assertEquals(3, operacion1.division(-6,-2));
    }
    
    @Test
    public void testExponenciacion1(){
        assertEquals(4, operacion1.exponenciacion(2, 2));
    }
    
    @Test
    public void testExponenciacion2(){
        assertEquals(4, operacion1.exponenciacion(-2,2));
    }
    
    @Test
    public void testRaiz_cuadrada1(){
        assertEquals(9, operacion1.raiz_cuadrada(81));
    }
    
    @Test
    public void testRaiz_cuadrada2(){
        assertEquals(5, operacion1.raiz_cuadrada(25));
    }
    
    @Test
    public void testPorcentaje1(){
        assertEquals(60, operacion1.porcentaje(300, 20));
    }
    
    @Test
    public void testPorcentaje2(){
        assertEquals(175, operacion1.porcentaje(500, 35));
    }
    public CalculatorTest() {
    }

    
}
