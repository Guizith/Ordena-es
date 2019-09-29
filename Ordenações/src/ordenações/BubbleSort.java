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
public class BubbleSort {
        
    public void ordena(int [] v){
           int i,j;
        for(i=v.length-1;i>0;i--){
            for(j=0;j<i;j++){            
                if(v[j]>v[j+1]){         
                    troca(v,j,j+1);
                }
            }
        }
    }
  
    public static void troca(int v[], int a, int b){
        int aux = v[a];
        v[a] = v[b];
        v[b] = aux;   
    }

    
    public void imprime(int []v){
        System.out.println("Bubble:");
        for(int k=0;k<v.length;k++){
            System.out.println(v[k]);
        }
    }
}