/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import components.Palavra;
import components.Jogador;
import graphics.TelaJogo;

/**
 *
 * @author alunoti
 */
public class Jogo {
    Jogador jogador;
    
    public static void main(String[] args){
        String palavra = Palavra.gerarPalavra();
        TelaJogo.mostrarPalavra(palavra);
        TelaJogo.pegarEntrada();        
    }
       
    public Jogo(){
        jogador = new Jogador();
    }
    
   public void adicionarJogada(){
       //jogador.setListaJogadas(TelaJogo.pegarEntrada());
   }
    
}
