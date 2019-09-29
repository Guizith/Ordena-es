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
public class SelectionSort{
      public void ordena(int []v){
        
        int idc;
        
        for(idc=0;idc<v.length;idc++){
            int idcm = idc;
            for(int idcs = idc+1;idcs<v.length;idcs++){
                
                if(v[idcm]>v[idcs]){
                    idcm = idcs;
                }
            }
            troca(v,idc,idcm);
        }    
  }
    
      public static void troca(int v[], int a, int b){
        int aux = v[a];
        v[a] = v[b];
        v[b] = aux;   
    }

    
    public void imprime(int []v){
        System.out.println("Selection:");
        for(int k=0;k<v.length;k++){
            System.out.println(v[k]);
        }
    }
    
}
