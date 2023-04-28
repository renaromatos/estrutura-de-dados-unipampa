package Aula5.Atividade5;

public class LSE implements Lista{

    private Noh inicio;

    @Override
    public void insereInicio(Object info) {
        Noh novo = new Noh(info);
        if(inicio == null){
            inicio = novo;
        }
        else{
            novo.setProximo(inicio);
            inicio = novo;
        }
    }

    @Override
    public void insereFim(Object info) {
        Noh novo = new Noh(info);
        if(inicio == null){
            inicio = novo;
        }
        else{
            Noh ultimo = null;
            for(Noh i = inicio; i != null; i = i.getProximo()){
                ultimo = i;
            }
            ultimo.setProximo(novo);
        }
    }

    @Override
    public boolean estahVazia() {
        if(inicio != null){
            return false;
        }
        else{
            return true;
        }
    }

    @Override
    public boolean remove(Object info) {
        Noh ant = null, p;
        p = inicio;
        while(p != null && p.getInfo() != info){
            ant = p;
            p = p.getProximo();
        }
        if(p == null){
            return false;
        }
        if(ant == null){
            inicio = p.getProximo();
        }
        else{
            ant.setProximo(p.getProximo());
        }
        return true;
    }

    @Override
    public int tamanho() {
        int tam = 0;
        Noh n = inicio;
        while(n != null){
            tam++;
            n = n.getProximo();
        }
        return tam;
    }

    @Override
    public void imprimeLista(){
        Noh n = inicio;
        while(n != null){
            System.out.print(n.getInfo() + " ");
            n = n.getProximo();
        }
        System.out.println();
    }
    
}
