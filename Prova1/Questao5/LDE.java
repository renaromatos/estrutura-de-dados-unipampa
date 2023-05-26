package Prova1.Questao5;

public class LDE implements Lista{
    private Noh inicio;
    private Noh fim;

    public LDE(){
        this.inicio = null;
        this.fim = null;
    }

    @Override
    public void insereInicio(int info) {
        Noh novo = new Noh(info);
        
        if(inicio == null){
            inicio = novo;
            fim = novo;
        }
        else{
            novo.setProx(inicio);
            inicio.setProx(novo);
            inicio = novo;
        }
    }

    @Override
    public void insereFim(int info) {
        Noh novo = new Noh(info);

        if(fim == null){
            inicio = novo;
            fim = novo;
        }
        else{
            novo.setAnt(fim);
            fim.setProx(novo);
            fim = novo;
        }
    }

    @Override
    public int nroPares() {
        Noh n = inicio;
        int count = 0;

        while(inicio != null){
            if(n.getInfo() % 2 == 0){
                count++;
            }
            n = n.getProx();
        }
        return count;
    }
    
}
