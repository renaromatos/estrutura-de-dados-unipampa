package Trabalho2;

public class Noh {
    private Aluno aluno;
    private Noh proximo;

    public Noh(Aluno aluno) {
        this.aluno = aluno;
        this.proximo = null;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public Noh getProximo() {
        return proximo;
    }

    public void setProximo(Noh proximo) {
        this.proximo = proximo;
    }
}
