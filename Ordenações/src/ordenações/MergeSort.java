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
public class MergeSort {
    
    
    public void ordena(int v[], int inicio, int fim) {

        if (inicio < fim) {
            int meio = (inicio + (fim)) / 2;
            ordena(v, inicio, meio);
            ordena(v, meio + 1, fim);
            merge(v, inicio, meio, fim);
        }
    }

    private static void merge(int A[], int ini, int meio, int fim) {
        //Variaveis aux
        int md1 = meio - ini + 1;
        int md = fim - meio;

        int[] L;
        L = new int[md1];
        int[] M;
        M = new int[md];
        //copy
        for (int i = 0; i < md1; i++) {
            L[i] = A[ini + i];
        }
        for (int j = 0; j < md; j++) {
            M[j] = A[meio + 1 + j];
        }

        int i, j, k;
        i = 0;
        j = 0;
        k = ini;
        while (i < md1 && j < md) {
            if (L[i] <= M[j]) {
                A[k] = L[i];
                i++;
            } else {
                A[k] = M[j];
                j++;
            }
            k++;
        }

        while (i < md1) {
            A[k] = L[i];
            i++;
            k++;
        }

        while (j < md) {
            A[k] = M[j];
            j++;
            k++;
        }
    }

    /*
    public static void troca(int v[], int a, int b) {
        int aux = v[a];
        v[a] = v[b];
        v[b] = aux;
    }
     */
    public void imprime(int[] v) {
        
        System.out.println("Merge:");
        for (int k = 0; k < v.length; k++) {
            System.out.println(v[k]);
        }
    }

}
