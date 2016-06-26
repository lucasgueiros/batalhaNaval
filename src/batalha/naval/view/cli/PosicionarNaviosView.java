/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package batalha.naval.view.cli;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class PosicionarNaviosView {

    // 3 posicoes de 2 coordenadas
    // [x][0] -> linha
    // [x][1] -> coluna
    private int[][] posicoes = new int[3][2];
    private Scanner scan = new Scanner(System.in);
    private String jogador;

    public PosicionarNaviosView(String jogador) {
        this.jogador = jogador;
    }

    public int getLinha(int navio) {
        return posicoes[navio][0];
    }

    public int getColuna(int navio) {
        return posicoes[navio][1];
    }

    private void lerPosicao(int navio) {
        System.out.print((navio+1) + "º Navio: Linha: ");
        posicoes[navio][0] = scan.nextInt();
        System.out.print((navio+1) + "º Navio: Coluna: ");
        posicoes[navio][1] = scan.nextInt();
    }

    public void lerPosicoes() {
        System.out.println(jogador + ", vamos posicionar três navios:");
        for (int i = 0; i < 3; i++) {
            lerPosicao(i);
        }
    }

}
