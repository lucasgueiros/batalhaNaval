/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package batalha.naval.negocio;

/**
 *
 * @author lucas
 */
public class Tabuleiro {

    private int navios = 0;
    private int tamanho;
    private Espaco[][] tabuleiro;

    public Tabuleiro(int tamanho) {
        this.tamanho = tamanho;
        tabuleiro = new Espaco[this.tamanho][this.tamanho];
        for (int i = 0; i < tabuleiro.length; i++) {
            for (int j = 0; j < tabuleiro[i].length; j++) {
                tabuleiro[i][j] = Espaco.MAR;
            }
        }
    }

    public void posicionarNavio(int x, int y) {

        if (navios == 3) {
            return;
        }
        navios++;

        tabuleiro[x][y] = Espaco.NAVIO;
    }
    
    public Espaco getEspaco(int x, int y) {
        return tabuleiro[x][y];
    }

    public int getNavios() {
        return navios;
    }

    public int getTamanho() {
        return tamanho;
    }
    
}
