package components;

import java.util.Random;

public class Palavra {
    private String[] armazem;
    
    public static String gerar(){
        Random gerador = new Random();
        String[] armazem = {
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

        return armazem[gerador.nextInt(armazem.length)];
    }
    
    public static String verLacunas(){
        int tamanho = gerar().length();
        String lacunas = "";
        
        for(int i = 0; i < tamanho; i++)
        {
            lacunas += "__ ";
        }
        
        return lacunas;
    }
}
