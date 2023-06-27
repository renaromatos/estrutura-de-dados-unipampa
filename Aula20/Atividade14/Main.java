package Aula20.Atividade14;

public class Main {
    public static void main(String[] args) {
        MapaHashLSE mapa = new MapaHashLSE();

        Aluno aluno1 = new Aluno("João", 12345);
        Aluno aluno2 = new Aluno("Maria", 67890);
        Aluno aluno3 = new Aluno("Pedro", 54321);

        //teste put
        mapa.put(aluno1.getMatricula(), aluno1);
        mapa.put(aluno2.getMatricula(), aluno2);
        mapa.put(aluno3.getMatricula(), aluno3);

        // Testa get
        System.out.println("Aluno com matrícula 12345: " + mapa.get(12345));
        System.out.println("Aluno com matrícula 67890: " + mapa.get(67890));
        System.out.println("Aluno com matrícula 54321: " + mapa.get(54321));

        mapa.remove(67890);

        // Testa imprimirMapa
        mapa.imprimirMapa();
    }

}
