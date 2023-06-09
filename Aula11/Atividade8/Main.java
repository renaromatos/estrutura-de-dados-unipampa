package Aula11.Atividade8;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int tamanho = 1000;
        int[] vetor = new int[tamanho];
        Random random = new Random();

        for(int i = 0; i < tamanho; i++){
            vetor[i] = random.nextInt(1000);
        }
        //ordena o vetor
        Arrays.sort(vetor);
        //pesquisa o último elemento
        int valor = vetor[tamanho - 1];
     
        long comecoTempoIterativo = System.nanoTime();
        int resultadoPesquisaIterativa = PesquisaBinaria.pesquisaIteratica(vetor, valor);
        long fimTempoIterativo = System.nanoTime();
        long tempoIterativo = fimTempoIterativo - comecoTempoIterativo;

        if(resultadoPesquisaIterativa == -1){
            System.out.println("Valor da pesquisa iterativa não foi encontrado.");
        }
        else{
            System.out.println("Valor da pesquisa iterativa encontrado na posição: " + resultadoPesquisaIterativa + " em " + tempoIterativo + " segundos.");
        }

        long comecoTempoRecursivo = System.nanoTime();
        int resultadoPesquisaRecursiva = PesquisaBinaria.pesquisaRecursiva(vetor, valor, 0, tamanho - 1);
        long fimTempoRecursivo = System.nanoTime();
        long tempoRecursivo = fimTempoRecursivo - comecoTempoRecursivo;

        if(resultadoPesquisaRecursiva == - 1){
            System.out.println("Valor da pesquisa recursiva não foi encontrado.");
        }
        else{
            System.out.println("Valor da pesquisa recursiva encontrado na posição: " + resultadoPesquisaRecursiva + " em " + tempoRecursivo + "segundos.");
        }
    }
}
