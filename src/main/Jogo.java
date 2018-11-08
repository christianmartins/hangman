package main;

import components.Palavra;
import components.Jogador;
import graphics.TelaJogo;

public class Jogo {
    
    Jogador jogador;
    
    public static void main(String[] args){
        String palavra = Palavra.gerar();
        TelaJogo.mostrarLacunas();
        TelaJogo.pegarEntrada();        
    }
       
    public Jogo(){
        jogador = new Jogador();
    }
    
   public void adicionarJogada(){
       //jogador.setListaJogadas(TelaJogo.pegarEntrada());
   }
    
}
