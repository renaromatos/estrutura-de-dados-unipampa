package Aula12.Atividade9;

class Vetor {
    protected int[] elementos; //usar protected para a instanciação na main poder acessar as variáveis.
    protected int totalElementos;

    public Vetor(int tamanho) {
        elementos = new int[tamanho];
        totalElementos = 0;
    }

    public void adicionarElemento(int elemento) {
        elementos[totalElementos++] = elemento;
    }

    public void bubbleSort() {
        long startTime = System.nanoTime();

        for (int i = 0; i < totalElementos; i++) {
            for (int j = 0; j < totalElementos - 1; j++) {
                if (elementos[j] > elementos[j + 1]) {
                    int aux = elementos[j];
                    elementos[j] = elementos[j + 1];
                    elementos[j + 1] = aux;
                }
            }
        }

        long endTime = System.nanoTime();
        double duration = (endTime - startTime) / 1_000_000_000.0;
        System.out.println("Tempo de execução do Bubble Sort: " + duration + " segundos");
    }

    public void selectionSort() {
        long startTime = System.nanoTime();

        for (int i = 0; i < totalElementos; i++) {
            int menor = i;
            for (int j = i + 1; j < totalElementos; j++) {
                if (elementos[j] < elementos[menor]) {
                    menor = j;
                }
            }
            int aux = elementos[i];
            elementos[i] = elementos[menor];
            elementos[menor] = aux;
        }

        long endTime = System.nanoTime();
        double duration = (endTime - startTime) / 1_000_000_000.0;
        System.out.println("Tempo de execução do Selection Sort: " + duration + " segundos");
    }

    public void insertionSort() {
        long startTime = System.nanoTime();

        for (int i = 1; i < totalElementos; i++) {
            int chave = elementos[i];
            int j = i - 1;
            while (j >= 0 && chave < elementos[j]) {
                elementos[j + 1] = elementos[j];
                j--;
            }
            elementos[j + 1] = chave;
        }

        long endTime = System.nanoTime();
        double duration = (endTime - startTime) / 1_000_000_000.0;
        System.out.println("Tempo de execução do Insertion Sort: " + duration + " segundos");
    }

    public void exibirVetor() {
        for (int i = 0; i < totalElementos; i++) {
            System.out.println(elementos[i]);
        }
    }
}