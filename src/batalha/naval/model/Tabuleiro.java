/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package batalha.naval.model;

/**
 *
 * @author lucas
 */
public class Tabuleiro {
    
    private final Espaco [][] tabuleiro = new Espaco[10][10];
    private int countNavios;
    private final int maxNavios;
    
    public Tabuleiro(int maxNavios) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                tabuleiro[i][j] = Espaco.MAR;
            }
        }
        this.maxNavios = maxNavios;
        this.countNavios = 0;
    }
    
    /**
     * Para vizualizar, obviamente.
     * 
     * @param paraDono mostrar para o dono ou para outro jogador?
     * @return uma tabela com a situação atual do tabuleiro
     */
    Espaco [][] vizualizar(boolean paraDono) {
        Espaco [][] exportando = new Espaco[10][10];
        for(int i=0;i<exportando.length;i++) {
            for(int j=0;j<exportando[0].length;j++) {
                exportando[i][j] = tabuleiro[i][j];
                if( !paraDono || !tabuleiro[i][j].revelado() ){
                    exportando[i][j] = Espaco.MAR;
                }
            }
        }
        return exportando;
    }
    
    public void atirar(int linha, int coluna) {
        tabuleiro[linha][coluna].revelar();
    }
    
    public void setNavio(int linha, int coluna) {
        this.countNavios++;
        tabuleiro[linha][coluna] = Espaco.NAVIO;
    }
    
    public void unsetNavio(int linha, int coluna) {
        if(tabuleiro[linha][coluna]==Espaco.NAVIO)
            this.countNavios--;
        tabuleiro[linha][coluna] = Espaco.MAR;
    }
    
}
