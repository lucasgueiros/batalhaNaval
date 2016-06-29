/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package batalha.naval;

import batalha.naval.controller.JogoController;
import batalha.naval.controller.PosicionarNaviosController;
import batalha.naval.model.Jogo;
import batalha.naval.view.cli.JogoView;
import batalha.naval.view.cli.PosicionarNaviosView;

/**
 *
 * @author 20131D12GR0117
 */
public class BatalhaNaval {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Jogo jogo = new Jogo(10, 3);
        
        PosicionarNaviosView posicionarNaviosView1 = new PosicionarNaviosView(System.in, System.out, "Primeiro Jogador");
        PosicionarNaviosView posicionarNaviosView2 = new PosicionarNaviosView(System.in, System.out, "Segundo Jogador");
        
        PosicionarNaviosController posicionarNaviosController1 = new PosicionarNaviosController(jogo, posicionarNaviosView1, Jogo.Jogador.PRIMEIRO);
        PosicionarNaviosController posicionarNaviosController2 = new PosicionarNaviosController(jogo, posicionarNaviosView2, Jogo.Jogador.SEGUNDO);
        
        JogoView jogoView1 = new JogoView(System.in, System.out, 10);
        JogoView jogoView2 = new JogoView(System.in, System.out, 10);
        
        JogoController jogoController1 = new JogoController(jogo, jogoView1, Jogo.Jogador.PRIMEIRO);
        JogoController jogoController2 = new JogoController(jogo, jogoView2, Jogo.Jogador.SEGUNDO);
        
        posicionarNaviosController1.posicionarNavios();
        posicionarNaviosController2.posicionarNavios();
        
        jogoController1.updateView();
        jogoController2.updateView();
        
    }

}
