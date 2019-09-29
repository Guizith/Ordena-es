/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenações;

/**
 *
 * @author Guizith
 */
public class Ordenações {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     
        int vetorb[]= {10,2,7,4,9,54,86,12,87,22,26};
        BubbleSort b;
        b = new BubbleSort();
        b.ordena(vetorb);
        b.imprime(vetorb);
        
        int vetorI[]= {10,2,7,4,9,54,86,12,87,22,26};
        InsertionSort i;
        i = new InsertionSort();
        i.ordena(vetorI);
        i.imprime(vetorI);
        
        int vetorM[] = {10, 2, 7, 4, 9, 54, 86, 12, 87, 22, 26};
        MergeSort m;
        m = new MergeSort();
        m.ordena(vetorM,0,10);
        m.imprime(vetorM);
     
        int vetorS[]= {10,2,7,4,9,54,86,12,87,22,26};
        SelectionSort s;
        s = new SelectionSort();
        s.ordena(vetorS);
        s.imprime(vetorS);
        
        int vetorQ[]= {10,2,7,4,9,54,86,12,87,22,26};    
        QuickSort q;
        q = new QuickSort();
        q.ordena(vetorQ,0,10);
        q.imprime(vetorQ);
    }

}


