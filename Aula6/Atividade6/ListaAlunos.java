package Aula6.Atividade6;

public interface ListaAlunos {
    public void insereInicio(Object aluno);
    public void insereFim(Object aluno);
    public boolean estahVazia();
    public boolean remove(Object aluno);
    public int tamanho();
    public void imprimeListaInicioEFim();
}
