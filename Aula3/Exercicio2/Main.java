package Aula3.Exercicio2;

public class Main {
    public static void main(String[] args) {
        
        Vetor vetor = new Vetor();
        Aluno aluno1 = new Aluno("Aluno1", 20, 8.5);
        Aluno aluno2 = new Aluno("Aluno2", 22, 9);

        vetor.adiciona(aluno1);
        vetor.adiciona(aluno2);
        System.out.println(vetor.contem(aluno1));
        System.out.println(vetor.contem(aluno2));
        System.out.println(vetor.tamanho());

    }
    
}
