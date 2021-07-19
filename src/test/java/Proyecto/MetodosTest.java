/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Mauricio
 */
public class MetodosTest {
    
    public MetodosTest() {
    }

    @org.junit.Test
    public void testSuma() {
        System.out.println("suma");
        int a = 4;
        int b = 5;
        Metodos instance = new Metodos();
        int expResult = 9;
        int result = instance.suma(a, b);
        assertEquals(expResult, result);
    }
    @org.junit.Test
    public void testSuma2() {
        System.out.println("suma2");
        int a = 3;
        int b = 1;
        Metodos instance = new Metodos();
        int expResult = 4;
        int result = instance.suma(a, b);
        assertEquals(expResult, result);
    }
    @org.junit.Test
    public void testDivision() {
        System.out.println("division");
        int a = 3;
        int b = 1;
        Metodos instance = new Metodos();
        int expResult = 3;
        int result = instance.division(a, b);
        assertEquals(expResult, result);
    }
    @org.junit.Test
    public void testMultiplicacion() {
        System.out.println("multiplicacion");
        int a = 3;
        int b = 1;
        Metodos instance = new Metodos();
        int expResult = 3;
        int result = instance.multiplicacion(a, b);
        assertEquals(expResult, result);
    }
    @org.junit.Test
    public void testResta() {
        System.out.println("resta");
        int a = 3;
        int b = 1;
        Metodos instance = new Metodos();
        int expResult = 2;
        int result = instance.resta(a, b);
        assertEquals(expResult, result);
    }
    
}
