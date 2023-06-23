package Aula12.Atividade9;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(1000);
        Random random = new Random();

        for (int i = 0; i < 1000; i++) {
            vetor.adicionarElemento(random.nextInt());
        }

        Vetor vetorBubbleSort = new Vetor(1000);
        vetorBubbleSort.elementos = vetor.elementos.clone();
        vetorBubbleSort.totalElementos = vetor.totalElementos;
        vetorBubbleSort.bubbleSort();

        Vetor vetorSelectionSort = new Vetor(1000);
        vetorSelectionSort.elementos = vetor.elementos.clone();
        vetorSelectionSort.totalElementos = vetor.totalElementos;
        vetorSelectionSort.selectionSort();

        Vetor vetorInsertionSort = new Vetor(1000);
        vetorInsertionSort.elementos = vetor.elementos.clone();
        vetorInsertionSort.totalElementos = vetor.totalElementos;
        vetorInsertionSort.insertionSort();

    }
}