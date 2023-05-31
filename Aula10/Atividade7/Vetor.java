package Aula10.Atividade7;

public class Vetor {

    private int[] elementos;

    public Vetor(int[] elementos){
        this.elementos = elementos;
    }

    public int maiorRecursivo(){
        return maiorRecursivo(0, elementos.length - 1);
    }

    private int maiorRecursivo(int inicio, int fim){
        if(inicio == fim){
            return elementos[inicio];
        }
        else{
            int meio = (inicio + fim) / 2;
            int maiorEsquerda = maiorRecursivo(inicio, meio);
            int maiorDireita = maiorRecursivo(meio + 1, fim);
            return Math.max(maiorEsquerda, maiorDireita);
        }
    }

    public int maiorIterativo(){
        int maior = elementos[0];

        for(int i = 1; i < elementos.length; i++){
            if(elementos[i] > maior){
                maior = elementos[i];
            }
        }
        return maior;
    }
    
}