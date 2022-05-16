public class No {
    private int id; //id do elemento
    private Object elemento; //armazena o elemento de cada nó
    private No esq; //aponta o no filho esquerdo
    private No dir; //aponta o no filho direito

    //construtor
    No(int id, Object elemento, No esq, No dir){
        this.id = id;
        this.elemento = elemento;
        this.esq = esq;
        this.dir = dir;
    }

    public void setId(int id){ this.id = id; }

    public int getId() { return this.id; }

    public void setElemento(Object elemento){ this.elemento = elemento;  }

    public Object getElemento(){ return this.elemento; }

    public void setEsq(No esq){ this.esq = esq; }

    public No getEsq(){ return this.esq; }

    public void setDir(No dir){ this.dir = dir; }

    public No getDir() { return this.dir; }
}
