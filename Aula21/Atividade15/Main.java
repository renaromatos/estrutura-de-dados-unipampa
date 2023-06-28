package Aula21.Atividade15;

public class Main {
    public static void main(String[] args) {
        ABB abb = new ABB();

        abb.add(1);
        abb.add(2);
        abb.add(3);
        abb.add(4);
        abb.add(5);

        abb.imprimir();

        int folha1 = 2;
        int folha2 = 7;

        boolean busca1 = abb.busca(folha1);
        boolean busca2 = abb.busca(folha2);//false

        System.out.println("Folha " + folha1 + " foi encontrada? " + busca1);
        System.out.println("Folha " + folha2 + " foi encontrada? " + busca2);
    }
}
