package Aula16.Atividade12;

public class Main {
    public static void main(String[] args) {
        FilaLista filaLista = new FilaLista();

        Alunos alunos1 = new Alunos("Aluno1");
        Alunos alunos2 = new Alunos("Aluno2");
        Alunos alunos3 = new Alunos("Aluno3");
        Alunos alunos4 = new Alunos("Aluno4");
        Alunos alunos5 = new Alunos("Aluno5");

        filaLista.add(alunos1);
        filaLista.add(alunos2);
        filaLista.add(alunos3);
        filaLista.add(alunos4);
        filaLista.add(alunos5);
        
        filaLista.imprimeFila();

    }
}
