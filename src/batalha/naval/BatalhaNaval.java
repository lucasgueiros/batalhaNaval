/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package batalha.naval;

import batalha.naval.model.Jogo;

/**
 *
 * @author 20131D12GR0117
 */
public class BatalhaNaval {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Jogo jogo = new Jogo();
        ViewJogo view = new ViewJogo();
        ControladorJogo controlador = new ControladorJogo(jogo,view);
        
        System.out.println(jogo.printJogoJogador(1));
        System.out.println(jogo.printJogoJogador(2));
    }
    
}
