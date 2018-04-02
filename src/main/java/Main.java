
import utfpr.dainf.ct.ed.exemplo.ArvoreBinaria;

/**
 * UTFPR - Universidade Tecnológica Federal do Paraná
 * DAINF - Departamento Acadêmico de Informática
 * 
 * Cria e percorre a seguinte árvore binária:
 *       
 *                    8
 *                   / \
 *                  /   \
 *                 3     10
 *                / \     \
 *               1   6     14 
 *                  / \    /
 *                 4   7  13
 * 
 * @author Wilson Horstmeyer Bogado <wilson@utfpr.edu.br>
 */
public class Main {
    
    public static void main(String[] args) {
        // cria a raiz da árvore binária
        ArvoreBinaria<Integer> a = new ArvoreBinaria<>(8);
        
        // monta o ramo esquerdo
        ArvoreBinaria<Integer> e = a.insereEsquerda(new ArvoreBinaria<>(3));
        e.insereEsquerda(new ArvoreBinaria<>(1));
        ArvoreBinaria<Integer> d = e.insereDireita(new ArvoreBinaria<>(6));
        d.insereEsquerda(new ArvoreBinaria<>(4)).insereDireita(new ArvoreBinaria<>(5));
        d.insereDireita(new ArvoreBinaria<>(7));

        // monta o ramo direito
        a.insereDireita(new ArvoreBinaria<>(10))
                .insereDireita(new ArvoreBinaria<>(14))
                .insereEsquerda(new ArvoreBinaria<>(13));
        
        System.out.println("PERCURSO RECURSIVO");
        a.visitaEmOrdem();
        System.out.println("\nPERCURSO ITERATIVO");
        ArvoreBinaria<Integer> no;
        while ((no = a.proximoEmOrdem()) != null) {
            System.out.print(" " + no.getValor());
        }
        
    }
}
