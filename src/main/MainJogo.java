package main;

import core.Palavra;
import view.TelaJogo;

public class MainJogo 
{
    public static void main(String[] args) 
    {
        String palavra = Palavra.gerarPalavra();
        TelaJogo.mostrarPalavra(palavra);
        TelaJogo.pegarEntrada();        
    }
    
}
