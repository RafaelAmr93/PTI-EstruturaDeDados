public class Main {
    public static void main(String[] args) {
        ArvoreBinaria a = new ArvoreBinaria(); // cria a árvore binária
        a.insere(10, "A");
        a.insere(5, "B");
        a.insere(15, "C");
        a.insere(2, "D");
        a.insere(7, "E");
        a.insere(12, "F");
        a.insere(11, "V");
        a.insere(6, "G");
        a.insere(8, "H");
        a.insere(1, "R");

        a.imprimeElementosArvore();
        a.esquerdaFestiva();
        //a.imprimeNivel();

        System.out.println();

        ArvoreBinaria b = new ArvoreBinaria();
        b.insere(555, "a");
        b.insere(333,"b");
        b.insere(888,"c");
        b.insere(111, "d");
        b.insere(444,"e");
        b.insere(999,"f");

        b.imprimeNivel();
    }
}
