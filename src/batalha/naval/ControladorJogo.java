/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package batalha.naval;

import batalha.naval.model.Jogo;

/**
 *
 * @author lucas
 */
class ControladorJogo {

    private final Jogo model;
    private final ViewJogo view;

    ControladorJogo(Jogo jogo, ViewJogo view) {
        this.model = jogo;
        this.view = view;
    }
    
}
