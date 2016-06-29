/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package batalha.naval.model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author lucas
 */
public class JogoTest {
    
    public JogoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of posicionarNavio method, of class Jogo.
     */
    @Test
    public void testPosicionarNavio() {
        System.out.println("posicionarNavio");
        Jogo.Jogador j = null;
        int x = 0;
        int y = 0;
        Jogo instance = null;
        instance.posicionarNavio(j, x, y);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEspaco method, of class Jogo.
     */
    @Test
    public void testGetEspaco() {
        System.out.println("getEspaco");
        Jogo.Jogador j = null;
        int x = 0;
        int y = 0;
        Jogo instance = null;
        Espaco expResult = null;
        Espaco result = instance.getEspaco(j, x, y);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEspacoAdversario method, of class Jogo.
     */
    @Test
    public void testGetEspacoAdversario() {
        System.out.println("getEspacoAdversario");
        Jogo.Jogador jogador = null;
        int i = 0;
        int j = 0;
        Jogo instance = null;
        Espaco expResult = null;
        Espaco result = instance.getEspacoAdversario(jogador, i, j);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTamanho method, of class Jogo.
     */
    @Test
    public void testGetTamanho() {
        System.out.println("getTamanho");
        Jogo instance = new Jogo(10, 3);
        int expResult = 10;
        int result = instance.getTamanho();
        assertEquals(expResult, result);
    }

    /**
     * Test of getNavios method, of class Jogo.
     */
    @Test
    public void testGetNavios() {
        System.out.println("getNavios");
        Jogo instance = new Jogo(10, 3);
        int expResult = 3;
        int result = instance.getNavios();
        assertEquals(expResult, result);
    }
    
}
