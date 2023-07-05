package Aula22.Atividade16;

//codigo reaproveitado da atividade 15
public class Noh {
    int valor;
    Noh esquerda;
    Noh direita;
    Noh pai;

    Noh(int v){
        this.valor = v;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Noh getEsquerda() {
        return esquerda;
    }

    public void setEsquerda(Noh esquerda) {
        this.esquerda = esquerda;
    }

    public Noh getDireita() {
        return direita;
    }

    public void setDireita(Noh direita) {
        this.direita = direita;
    }

    public Noh getPai() {
        return pai;
    }

    public void setPai(Noh pai) {
        this.pai = pai;
    }

}
