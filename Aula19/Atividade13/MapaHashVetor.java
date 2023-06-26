package Aula19.Atividade13;

public class MapaHashVetor {
    private Aluno[] vetor;
    private int tamanho;

    public MapaHashVetor() {
        this.vetor = new Aluno[20];
        this.tamanho = 0;
    }

    private int hash(int chave) {
        return chave % this.vetor.length;
    }

    public Aluno get(int chave) {
        int hash = hash(chave);
        return this.vetor[hash];
    }

    public void put(int chave, Aluno valor) {
        int sondagem = 0;
        int hash;
        while (sondagem < vetor.length) {
            hash = (hash(chave) + sondagem) % vetor.length;
            if (vetor[hash] == null || vetor[hash].getMatricula() == chave) {
                vetor[hash] = valor;
                tamanho++;
                if (tamanho >= vetor.length * 0.75) {
                    rehashing();
                }
                return;
            }
            sondagem++;
        }
    }

    public Aluno remove(int chave) {
        int hash = hash(chave);
        Aluno aluno = this.vetor[hash];
        this.vetor[hash] = null;
        tamanho--;
        return aluno;
    }

    private void resize(int novoTamanho) {
        Aluno[] novoVetor = new Aluno[novoTamanho];
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] != null) {
                int novaHash = hash(vetor[i].getMatricula());
                novoVetor[novaHash] = vetor[i];
            }
        }
        this.vetor = novoVetor;
    }

    private void rehashing() {
        int novoTamanho = this.vetor.length * 2;
        resize(novoTamanho);
    }
}
