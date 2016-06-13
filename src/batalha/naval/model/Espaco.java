/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package batalha.naval.model;

/**
 *
 * @author 20131D12GR0117
 */
enum Espaco {
    MAR, NAVIO, MAR_ATINGIDO, NAVIO_ATINGIDO;
    
    
    private boolean revelado = false;

    public boolean revelado() {
        return revelado;
    }

    void revelar() {
        this.revelado = true;
    }

    @Override
    public String toString() {
        return "Espaco{" + "revelado=" + revelado + '}';
    }
    
}
