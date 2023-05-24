package Aula6.Atividade6;

public class Main {
    public static void main(String[] args) {
        
        Lista lista = new LDE();

        lista.insereInicio(5);
        lista.insereInicio(3);
        lista.insereFim(9);
        lista.insereFim(10);

        lista.imprimeListaInicioEFim();

        lista.remove(3);

        lista.imprimeListaInicioEFim();
    }
}
