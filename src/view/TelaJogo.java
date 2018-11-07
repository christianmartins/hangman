package view;

import java.util.Scanner;
import core.Palavra;

public class TelaJogo {
    
    public static String mostrarPalavra(){
        String palavra;
        int tamanho;
        
        return "palavra";
    }
    
    public static char pegarEntrada() {
        Scanner sc = new Scanner(System.in);
        char letra;
        do{
            System.out.println("Qual letra a palavra possui?");
            System.out.println("Digite seu chute: ");
            letra = sc.nextLine().charAt(0);
            
            if(letra >= 97 && letra <= 122) System.out.println("Entrada inválida!\n\n");
        }while(letra >= 97 && letra <= 122);
        
        System.out.println(">> Pegando Entrada do Jogo <<");
        return letra;
    }

    //Verficiando Acerto/Erro
    public void mostrAlerta(boolean acertou) {
        if (acertou) {
            System.out.println(">Acertou<");
            System.out.println("*** ***");
            System.out.println(" *   * ");
            System.out.println("**   ** ");
            System.out.println(" *   * ");
            System.out.println(" *   * ");
            System.out.println("*** ***");
        } else {
            System.out.println(">Errou<");
            System.out.println("+++ +++");
            System.out.println(" +   + ");
            System.out.println("++   ++ ");
            System.out.println(" +   + ");
            System.out.println(" +   + ");
            System.out.println("+++ +++");
        }
    }
}
