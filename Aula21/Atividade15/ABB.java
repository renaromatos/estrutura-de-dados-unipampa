package Aula21.Atividade15;

public class ABB {
    private Noh raiz;

    public boolean isEmpty(){
        return this.raiz == null;
    }

    public void add(int elemento){
        if(isEmpty()){
            this.raiz = new Noh(elemento);
        }
        else{
            Noh aux = this.raiz;
            while(aux != null){
                if(elemento < aux.valor){
                    if(aux.esquerda == null){
                        Noh newNoh = new Noh(elemento);
                        aux.esquerda = newNoh;
                        newNoh.pai = aux;
                        return;
                    }
                    aux = aux.esquerda;
                }
                else{
                    if(aux.direita == null){
                        Noh newNoh = new Noh(elemento);
                        aux.direita = newNoh;
                        newNoh.pai = aux;
                        return;
                    }
                    aux = aux.direita;
                }
            }
        }
    }

    public void recursiveAdd(int elemento){
        if(isEmpty()){
            this.raiz = new Noh(elemento);
        }
        else{
            recursiveAdd(this.raiz, elemento);
        }
    }

    private void recursiveAdd(Noh noh, int elemento){
        if(elemento < noh.valor){
            if(noh.esquerda == null){
                Noh newNoh = new Noh(elemento);
                noh.esquerda = newNoh;
                newNoh.pai = noh;
                return;
            }
            recursiveAdd(noh.esquerda, elemento);
        }
        else{
            if(noh.direita == null){
                Noh newNoh = new Noh(elemento);
                noh.direita = newNoh;
                newNoh.pai = noh;
                return;
            }
            recursiveAdd(noh.direita, elemento);
        }
    }

    public boolean busca(int elemento){
        return buscaRecursiva(raiz, elemento);
    }

    private boolean buscaRecursiva(Noh noh, int elemento){
        if(noh == null){
            return false;
        }
        if(elemento == noh.valor){
            return true;
        }
        else if(elemento < noh.valor){
            return buscaRecursiva(noh.esquerda, elemento);
        }
        else{
            return buscaRecursiva(noh.direita, elemento);
        }
    }

    public void imprimir(){
        if(isEmpty()){
            System.out.println("A árvore está vazia.");
        }
        else{
            System.out.println("Impressão em órdem: ");
            imprimirEmOrdem(raiz);
        }
    }

    private void imprimirEmOrdem(Noh noh){
        if(noh != null){
            imprimirEmOrdem(noh.esquerda);
            System.out.println(noh.valor + " ");
            imprimirEmOrdem(noh.direita);
        }
    }
}
