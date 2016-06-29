/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package batalha.naval.model;

import batalha.naval.model.exceptions.ForaDoTabuleiroException;
import batalha.naval.model.exceptions.MuitosNaviosException;
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
    
    /**
     * Test of posicionarNavio method, of class Jogo.
     */
    @Test
    public void testPosicionarNavio() throws MuitosNaviosException, ForaDoTabuleiroException {
        System.out.println("posicionarNavio");
        Jogo.Jogador j = Jogo.Jogador.PRIMEIRO;
        int x = 1;
        int y = 1;
        Jogo instance = new Jogo(10, 3);
        instance.posicionarNavio(j, x, y);
    }

    /**
     * Test of getEspaco method, of class Jogo.
     */
    @Test
    public void testGetEspaco() throws ForaDoTabuleiroException {
        System.out.println("getEspaco");
        Jogo.Jogador j = Jogo.Jogador.PRIMEIRO;
        int x = 1;
        int y = 1;
        Jogo instance = new Jogo(10, 3);
        Espaco expResult = Espaco.MAR;
        Espaco result = instance.getEspaco(j, x, y);
        assertEquals(expResult, result);
    }

    /**
     * Test of getEspacoAdversario method, of class Jogo.
     */
    @Test
    public void testGetEspacoAdversario() throws ForaDoTabuleiroException {
        System.out.println("getEspacoAdversario");
        Jogo.Jogador j = Jogo.Jogador.PRIMEIRO;
        int x = 1;
        int y = 1;
        Jogo instance = new Jogo(10, 3);
        Espaco expResult = Espaco.DESCONHECIDO;
        Espaco result = instance.getEspacoAdversario(j, x, y);
        assertEquals(expResult, result);
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
