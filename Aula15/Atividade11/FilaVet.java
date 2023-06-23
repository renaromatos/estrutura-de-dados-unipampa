package Aula15.Atividade11;

public class FilaVet implements IFila {
    private int nElemFila;
    private int inicio;
    protected Object[] vetFila;

    public FilaVet(int tamFila) {
        this.nElemFila = 0;
        this.inicio = 0;
        this.vetFila = new Object[tamFila];
    }

    @Override
    public boolean add(Object info) {
        if (this.nElemFila == vetFila.length) {
            System.out.println("Capacidade da fila esgotada!");
            return false;
        }
        int fim = (this.inicio + this.nElemFila) % this.vetFila.length;
        this.vetFila[fim] = info;
        this.nElemFila++;
        return true;
    }

    @Override
    public boolean remove() {
        if (this.isEmpity()) {
            System.out.println("A fila está vazia!");
            return false;
        }
        this.inicio = (this.inicio + 1) % this.vetFila.length;
        this.nElemFila--;
        return true;
    }

    @Override
    public boolean isEmpity() {
        return this.nElemFila == 0;
    }

    @Override
    public int size() {
        return this.nElemFila;
    }
    
    public void imprimirFila() {
        if (this.isEmpity()) {
            System.out.println("A fila está vazia!");
            return;
        }
        int n = this.inicio;
        for (int i = 0; i < this.nElemFila; i++) {
            System.out.print(this.vetFila[n] + " ");
            n = (n + 1) % this.vetFila.length;
        }
    }
}