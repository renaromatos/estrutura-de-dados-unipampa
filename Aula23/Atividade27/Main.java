package Aula23.Atividade27;

public class Main {
    public static void main(String[] args) {
        ArvoreAVL arvoreAVL = new ArvoreAVL();

        arvoreAVL.raiz = arvoreAVL.insercao(arvoreAVL.raiz, 51);
        arvoreAVL.raiz = arvoreAVL.insercao(arvoreAVL.raiz, 57);
        arvoreAVL.raiz = arvoreAVL.insercao(arvoreAVL.raiz, 98);
        arvoreAVL.raiz = arvoreAVL.insercao(arvoreAVL.raiz, 19);
        arvoreAVL.raiz = arvoreAVL.insercao(arvoreAVL.raiz, 11);
        arvoreAVL.raiz = arvoreAVL.insercao(arvoreAVL.raiz, 45);
        arvoreAVL.raiz = arvoreAVL.insercao(arvoreAVL.raiz, 79);

        arvoreAVL.preOrder(arvoreAVL.raiz);
    }
}
