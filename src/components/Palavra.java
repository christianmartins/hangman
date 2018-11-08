package components;

import java.util.Random;

public class Palavra {
    
    public static String gerarPalavra(){
        Random gerador = new Random();
        String[] palavras = {
            "Casa", "Apartamento",
            "Guerreiro", "Arqueiro", "Mago", "Necromante", "Paladino",
            "Abacaxi", "Abacate", "Melancia",
            "Paralelepípedo", "Trapézio", "Cone", 
            "Elefante", "Leopardo", "Guepardo", "Hipopótamo", "Hiena",
            "Maremoto", "Tsunami", "Terremoto",
            "Telefone",
            "Micro-ondas",
            "Teclado",
            "Cabelo",
            "Avaliando",
            "Monitor"
        };

        return palavras[gerador.nextInt(palavras.length)];
    }        
}
