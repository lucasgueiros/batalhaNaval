/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package batalha.naval.view.cli;

import batalha.naval.controller.JogoController;
import batalha.naval.model.Jogo;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Integração com Control + View + Model
 * @author lucas
 */
public class JogoViewTest {
    
    public JogoViewTest() {
    }

    /**
     * Test of setEspacoAdversario method, of class JogoView.
     */
    @Test
    public void testSetEspacoAdversario() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        Jogo model = new Jogo(10, 3);
        JogoView view = new JogoView(null, new PrintStream(out), 10);
        JogoController control = new JogoController(model, view, Jogo.Jogador.PRIMEIRO);
        
        //  ok, vamos lá
        // 
        
    }

    /**
     * Test of setEspacoProprio method, of class JogoView.
     */
    @Test
    public void testSetEspacoProprio() {
    }

    /**
     * Test of getEspacoProprio method, of class JogoView.
     */
    @Test
    public void testGetEspacoProprio() {
    }

    /**
     * Test of getEspacoAdversario method, of class JogoView.
     */
    @Test
    public void testGetEspacoAdversario() {
    }

    /**
     * Test of getEstado method, of class JogoView.
     */
    @Test
    public void testGetEstado() {
    }

    /**
     * Test of setEstado method, of class JogoView.
     */
    @Test
    public void testSetEstado() {
    }

    /**
     * Test of mostrarTabuleiroProprio method, of class JogoView.
     */
    @Test
    public void testMostrarTabuleiroProprio() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        Jogo model = new Jogo(3, 1);
        JogoView view = new JogoView(null, new PrintStream(out), 10);
        JogoController control = new JogoController(model, view, Jogo.Jogador.PRIMEIRO);
        out.reset();
        control.updateView();
        assertEquals(""
                + "+-+-+-+"
                + "|~|~|~|"
                + "+-+-+-+"
                + "|~|~|~|"
                + "+-+-+-+"
                + "|~|~|~|"
                + "+-+-+-+"
                + "", out.toString());
    }

    /**
     * Test of mostrarTabuleiroAdversario method, of class JogoView.
     */
    @Test
    public void testMostrarTabuleiroAdversario() {
    }

    /**
     * Test of mostrarEstado method, of class JogoView.
     */
    @Test
    public void testMostrarEstado() {
    }
    
}
