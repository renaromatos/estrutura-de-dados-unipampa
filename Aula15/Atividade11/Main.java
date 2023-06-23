package Aula15.Atividade11;

public class Main {
    public static void main(String[] args) {
        FilaVet fila = new FilaVet(10);

        fila.add(5);
        fila.add(10);
        fila.add(3);
        fila.add(8);
        fila.add(1);
        fila.add(7);
        fila.add(2);
        fila.add(9);
        fila.add(4);
        fila.add(6);
        
        System.out.println("Elementos da fila:");
        fila.imprimirFila();
    }
}
