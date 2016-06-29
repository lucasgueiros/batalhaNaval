/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package batalha.naval.model;

import batalha.naval.model.exceptions.ForaDoTabuleiroException;
import batalha.naval.model.exceptions.MuitosNaviosException;

/**
 *
 * @author lucas
 */
public class Tabuleiro {

    private int quantidadeMaximaDeNavios;
    private int quantidadeDeNavios = 0;
    private final int tamanho;
    private final Espaco[][] tabuleiro;

    public Tabuleiro(int tamanho, int navios) {
        this.quantidadeMaximaDeNavios = navios;
        this.tamanho = tamanho;
        tabuleiro = new Espaco[this.tamanho][this.tamanho];
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                this.tabuleiro[i][j] = Espaco.MAR;
            }
        }
    }

    public void posicionarNavio(int x, int y) throws MuitosNaviosException, ForaDoTabuleiroException {

        if(quantidadeDeNavios==quantidadeMaximaDeNavios){
            throw new MuitosNaviosException("muitos navios!");
        }
        
        quantidadeDeNavios++;

        this.setEspaco(x, y, Espaco.NAVIO);
    }
    
    public final void setEspaco(int linha, int coluna, Espaco e) throws ForaDoTabuleiroException {
        if(linha < 1){
            throw new ForaDoTabuleiroException("linha < 1");
        } else if(linha > tamanho) {
            throw new ForaDoTabuleiroException("linha > tamanho");
        } else if(coluna < 1){
            throw new ForaDoTabuleiroException("coluna < 1");
        } else if(coluna > tamanho){
            throw new ForaDoTabuleiroException("coluna > tamanho");
        }
        this.tabuleiro[linha-1][coluna-1] = e;
    }
    
    public final Espaco getEspaco(int linha, int coluna) throws ForaDoTabuleiroException {
        if(linha < 1){
            throw new ForaDoTabuleiroException("linha < 1");
        } else if(linha > tamanho) {
            throw new ForaDoTabuleiroException("linha > tamanho");
        } else if(coluna < 1){
            throw new ForaDoTabuleiroException("coluna < 1");
        } else if(coluna > tamanho){
            throw new ForaDoTabuleiroException("coluna > tamanho");
        }
        return tabuleiro[linha-1][coluna-1];
    }

    public int getQuantidadeDeNavios() {
        return quantidadeDeNavios;
    }

    public int getTamanho() {
        return tamanho;
    }
    
}
