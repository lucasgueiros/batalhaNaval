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
public enum Espaco {
        DESCONHECIDO,MAR,MAR_ATINGIDO,NAVIO,NAVIO_ATINGIDO;

        @Override
        public String toString() {
            
            switch(this) {
                case DESCONHECIDO:
                    return "~";
                case MAR:
                    return "~";
                case MAR_ATINGIDO:
                    return "X";
                case NAVIO:
                    return "$";
                case NAVIO_ATINGIDO:
                    return "#";
            }
            return "";
        }
        
    }
