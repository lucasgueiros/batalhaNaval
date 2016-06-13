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
public class Jogo {

    private Tabuleiro jogador1;
    private Tabuleiro jogador2;
    private Espaco[][] tabuleiroJogador1 = new Espaco[10][10];
    private Espaco[][] tabuleiroJogador2 = new Espaco[10][10];

    public Jogo() {
        jogador1 = new Tabuleiro(3);
        jogador2 = new Tabuleiro(3);
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                tabuleiroJogador1[i][j] = tabuleiroJogador2[i][j] = Espaco.MAR;
            }
        }
    }

    // jogador = 1 => print tabuleiro para Jogador1
    // jogador = 2 => print tabuleiro para Jogador2
    public String printJogoJogador(int jogador) {
        Espaco[][] tabuleiro = null;
        Espaco[][] outroTabuleiro = null;
        if (jogador == 1) {
            tabuleiro = this.tabuleiroJogador1;
            outroTabuleiro = this.tabuleiroJogador2;
        } else {
            tabuleiro = this.tabuleiroJogador2;
            outroTabuleiro = this.tabuleiroJogador1;
        }

        // daqui pra baixo é igual
        String saida = "Tabuleiro do Jogador " + jogador + ":\n";

        saida += "+---+---+---+---+---+---+---+---+---+---+\n";
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                switch (tabuleiro[i][j]) {
                    case MAR:
                        saida += "| ~ ";
                        break;
                    case MAR_ATINGIDO:
                        saida += "| * ";
                        break;
                    case NAVIO:
                        saida += "| $ ";
                        break;
                    case NAVIO_ATINGIDO:
                        saida += "| X ";
                        break;
                }
            }
            saida += "|\n+---+---+---+---+---+---+---+---+---+---+\n";
        }

        saida += "\n\nTabuleiro do Outro Jogador:\n";

        saida += "+---+---+---+---+---+---+---+---+---+---+\n";
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                switch (tabuleiro[i][j]) {
                    case MAR:
                        saida += "| ~ ";
                        break;
                    case MAR_ATINGIDO:
                        saida += "| * ";
                        break;
                    case NAVIO:
                        saida += "| ~ ";
                        break;
                    case NAVIO_ATINGIDO:
                        saida += "| X ";
                        break;
                }
            }
            saida += "|\n+---+---+---+---+---+---+---+---+---+---+\n";
        }

        return saida;
    }

}
