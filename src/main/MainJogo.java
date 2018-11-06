package main;

import core.Palavra;
import view.TelaJogo;

public class MainJogo 
{
    public static void main(String[] args) 
    {
        System.out.println(TelaJogo.pegandoEntrada());
        System.out.println(Palavra.gerarPalavra());
    }
    
}
