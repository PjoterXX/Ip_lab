/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sort.methods;

import sort.strategy.Istrategy;

/**
 *
 * @author LeopardProMK
 */
public class Bubblesort implements  Istrategy {
    /* http://www.algorytm.org/algorytmy-sortowania/sortowanie-babelkowe-bubblesort.html */
   
     @Override
   public int[] bsort(int tablica[]){
       
        int temp;
        int zmiana = 1;
        while(zmiana > 0){
                zmiana = 0;
                for(int i=0; i<tablica.length-1; i++){
                    if(tablica[i]>tablica[i+1]){
                    temp = tablica[i+1];
                    tablica[i+1] = tablica[i];
                    tablica[i] = temp;
                    zmiana++;
                 }
               }
        }
         return tablica;
   
        
     }
}
    

