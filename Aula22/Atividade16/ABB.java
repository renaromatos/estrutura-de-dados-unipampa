package Aula22.Atividade16;

//codigo reaproveitado da atividade 15
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

    public Noh buscaIterativa(int elemento){
        Noh aux = this.raiz;

        while(aux != null){
            if(aux.valor == elemento){
                return aux;
            }
            if(elemento < aux.valor){
                aux = aux.esquerda;
            }
            if(elemento > aux.valor){
                aux = aux.direita;
            }
        }
        return null;
    }

    public Noh buscaRecursiva(int elemento){
        return buscaRecursiva(this.raiz, elemento);
    }

    private Noh buscaRecursiva(Noh noh, int elemento){
        if(noh == null){
            return null;
        }
        if(elemento == noh.valor){
            return noh;
        }
        if(elemento < noh.valor){
            return buscaRecursiva(noh.esquerda, elemento);
        }
        else{
            return buscaRecursiva(noh.direita, elemento);
        }
    }

    //metodo de impressao em profundidade
    public void printPreOrdem(){
        printPreOrdem(this.raiz);
    }

    private void printPreOrdem(Noh noh){
        if(noh != null){
            System.out.println(noh.valor);
            printPreOrdem(noh.esquerda);
            printPreOrdem(noh.direita);
        }
    }

    //metodo de impressao em profundidade
    public void printPosOrdem(){
        printPosOrdem(this.raiz);
    }

    private void printPosOrdem(Noh noh){
        if(noh != null){
            printPosOrdem(noh.esquerda);
            printPosOrdem(noh.direita);
            System.out.println(noh.valor);
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
