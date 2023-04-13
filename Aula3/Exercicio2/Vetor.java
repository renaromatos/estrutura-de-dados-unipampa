package Aula3.Exercicio2;

public class Vetor {
    
    private Aluno[] alunos = new Aluno[5];
    private int totalAlunos;

    public void adiciona(Aluno aluno){
        if(totalAlunos == alunos.length){
            return;
        }
        else{
            this.alunos[this.totalAlunos] = aluno;
            this.totalAlunos++;
        }
    }

    public boolean contem(Aluno aluno){
        for(int i = 0; i < alunos.length; i++){
            if(aluno.equals(alunos[i])){
                return true;
            }
        }
        return false;
    }

    public int tamanho(){
        return this.totalAlunos;
    }
}
