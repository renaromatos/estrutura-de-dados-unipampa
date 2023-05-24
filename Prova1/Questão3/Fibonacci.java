package Prova1.Questão3;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 10;
        int resultado = calcularFibonacci(n);
        System.out.println("O " + n + "º termo da série de Fibonacci é: " + resultado);
    }

    public static int calcularFibonacci(int n) {
        int ant = 1;
        int atual = 1;
        int fibonacci = 0;

        for (int i = 3; i <= n; i++) {
            fibonacci = ant + atual;
            ant = atual;
            atual = fibonacci;
        }
        return fibonacci;
    }
}
