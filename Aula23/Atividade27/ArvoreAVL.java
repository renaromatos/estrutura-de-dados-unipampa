package Aula23.Atividade27;

public class ArvoreAVL {
    Noh raiz;

    int altura(Noh noh){
        if(noh == null){
            return 0;
        }
        return noh.altura;
    }

    int getBalanceamento(Noh noh){
        if(noh == null){
            return 0;
        }
        return altura(noh.esquerda) - altura(noh.direita);
    }

    Noh rotacaoDireita(Noh y){
        Noh x = y.esquerda;
        Noh z = x.direita;

        x.direita = y;
        y.esquerda = z;

        y.altura = Math.max(altura(y.esquerda), altura(y.direita)) + 1;
        x.altura = Math.max(altura(x.esquerda), altura(x.direita)) + 1;

        return x;
    }

    public Noh rotacaoEsquerda(Noh x){
        Noh y = x.direita;
        Noh z = y.esquerda;

        y.esquerda = x;
        x.direita = z;

        x.altura = Math.max(altura(x.esquerda), altura(x.direita)) + 1;
        y.altura = Math.max(altura(y.esquerda), altura(y.direita)) + 1;

        return y;
    }

    public Noh insercao(Noh noh, int chave){
        if(noh == null){
            return new Noh(chave);
        }

        if(chave < noh.chave){
            noh.esquerda = insercao(noh.esquerda, chave);
        }
        else if(chave > noh.chave){
            noh.direita = insercao(noh.direita, chave);
        }
        else{
            return noh;
        }

        noh.altura = 1 + Math.max(altura(noh.esquerda), altura(noh.direita));

        int balanceamento = getBalanceamento(noh);

        if(balanceamento > 1 && chave < noh.esquerda.chave){
            return rotacaoDireita(noh);
        }
        if(balanceamento < -1 && chave > noh.direita.chave){
            return rotacaoEsquerda(noh);
        }
        if(balanceamento > 1 && chave > noh.esquerda.chave){
            noh.esquerda = rotacaoEsquerda(noh.esquerda);
            return rotacaoDireita(noh);
        }
        if(balanceamento < -1 && chave < noh.direita.chave){
            noh.direita = rotacaoDireita(noh.direita);
            return rotacaoEsquerda(noh);
        }
        return noh;
    }

    public void preOrder(Noh noh){
        if(noh != null){
            System.out.println(noh.chave + " ");
            preOrder(noh.esquerda);
            preOrder(noh.direita);
        }
    }
}
