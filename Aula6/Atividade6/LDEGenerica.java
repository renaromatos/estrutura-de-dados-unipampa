package Aula6.Atividade6;

public class LDEGenerica implements ListaAlunos{
    private Noh inicio;
    private Noh fim;

    public LDEGenerica(){
        this.inicio = null;
        this.fim = null;
    }

    @Override
    public void insereInicio(Object aluno) {
        Noh novo = new Noh(aluno);

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
    public void insereFim(Object aluno) {
        Noh novo = new Noh(aluno);
        
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

    public void busca(Object aluno){
        Noh p = inicio;
        
        while(p != null && p.getAluno() != aluno){
            p = p.getProx();
            if(p.getAluno() == aluno){
                remove(p.getAluno());
            }
        }
        throw new IllegalArgumentException("Aluno não econtrado.");
    }

    @Override
    public boolean remove(Object aluno) {
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
    public void imprimeListaInicioEFim() {
        Noh n = inicio;
        
        System.out.println("Imprimindo do inicio:");
        while(n != null){
            System.out.println(n.getAluno() + " ");
            n = n.getProx();
        }

        System.out.println("\nImprimindo do fim:");
        n = fim;
        while(n != null){
            System.out.println(n.getAluno() + " ");
            n = n.getAnt();
        }
        System.out.println();
    }
    
}
