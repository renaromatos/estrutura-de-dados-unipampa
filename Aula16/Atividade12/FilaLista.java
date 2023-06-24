package Aula16.Atividade12;

public class FilaLista implements IFila{
    private Noh inicio;
    private Noh fim;

    public FilaLista(){
        this.inicio = null;
        this.fim = null;
    }

    @Override
    public boolean add(Object info) {
        Noh novo = new Noh(info);
        if(this.isEmpity()){
            inicio = novo;
        }
        else{
            fim.setProx(novo);
        }
        fim = novo;
        return true;
    }

    @Override
    public boolean remove() {
        if(!isEmpity()){
            if(inicio == fim){
                inicio = null;
                fim = null;
            }
            else{
                inicio = inicio.getProx();
            }
            return true;
        }
        return false;
    }

    @Override
    public boolean isEmpity() {
        return inicio == null;
    }

    @Override
    public int size() {
        int count = 0;
        Noh n = inicio;
        while(n != null){
            count++;
            n = n.getProx();
        }
        return count;
    }

    @Override
    public void imprimeFila() {
        Noh n = inicio;
        while(n != null){
            Alunos aluno = (Alunos) n.getInfo();
            System.out.println(aluno.getNome());
            n = n.getProx();
        }
    }
}
