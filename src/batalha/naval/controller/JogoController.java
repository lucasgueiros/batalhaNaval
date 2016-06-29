/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package batalha.naval.controller;

import batalha.naval.model.Jogo;
import batalha.naval.model.exceptions.ForaDoTabuleiroException;
import batalha.naval.view.cli.JogoView;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lucas
 */
public class JogoController {
    
    private Jogo model;
    private JogoView view; 
    private Jogo.Jogador jogador;

    public JogoController(Jogo model, JogoView view, Jogo.Jogador jogador) {
        this.model = model;
        this.view = view;
        this.jogador = jogador;
    }

    public Jogo getModel() {
        return model;
    }

    public void setModel(Jogo model) {
        this.model = model;
    }

    public JogoView getView() {
        return view;
    }

    public void setView(JogoView view) {
        this.view = view;
    }

    public Jogo.Jogador getJogador() {
        return jogador;
    }

    public void setJogador(Jogo.Jogador jogador) {
        this.jogador = jogador;
    }
    
    public void updateView() {
        for (int i = 0; i < this.getModel().getTamanho(); i++) {
            for (int j = 0; j < this.getModel().getTamanho(); j++) {
                try {
                    view.setEspacoProprio(i, j, model.getEspaco(jogador, i, j)); // TODO
                } catch (ForaDoTabuleiroException ex) {
                    Logger.getLogger(JogoController.class.getName()).log(Level.SEVERE, null, ex);
                }
                try {
                    view.setEspacoAdversario(i, j, model.getEspacoAdversario(jogador, i, j)); // TODO
                } catch (ForaDoTabuleiroException ex) {
                    Logger.getLogger(JogoController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        view.setEstado("Ininiciando"); // TODO
        
        view.mostrarTabuleiroProprio();
        view.mostrarTabuleiroAdversario();
        view.mostrarEstado();
    }
    
}
