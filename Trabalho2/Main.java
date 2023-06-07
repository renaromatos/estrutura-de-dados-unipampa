package Trabalho2;

public class Main {
    public static void main(String[] args) {
        
        FilaAlunos fila = new FilaAlunos();
        fila.entraNaFila(new Aluno("Aluno1"));
        fila.entraNaFila(new Aluno("Aluno2"));
        fila.entraNaFila(new Aluno("Aluno3"));
        fila.entraNaFila(new Aluno("Aluno4"));
        fila.entraNaFila(new Aluno("Aluno5"));

        Pilha pilha = new Pilha();

        while (!fila.estahVazia()) {
            pilha.push(fila.saiDaFila());
        }
        pilha.imprimeFila();
    }
    
}
