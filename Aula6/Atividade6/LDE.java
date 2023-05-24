package Aula6.Atividade6;

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
    public boolean estahVazia() {
        if(inicio != null && fim != null){
            return false;
        }
        else{
            return true;
        }
    }

    public void busca(int info){
        Noh p = inicio;

        while(p != null && p.getInfo() != info){
            p = p.getProx();
            if(p.getInfo() == info){
                remove(p.getInfo());
            }
        }
        throw new IllegalArgumentException("Elemento não encontrado");
    }

    @Override
    public boolean remove(int info) {
        Noh p = inicio;

        if(p == inicio){
            inicio = p.getProx();
            if(inicio != null){
                inicio.setAnt(null);
            }
            else{
                fim = null;
            }
        }
        else if(p.getProx() == null){
            p.getAnt().setProx(null);
            fim = p.getAnt();
        }
        else{
            p.getAnt().setProx(p.getProx());
            p.getProx().setAnt(p.getAnt());
        }
        return true;
    }

    @Override
    public int tamanho() {
        int tam = 0;
        Noh n = inicio;
        while(n != null){
            tam++;
            n = n.getProx();
        }
        return tam;
    }

    @Override
    public void imprimeListaInicioEFim(){
        Noh n = inicio;

        System.out.println("Imprimirando do inicio:");
        while(n != null){
            System.out.print(n.getInfo() + " ");
            n = n.getProx();
        }

        System.out.println("\nImprimindo do fim:");
        n = fim;
        while(n != null){
            System.out.print(n.getInfo() + " ");
            n = n.getAnt();
        }
        System.out.println();
    }
}
