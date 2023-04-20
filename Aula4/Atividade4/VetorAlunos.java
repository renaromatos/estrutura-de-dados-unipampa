package Aula4.Atividade4;

public class VetorAlunos implements IvetorAlunos{

    private Object[] alunos = new Object[4];
    private int totalAlunos = 0;

    @Override
    public void adiciona(Object aluno) {
        this.garanteEspaco();
        this.alunos[this.totalAlunos] = aluno;
        this.totalAlunos++;     
    }

    @Override
    public int tamanho() {
        return this.totalAlunos++;    
    }

    @Override
    public boolean contem(Object aluno) {
        for(int i = 0; i < alunos.length; i++){
            if(aluno.equals(alunos[i])){
                return true;
            }
        }    
        return false;
    }

    @Override
    public boolean cheio() {
        if(totalAlunos == this.alunos.length){
            return true;
        }    
        else{
            return false;
        }
    }

    @Override
    public boolean remove(Object aluno) {
        int indice = -1;
        for(int i = 0; i < totalAlunos; i++){
            if(aluno == this.alunos[i]){
                indice = i;
                break;
            }
        }        
        if(indice != -1){
            for(int i = indice; i < alunos.length - 1; i++){
                alunos[i] = alunos[i + 1];
            }
            totalAlunos--;
            return true;
        }
        return false;
    }

    private void garanteEspaco(){
        if(this.cheio()){
            Object[] novoAlunos = new Object[this.alunos.length * 2];
            for(int i = 0; i < this.alunos.length; i++){
                novoAlunos[i] = this.alunos[i];
            }
            this.alunos = novoAlunos;
        }
    }
    
}
