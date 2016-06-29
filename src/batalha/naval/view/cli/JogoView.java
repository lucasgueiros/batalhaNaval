/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package batalha.naval.view.cli;

import batalha.naval.model.Espaco;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;

/**
 * Mostra dois tabuleiros: um do próprio jogador e outro do adversário. Não
 * cuida de nada da lógica, apenas exibe as informações que lhe forem
 * concedidadas.
 *
 * @author lucas
 */
public class JogoView {

    private final InputStream input;
    private final PrintStream output;

    public JogoView(InputStream in, PrintStream out, int tam) {
        this.tam = tam;
        proprio = new Espaco[tam][tam];
        adversario = new Espaco[tam][tam];
        this.input = in;
        this.output = out;
    }

    private final int tam;
    private final Espaco[][] proprio;
    private final Espaco[][] adversario;
    private String estado = "Inicio";

    public void setEspacoAdversario(int linha, int coluna, Espaco valor) {
        this.adversario[linha][coluna] = valor;
    }

    public void setEspacoProprio(int linha, int coluna, Espaco valor) {
        this.proprio[linha][coluna] = valor;
    }

    public Espaco getEspacoProprio(int linha, int coluna) {
        return this.proprio[linha][coluna];
    }

    public Espaco getEspacoAdversario(int linha, int coluna) {
        return this.adversario[linha][coluna];
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void mostrarTabuleiroProprio() {
        output.println("Seu tabuleiro:\n");
        output.println(tabuleiroToString(proprio));
    }

    public void mostrarTabuleiroAdversario() {
        output.println("Tabuleiro adversário:\n");
        output.println(tabuleiroToString(adversario));
    }

    private String tabuleiroToString(Espaco[][] tabuleiro) {
        String saida = "+---+---+---+---+---+---+---+---+---+---+\n";
        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
                saida += "| " + tabuleiro[i][j] + " ";
            }
            saida += "|\n+---+---+---+---+---+---+---+---+---+---+\n";
        }
        return saida;
    }

    public void mostrarEstado() {
        output.println("Situação atual do jogo: " + estado);
    }

}
