package Aula5.Atividade5;

public class Noh {
    
    private Object info;
    private Noh proximo;

    public Noh(Object info) {
        this.info = info;
        this.proximo = null;
    }

    public Object getInfo() {
        return info;
    }

    public void setInfo(Object info) {
        this.info = info;
    }

    public Noh getProximo() {
        return proximo;
    }

    public void setProximo(Noh n) {
        this.proximo = n;
    }
    
}
