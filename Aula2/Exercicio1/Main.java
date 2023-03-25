package Aula2.Exercicio1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        PontoCartesiano pontoCartesiano = new PontoCartesiano();
        Scanner in = new Scanner(System.in);

        System.out.print("Valor de Xb:");
        pontoCartesiano.setXb(in.nextInt());
        System.out.print("Valor de Xa:");
        pontoCartesiano.setXa(in.nextInt());
        System.out.print("Valor de Yb:");
        pontoCartesiano.setYb(in.nextInt());
        System.out.print("Valor de Ya:");
        pontoCartesiano.setYa(in.nextInt());

        in.close();

        System.out.println("Valor do ponto cartesiano: " + pontoCartesiano.calculaPontoCartesiano());

    }
}
