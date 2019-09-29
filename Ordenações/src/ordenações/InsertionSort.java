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
public class InsertionSort {
    
    public void ordena(int[] vetor){
        int i,j,ch;
        
        for(i=0;i<vetor.length;i++){
            ch = vetor[i];
            j=i-1;
            while(j>=0 && ch < vetor[j]){
                vetor[j+1]=vetor[j];
                j--;
            }
            vetor[j+1]=ch;
        }
    }
    
    
    
    public static void troca(int v[], int a, int b){
        int aux = v[a];
        v[a] = v[b];
        v[b] = aux;   
    }

    
    public void imprime(int []v){
        System.out.println("Insertion:");
        for(int k=0;k<v.length;k++){
            System.out.println(v[k]);
        }
    }
}
