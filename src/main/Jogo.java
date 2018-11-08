package main;

import components.Palavra;
import components.Jogador;
import graphics.TelaJogo;
import java.util.ArrayList;

public class Jogo {

    static Jogador jogador = new Jogador();

    public static void main(String[] args) {
        String palavra = Palavra.gerar();
        TelaJogo.mostrarLacunas();
        TelaJogo.pegarEntrada();
    }
    
    public boolean tratarEntrada(char entrada) {
        return true;
    }
    
    public boolean checarJogadas(char entrada) {
        //ESSE METODO IRÁ RECEBER UMA ENTRADA E VERIFICAR SE A PALAVRA CONTEM A LETRA!
        for (Character jogada : jogador.getListaJogadas()) {
            if (entrada == jogada) {
                return false;
            }
        }

        return true;
    }

    public void adicionarJogada() {
        //jogador.setListaJogadas(TelaJogo.pegarEntrada());
    }

}
