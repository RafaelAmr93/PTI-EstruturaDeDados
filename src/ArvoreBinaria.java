public class ArvoreBinaria {

    private No raiz;
    private int esquerdaFestiva;

    public ArvoreBinaria() {
        this.raiz = null;
    }

    public No getRaiz() {
        return this.raiz;
    }

    public int getEsquerdaFestiva() {
        return this.esquerdaFestiva;
    }

    public void insere(int id, Object elemento) { //método que insere um elemento
        No novoNo = new No(id, elemento, null, null);
        if (raiz == null) {
            raiz = novoNo; //primeiro nó da árvore
        } else {
            No atual = raiz;
            No pai;

            while (true) {
                pai = atual;
                if (id < atual.getId()) { //
                    atual = atual.getEsq();

                    if (atual == null) {
                        pai.setEsq(novoNo);
                        return;
                    }
                } else {
                    atual = atual.getDir();
                    if (atual == null) {
                        pai.setDir(novoNo);
                        return;
                    }
                }
            }
        }
    }
    private void preFixado(No atual) // caminhamento pré-fixado da árvore binária
    {
        if (atual != null) {
            System.out.println("Id: " + atual.getId() + " Elemento: " + atual.getElemento());
            preFixado(atual.getEsq());
            preFixado(atual.getDir());
        }
    } // final método preFixado

    private void contaEsq(No atual) {
        if (atual != null) {
            if (atual.getEsq() != null) {
                this.esquerdaFestiva++;
            }
            contaEsq(atual.getEsq());
            contaEsq(atual.getDir());
        }
    }

    public void esquerdaFestiva(){
        contaEsq(raiz);
        System.out.println("O número de nós da 'esquerda festiva' é: " + this.esquerdaFestiva);
    }

    public void imprimeNivel(){
        montaNivel("", raiz);
    }

    private void montaNivel(String prefix, No atual) {
        String espaco = "     ";
        if(atual != null){
            System.out.println(prefix + espaco + atual.getId());
            montaNivel(prefix + espaco, atual.getEsq());
            montaNivel(prefix + espaco, atual.getDir());
        } else {
            System.out.println(prefix + espaco + "-");
        }
    }

    public void imprimeElementosArvore() // impressão dos elementos da árvore
    {
        preFixado(raiz);
    } // final do método para impressão
}
