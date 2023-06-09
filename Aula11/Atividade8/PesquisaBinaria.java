package Aula11.Atividade8;

public class PesquisaBinaria {
    
    public static int pesquisaIteratica(int[] vetor, int valor){
        int inicio = 0;
        int fim = vetor.length - 1;

        while(inicio <= fim){
            int meio = (inicio + fim) / 2;
            if(vetor[meio] == valor){
                return meio;
            }
            else if(vetor[meio] < valor){
                inicio = meio + 1;
            }
            else{
                fim = meio - 1;
            }
        }
        return -1;
    }

    public static int pesquisaRecursiva(int[] vetor, int valor, int inicio, int fim){
        if(inicio > fim){
            return -1;
        }

        int meio = (inicio + fim) / 2;

        if(vetor[meio] == valor){
            return meio;
        }
        else if(vetor[meio] < valor){
            return pesquisaRecursiva(vetor, valor, meio + 1, fim);
        }
        else{
            return pesquisaRecursiva(vetor, valor, inicio, meio - 1);
        }
    }
}
