package Aula19.Atividade13;

public class Main {
    public static void main(String[] args) {
        MapaHashVetor mapa = new MapaHashVetor();

        mapa.put(10, new Aluno(10, "Aluno10"));
        mapa.put(20, new Aluno(20, "Aluno20"));
        mapa.put(30, new Aluno(30, "Aluno30"));
        mapa.put(15, new Aluno(15, "Aluno15"));
        mapa.put(25, new Aluno(25, "Aluno25"));

        // Busca alunos
        Aluno aluno1 = mapa.get(10);
        System.out.println("Aluno de matrícula 10: " + aluno1.getNome());

        Aluno aluno2 = mapa.get(30);
        System.out.println("Aluno de matrícula 30: " + aluno2.getNome());

        // Remove aluno
        Aluno alunoRemovido = mapa.remove(20);
        System.out.println("Aluno removido: " + alunoRemovido.getNome());

        // Adiciona mais alunos
        mapa.put(40, new Aluno(40, "Aluno40"));
        mapa.put(50, new Aluno(50, "Aluno50"));

        // Busca alunos
        Aluno aluno3 = mapa.get(15);
        System.out.println("Aluno de matrícula 15: " + aluno3.getNome());

        Aluno aluno4 = mapa.get(40);
        System.out.println("Aluno de matrícula 40: " + aluno4.getNome());
    }
}
