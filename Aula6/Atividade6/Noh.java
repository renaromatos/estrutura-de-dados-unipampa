package Aula6.Atividade6;

public class Noh {
    private int info;
    private Noh ant;
    private Noh prox;

    public Noh(int info){
        this.info = info;
        this.ant = null;
        this.prox = null;
    }

    public int getInfo() {
        return info;
    }

    public void setInfo(int info) {
        this.info = info;
    }

    public Noh getAnt() {
        return ant;
    }

    public void setAnt(Noh n) {
        this.ant = n;
    }

    public Noh getProx() {
        return prox;
    }

    public void setProx(Noh n) {
        this.prox = n;
    }

    
}
