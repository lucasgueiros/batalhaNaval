/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package batalha.naval.controller;

import batalha.naval.model.Jogo;
import batalha.naval.model.exceptions.ForaDoTabuleiroException;
import batalha.naval.model.exceptions.MuitosNaviosException;
import batalha.naval.view.cli.PosicionarNaviosView;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lucas
 */
public class PosicionarNaviosController {
    
    private Jogo model;
    private PosicionarNaviosView view; 
    private Jogo.Jogador jogador;

    public PosicionarNaviosController(Jogo model, PosicionarNaviosView view, Jogo.Jogador jogador) {
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

    public PosicionarNaviosView getView() {
        return view;
    }

    public void setView(PosicionarNaviosView view) {
        this.view = view;
    }

    public Jogo.Jogador getJogador() {
        return jogador;
    }

    public void setJogador(Jogo.Jogador jogador) {
        this.jogador = jogador;
    }
    
    public void posicionarNavios() {
        view.lerPosicoes();
        for (int i = 0; i < model.getNavios(); i++) {
            try {
                model.posicionarNavio(jogador, view.getLinha(i), view.getColuna(i));
            } catch (MuitosNaviosException ex) {
                Logger.getLogger(PosicionarNaviosController.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ForaDoTabuleiroException ex) {
                Logger.getLogger(PosicionarNaviosController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
