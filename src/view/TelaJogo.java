package view;

import java.util.Scanner;

public class TelaJogo {

    public static char pegandoEntrada() {
        Scanner sc = new Scanner(System.in);
        System.out.println(">> Digite uma Letra: ");
        char letra = sc.nextLine().charAt(0);
        System.out.println(">> Pengando Entrada do Jogo <<");
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
