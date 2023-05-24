package Prova1.Questao1;

public class Intersecao {
    public static void main(String[] args) {
        int[] vet1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] vet2 = {4, 5, 6, 7, 8};
        int[] vetIntersecao = encontrarIntersecao(vet1, vet2);
        
        System.out.println("Elementos em comum:");
        for (int elemento : vetIntersecao) {
            System.out.print(elemento + " ");
        }
    }
    
    public static int[] encontrarIntersecao(int[] vet1, int[] vet2) {
        int tamanhovet1 = vet1.length;
        int tamanhovet2 = vet2.length;
        int[] vetIntersecaoTemp = new int[tamanhovet1];
        int cont = 0;
        
        for (int i = 0; i < tamanhovet1; i++) {
            for (int j = 0; j < tamanhovet2; j++) {
                if (vet1[i] == vet2[j]) {
                    vetIntersecaoTemp[cont] = vet1[i];
                    cont++;
                    break;
                }
            }
        }
        
        int[] vetIntersecao = new int[cont];
        
        for (int i = 0; i < cont; i++) {
            vetIntersecao[i] = vetIntersecaoTemp[i];
        }
        
        return vetIntersecao;
    }
}
