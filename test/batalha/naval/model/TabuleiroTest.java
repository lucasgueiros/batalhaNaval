/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package batalha.naval.model;

import batalha.naval.model.exceptions.ForaDoTabuleiroException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;

/**
 *
 * @author lucas
 */
@FixMethodOrder (value = MethodSorters.NAME_ASCENDING)
public class TabuleiroTest {
    
    private Tabuleiro t = new Tabuleiro(10);
    
    public TabuleiroTest() {
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
     * Test of posicionarNavio method, of class Tabuleiro.
     * Dentro do tabuleiro
     */
    @Test
    public void testPosicionarNavio1() {
        System.out.println("posicionarNavio");
        int x = 1;
        int y = 1;
        Tabuleiro instance = new Tabuleiro(10);
        instance.posicionarNavio(x, y);
    }

    /**
     * Teste posicionarNavio fora do tabuleiro!
     * Não sei qual o erro...
     */
    @Test (expected = ForaDoTabuleiroException.class)
    public void testPosicionarNavio2() {
        System.out.println("posicionarNavio");
        int x = 20;
        int y = 20;
        Tabuleiro instance = new Tabuleiro(10);
        instance.posicionarNavio(x, y);
    }
    
    /**
     * Teste posicionarNavio no limite do tabuleiro!
     */
    @Test
    public void testPosicionarNavio3() {
        System.out.println("posicionarNavio");
        int x = 10;
        int y = 10;
        Tabuleiro instance = new Tabuleiro(10);
        instance.posicionarNavio(x, y);
    }
    
    /**
     * Teste posicionarNavio fora do tabuleiro negativo!
     */
    @Test (expected = ForaDoTabuleiroException.class)
    public void testPosicionarNavio4() {
        System.out.println("posicionarNavio");
        int x = -1;
        int y = -1;
        Tabuleiro instance = new Tabuleiro(10);
        instance.posicionarNavio(x, y);
    }
    
    /**
     * Teste posicionarNavio fora do tabuleiro negativo!
     */
    @Test (expected = ForaDoTabuleiroException.class)
    public void testPosicionarNavio5() {
        System.out.println("posicionarNavio");
        int x = 0;
        int y = 0;
        Tabuleiro instance = new Tabuleiro(10);
        instance.posicionarNavio(x, y);
    }
    
    /**
     * Teste posicionarNavio MUITOS navios.
     */
    @Test
    public void testPosicionarNavio6() {
        System.out.println("posicionarNavio");
        Tabuleiro instance = new Tabuleiro(10);
        for(int i=1;i<=10;i++){
            for (int j = 1; j <= 10; j++) {
                instance.posicionarNavio(i, j);
            }
        }
    }
    
    /**
     * Teste posicionarNavio fora do tabuleiro!
     * Não sei qual o erro...
     */
    @Test (expected = ForaDoTabuleiroException.class)
    public void testPosicionarNavio7() {
        System.out.println("posicionarNavio");
        int x = 20;
        int y = 3;
        Tabuleiro instance = new Tabuleiro(10);
        instance.posicionarNavio(x, y);
    }
    
    /**
     * Teste integrado: posicionarNavio + getEspaco
     */
    @Test
    public void testPosicionarNavioEGetEspaco(){
        System.out.println("testPosicionarNavioEGetEspaco");
        int x = 1;
        int y = 1;
        Tabuleiro instance = new Tabuleiro(10);
        instance.posicionarNavio(x, y);
        Espaco result = instance.getEspaco(x, y);
        Espaco expected = Espaco.NAVIO;
        assertEquals(expected, result);
    }
    
    /**
     * Teste integrado: posicionarNavio + getEspaco
     */
    @Test
    public void testPosicionarNavioEGetEspaco2(){
        System.out.println("testPosicionarNavioEGetEspaco");
        int x = 1;
        int y = 1;
        Tabuleiro instance = new Tabuleiro(10);
        instance.posicionarNavio(x, y);
        Espaco result = instance.getEspaco(x+1, y);
        Espaco expected = Espaco.MAR;
        System.out.println(expected);
        System.out.println(result);
        assertEquals(expected, result);
    }
    
    /**
     * Test of getEspaco method, of class Tabuleiro.
     */
    @Test
    public void testGetEspacoResult() {
        System.out.println("getEspaco");
        int x = 1;
        int y = 1;
        Tabuleiro instance = new Tabuleiro(10);
        Espaco expResult = Espaco.MAR;
        Espaco result = instance.getEspaco(x, y);
        assertEquals(expResult, result);
    }

    /**
     * Test of getEspaco method, of class Tabuleiro.
     */
    @Test
    public void testGetEspacoErro1() {
        System.out.println("getEspaco");
        int x = 1;
        int y = 1;
        Tabuleiro instance = new Tabuleiro(10);
        instance.getEspaco(x, y);
    }
    
    /**
     * Test of getEspaco method, of class Tabuleiro.
     */
    @Test
    public void testGetEspacoErro2() {
        System.out.println("getEspaco");
        int x = 10;
        int y = 10;
        Tabuleiro instance = new Tabuleiro(10);
        instance.getEspaco(x, y);
    }
    
    /**
     * Test of getEspaco method, of class Tabuleiro.
     */
    @Test (expected = ForaDoTabuleiroException.class)
    public void testGetEspacoErro3() {
        System.out.println("getEspaco");
        int x = 11;
        int y = 11;
        Tabuleiro instance = new Tabuleiro(10);
        instance.getEspaco(x, y);
    }
    
    /**
     * Test of getEspaco method, of class Tabuleiro.
     */
    @Test (expected = ForaDoTabuleiroException.class)
    public void testGetEspacoErro4() {
        System.out.println("getEspaco");
        int x = 0;
        int y = 0;
        Tabuleiro instance = new Tabuleiro(10);
        instance.getEspaco(x, y);
    }
    
    /**
     * Test of getEspaco method, of class Tabuleiro.
     */
    @Test (expected = ForaDoTabuleiroException.class)
    public void testGetEspacoErro5() {
        System.out.println("getEspaco");
        int x = -1;
        int y = -1;
        Tabuleiro instance = new Tabuleiro(10);
        instance.getEspaco(x, y);
    }
    
    /**
     * Test of getEspaco method, of class Tabuleiro.
     */
    @Test (expected = ForaDoTabuleiroException.class)
    public void testGetEspacoErro6() {
        System.out.println("getEspaco");
        int x = 20;
        int y = 20;
        Tabuleiro instance = new Tabuleiro(10);
        instance.getEspaco(x, y);
    }
    
    /**
     * Test of getEspaco method, of class Tabuleiro.
     */
    @Test (expected = ForaDoTabuleiroException.class)
    public void testGetEspacoErro7() {
        System.out.println("getEspaco");
        int x = 20;
        int y = 3;
        Tabuleiro instance = new Tabuleiro(10);
        instance.getEspaco(x, y);
    }
    
    /**
     * Test of getNavios method, of class Tabuleiro.
     */
    @Test
    public void testGetQuantidadeDeNavios() {
        System.out.println("testGetQuantidadeDeNavios");
        Tabuleiro instance = new Tabuleiro(10);
        int expResult = 0;
        int result = instance.getQuantidadeDeNavios();
        assertEquals(expResult, result);
    }
    
    /**
     * Teste integrado: posicionarNavios e getQuantidade
     */
    @Test
    public void testPosicionarNaviosEGetQuantidadeDeNavios1() {
        System.out.println("testPosicionarNaviosEGetQuantidadeDeNavios");
        Tabuleiro instance = new Tabuleiro(10);
        int expResult = 3;
        instance.posicionarNavio(1, 1);
        instance.posicionarNavio(2, 2);
        instance.posicionarNavio(3, 3);
        int result = instance.getQuantidadeDeNavios();
        assertEquals(expResult, result);
    }
    
    /**
     * testa se o tamanho tá certo
     */
    @Test
    public void testGetTamanho() {
        System.out.println("getTamanho");
        Tabuleiro instance = new Tabuleiro(10);
        int expResult = 10;
        int result = instance.getTamanho();
        assertEquals(expResult, result);
    }
    
}
