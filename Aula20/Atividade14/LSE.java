package Aula20.Atividade14;

public class LSE {

    protected Noh inicio;

    public void insereInicio(Object info) {
        Noh novo = new Noh(info);
        if (inicio == null) {
            inicio = novo;
        } else {
            novo.setProximo(inicio);
            inicio = novo;
        }
    }

    public void insereFim(Object info) {
        Noh novo = new Noh(info);
        if (inicio == null) {
            inicio = novo;
        } else {
            Noh ultimo = null;
            for (Noh i = inicio; i != null; i = i.getProximo()) {
                ultimo = i;
            }
            ultimo.setProximo(novo);
        }
    }

    public boolean estahVazia() {
        return inicio == null;
    }

    public boolean remove(Object info) {
        Noh ant = null, p;
        p = inicio;
        while (p != null && !p.getInfo().equals(info)) {
            ant = p;
            p = p.getProximo();
        }
        if (p == null) {
            return false;
        }
        if (ant == null) {
            inicio = p.getProximo();
        } else {
            ant.setProximo(p.getProximo());
        }
        return true;
    }

    public void removeInicio() {
        if (inicio != null) {
            inicio = inicio.getProximo();
        }
    }

    public int tamanho() {
        int tam = 0;
        Noh n = inicio;
        while (n != null) {
            tam++;
            n = n.getProximo();
        }
        return tam;
    }

    public void imprimeLista() {
        Noh n = inicio;
        while (n != null) {
            System.out.print(n.getInfo() + " ");
            n = n.getProximo();
        }
        System.out.println();
    }

    public Noh getInicio() {
        return inicio;
    }

    public Noh getProximo(Noh noh) {
        return noh.getProximo();
    }
}
