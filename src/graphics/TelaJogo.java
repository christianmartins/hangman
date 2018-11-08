package graphics;

import java.util.Scanner;
import components.Palavra;
import main.Jogo;

public class TelaJogo {
    
    public static char pegarEntrada() {
        Scanner sc = new Scanner(System.in);
        char letra;
        
        System.out.println("Qual letra a palavra possui?");
        do{
            System.out.print("> Digite seu chute: ");
            letra = sc.next().charAt(0);
            
            if(!Jogo.tratarEntrada(letra)){
                System.out.println("Entrada inválida!");
                System.out.println("Digite apenas uma letra de A - Z.");
            }
        }while(!Jogo.tratarEntrada(letra));
        
        return letra;
    }
    
    public static void mostrarLacunas() {
        System.out.println("\n" + Palavra.verLacunas() + "\n");
    }

    //Verficiando Acerto/Erro
    public void mostrarAlerta(boolean acertou) {
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
