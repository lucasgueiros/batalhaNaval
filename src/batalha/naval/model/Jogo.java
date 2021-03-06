/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package batalha.naval.model;

import batalha.naval.model.exceptions.ForaDoTabuleiroException;
import batalha.naval.model.exceptions.MuitosNaviosException;
import java.util.EnumMap;
import java.util.Map;

/**
 *
 * @author 20131D12GR0117
 */
public class Jogo {

    public enum Jogador{
        PRIMEIRO,SEGUNDO;
        
        Jogador getAdversario() {
            if(this==PRIMEIRO) return SEGUNDO;
            else  return PRIMEIRO;
        }
        
    }
    
    private final int tamanho;
    private Map<Jogador,Tabuleiro> tabuleiros = new EnumMap<>(Jogador.class);
    private final int navios;
    
    public Jogo(int tamanho, int navios) {
        this.tamanho = tamanho;
        this.navios = navios;
        tabuleiros.put(Jogador.PRIMEIRO, new Tabuleiro(tamanho,navios));
        tabuleiros.put(Jogador.SEGUNDO, new Tabuleiro(tamanho,navios));
    }

    
    public void posicionarNavio(Jogador j, int x, int y) throws MuitosNaviosException, ForaDoTabuleiroException {
        tabuleiros.get(j).posicionarNavio(x, y);
    }
    
    public Espaco getEspaco(Jogador j, int x, int y) throws ForaDoTabuleiroException {
        return tabuleiros.get(j).getEspaco(x, y);
    }
    
    public Espaco getEspacoAdversario(Jogador jogador, int i, int j) throws ForaDoTabuleiroException {
        Espaco e = getEspaco(jogador.getAdversario(), i, j);
        switch(e) {
            case MAR_ATINGIDO:
                return Espaco.MAR_ATINGIDO;
            case NAVIO_ATINGIDO:
                return Espaco.NAVIO_ATINGIDO;
            default:
                return Espaco.DESCONHECIDO;
        }
    }

    public int getTamanho() {
        return tamanho;
    }
    
    public int getNavios() {
        return navios;
    }
        
}
