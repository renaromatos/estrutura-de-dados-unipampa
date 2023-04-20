package Aula4.Atividade4;

public class Main {
    public static void main(String[] args) {

        int numero = 9;
        VetorAlunos vetorAlunos = new VetorAlunos();
        Aluno aluno1 = new Aluno("Aluno1", 14, 8);

        vetorAlunos.adiciona(aluno1);
        vetorAlunos.adiciona("String");
        vetorAlunos.adiciona(numero);

        System.out.println(vetorAlunos.contem(aluno1));
        System.out.println(vetorAlunos.tamanho());

        vetorAlunos.remove(aluno1);

        System.out.println(vetorAlunos.tamanho());

    }
}
