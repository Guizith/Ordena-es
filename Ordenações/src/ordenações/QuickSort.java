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
public class QuickSort {
      
    public void ordena(int[] vetor, int inicio, int fim) {
             if (inicio < fim) {
                    int pospivo = particionar(vetor, inicio, fim);
                    ordena(vetor, inicio, pospivo - 1);
                    ordena(vetor, pospivo + 1, fim);
             }
       }
    
       public static int particionar(int[] vetor, int inicio, int fim) {
             int pivo = vetor[inicio];
             int i = inicio + 1, f = fim;
             while (i <= f) {
                    if (vetor[i] <= pivo)
                           i++;
                    else if (pivo < vetor[f])
                           f--;
                    else {
                           troca(vetor,i,f);
                           i++;
                           f--;
                    }
             }
             vetor[inicio] = vetor[f];
             vetor[f] = pivo;
             return f;
       }

    /*
    */
      public static void troca(int v[], int a, int b){
        int aux = v[a];
        v[a] = v[b];
        v[b] = aux;   
    }

    
    public void imprime(int []v){
        System.out.println("Quick:");
        for(int k=0;k<v.length;k++){
            System.out.println(v[k]);
        }
    }
}
