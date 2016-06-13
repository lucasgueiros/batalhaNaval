/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package batalha.naval;

import batalha.naval.negocio.Jogo;
import java.util.Scanner;

/**
 *
 * @author 20131D12GR0117
 */
public class BatalhaNaval {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        posicionando();
    }

    public static void show() {
        Jogo jogo = new Jogo();
        String saida = jogo.printJogoJogador(2);
        System.out.println(saida);
        System.out.println(jogo.printJogoJogador(2));
    }

    public static void posicionando() {
        Jogo jogo = new Jogo();
        Scanner scan = new Scanner(System.in);
        for (int j = 1; j <= 2; j++) {
            System.out.println("Jogador "+j+", vamos posicionar três navios:");
            for (int i = 1; i <= 3; i++) {
                int x = 0, y = 0;
                System.out.print(i + "º Navio: Linha: ");
                x = scan.nextInt();
                System.out.print(i + "º Navio: Coluna: ");
                y = scan.nextInt();
                jogo.posicionar(j, x, y);
            }
        }

        String saida = jogo.printJogoJogador(1);
        System.out.println(saida);
        System.out.println(jogo.printJogoJogador(2));
    }

}
