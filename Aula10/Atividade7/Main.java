package Aula10.Atividade7;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int size = 1000;
        Vetor vetor = geraVetor(size);

        long inicioRecursivo = System.nanoTime();
        int maiorRecursivo = vetor.maiorRecursivo();
        long fimRecursivo = System.nanoTime();
        long tempoRecursivo = fimRecursivo - inicioRecursivo;

        System.out.println("Maior elemento (recursivo): " + maiorRecursivo + "\nTempo de execução (recursivo): " + tempoRecursivo);

        long inicioIterativo = System.nanoTime();
        int maiorIterativo = vetor.maiorIterativo();
        long fimIterativo = System.nanoTime();
        long tempoIterativo = fimIterativo - inicioIterativo;

        System.out.println("Maior elemento (iterativo): " + maiorIterativo + "\nTempo de execução(iterativo): " + tempoIterativo);

    }

    public static Vetor geraVetor(int size){
        Random random = new Random();
        int[] elementos = new int[size];

        for(int i = 0; i < size; i++){
            elementos[i] = random.nextInt();
        }
        return new Vetor(elementos);
    }
}
