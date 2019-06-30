/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import calculadorarepositorio.CalculadoraRepositorio;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author USUARIO
 */
public class CalculadoraTestRepositorio {
    
    public CalculadoraTestRepositorio() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void Before() {
        System.out.println("Before");
    }
    
    @After
    public void After() {
        System.out.println("After");
    }
    
    @Test
    
    public void testsuma(){
        int resultado=CalculadoraRepositorio.suma(6,2);
        int esperado=8;
        assertEquals(esperado,resultado);
    }
     @Test
        public void testresta(){
        int resultado=CalculadoraRepositorio.resta(3,2);
        int esperado=1;
        assertEquals(esperado,resultado);
        System.out.println("El resultado es 1");    
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
