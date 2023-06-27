package Aula20.Atividade14;

public class MapaHashLSE {
    private LSE[] vetorLista;
    private int tamanho;
    private static final int CAPACIDADE_INICIAL = 10;
    private static final double FATOR_CARGA_MAX = 0.75;

    public MapaHashLSE() {
        this.vetorLista = new LSE[CAPACIDADE_INICIAL];
        this.tamanho = 0;
    }

    public void put(int chave, Aluno valor) {
        if (precisaRedimensionar()) {
            resize();
        }

        int hash = hash(chave);
        LSE alunosLista = this.vetorLista[hash];

        if (alunosLista == null) {
            alunosLista = new LSE();
            alunosLista.insereInicio(valor);
            this.vetorLista[hash] = alunosLista;
            this.tamanho++;
        } else {
            for (Noh n = alunosLista.getInicio(); n != null; n = n.getProximo()) {
                if (((Aluno) n.getInfo()).getMatricula() == chave) {
                    n.setInfo(valor);
                    return;
                }
            }
            alunosLista.insereInicio(valor);
            this.tamanho++;
        }
    }

    public void remove(int chave) {
        int hash = hash(chave);
        LSE alunosLista = this.vetorLista[hash];

        if (alunosLista != null) {
            Noh anterior = null;
            for (Noh atual = alunosLista.getInicio(); atual != null; atual = atual.getProximo()) {
                if (((Aluno) atual.getInfo()).getMatricula() == chave) {
                    if (anterior == null) {
                        alunosLista.removeInicio();
                    } else {
                        anterior.setProximo(atual.getProximo());
                    }
                    this.tamanho--;
                    return;
                }
                anterior = atual;
            }
        }
    }

    public Aluno get(int chave) {
        int hash = hash(chave);
        LSE alunosLista = this.vetorLista[hash];

        if (alunosLista != null) {
            for (Noh n = alunosLista.getInicio(); n != null; n = n.getProximo()) {
                if (((Aluno) n.getInfo()).getMatricula() == chave) {
                    return (Aluno) n.getInfo();
                }
            }
        }
        return null;
    }

    private int hash(int chave) {
        return chave % this.vetorLista.length;
    }

    private boolean precisaRedimensionar() {
        double cargaAtual = (double) this.tamanho / this.vetorLista.length;
        return cargaAtual >= FATOR_CARGA_MAX;
    }

    private void resize() {
        int novoTamanho = this.vetorLista.length * 2;
        LSE[] novoVetorLista = new LSE[novoTamanho];

        for (int i = 0; i < this.vetorLista.length; i++) {
            LSE alunosLista = this.vetorLista[i];
            if (alunosLista != null) {
                Noh atual = alunosLista.getInicio();
                while (atual != null) {
                    Aluno aluno = (Aluno) atual.getInfo();
                    int novaHash = hash(aluno.getMatricula(), novoTamanho);
                    LSE novaLista = novoVetorLista[novaHash];
                    if (novaLista == null) {
                        novaLista = new LSE();
                        novoVetorLista[novaHash] = novaLista;
                    }
                    novaLista.insereInicio(aluno);
                    atual = atual.getProximo();
                }
            }
        }

        this.vetorLista = novoVetorLista;
    }

    private int hash(int chave, int tamanho) {
        return chave % tamanho;
    }

    public void imprimirMapa() {
        for (int i = 0; i < vetorLista.length; i++) {
            LSE alunosLista = vetorLista[i];
            if (alunosLista != null) {
                System.out.print("Posição " + i + ": ");
                for (Noh n = alunosLista.getInicio(); n != null; n = n.getProximo()) {
                    Aluno aluno = (Aluno) n.getInfo();
                    System.out.print(aluno.getMatricula() + " " + "[" + aluno.getNome() + "]");
                }
                System.out.println();
            } else {
                System.out.println("Posição " + i + ": vazio");
            }
        }
    }
}
