package Trabalho2;

public class Pilha {
    private Noh topo;
    private int tamanho;

    public Pilha() {
        topo = null;
        tamanho = 0;
    }

    public void push(Aluno aluno) {
        Noh novoNo = new Noh(aluno);
        novoNo.setProximo(topo);
        topo = novoNo;
        tamanho++;
    }

    public Aluno pop() {
        if (isEmpty()) {
            throw new IllegalStateException("A pilha está vazia. ");
        }
        Aluno aluno = topo.getAluno();
        topo = topo.getProximo();
        tamanho--;
        return aluno;
    }

    public Aluno top() {
        if (isEmpty()) {
            throw new IllegalStateException("A pilha está vazia. ");
        }
        return topo.getAluno();
    }

    public boolean isEmpty() {
        return tamanho == 0;
    }

    public int size() {
        return tamanho;
    }

    public void imprimeFila() {
        if (isEmpty()) {
            System.out.println("A pilha está vazia.");
            return;
        }
        System.out.println("Estado da pilha:");
        Noh atual = topo;
        while (atual != null) {
            System.out.println(atual.getAluno().getNome());
            atual = atual.getProximo();
        }
    }

}
