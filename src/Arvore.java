
import java.util.Scanner;

public class Arvore {

    public No raiz;
    
    public static final String blue = "\u001B[34m"; //estetica
       
    int res;
    Scanner tec = new Scanner(System.in);
 
    public Arvore() {
        raiz = null;
    }


    public void inserir(int valor, String pergunta) {
        raiz = inserir(raiz, valor, pergunta);
    }

    public No inserir(No no, int valor, String pergunta) {

        if (no == null) {
            no = new No(valor, pergunta);
        } else {
            if (valor < no.getValor()) {
                if (no.getEsq() != null) {
                    inserir(no.getEsq(), valor, pergunta);
                } else {
                   
                    no.Esq = new No(valor, pergunta);
                }
            } else if (valor > no.getValor()) {
                if (no.getDir() != null) {
                    inserir(no.getDir(), valor, pergunta);
                } else {
                    
                    no.Dir = new No(valor, pergunta);
                }
            }
        }

        return no;

    }

}
