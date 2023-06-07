package Trabalho2;

public class FilaAlunos {
    private Noh inicio;
    private Noh fim;
    private int tamanho;

    public FilaAlunos() {
        inicio = null;
        fim = null;
        tamanho = 0;
    }

    public int tamanho() {
        return tamanho;
    }

    public boolean estahVazia() {
        return tamanho == 0;
    }

    public void entraNaFila(Aluno aluno) {
        Noh novoNo = new Noh(aluno);
        if (estahVazia()) {
            inicio = novoNo;
        } else {
            fim.setProximo(novoNo);
        }
        fim = novoNo;
        tamanho++;
    }

    public Aluno saiDaFila() {
        if (estahVazia()) {
            throw new IllegalStateException("A fila está vazia. ");
        }
        Aluno aluno = inicio.getAluno();
        inicio = inicio.getProximo();
        if (inicio == null) {
            fim = null;
        }
        tamanho--;
        return aluno;
    }

}
