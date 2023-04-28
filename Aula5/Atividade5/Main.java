package Aula5.Atividade5;

public class Main {
    public static void main(String[] args) {
        Lista lista = new LSE();

        System.out.println("A lista está vazia? " + lista.estahVazia()); //true
        
        lista.insereFim(12);
        lista.insereInicio("nome");
        lista.insereInicio(10);
        System.out.println("Tamanho: " + lista.tamanho());

        lista.imprimeLista();

        lista.remove(8);
        lista.remove("nome");

        lista.imprimeLista();

        System.out.println("A lista está vazia? " + lista.estahVazia()); //false
        System.out.println("Tamanho: " + lista.tamanho());

    }
}
