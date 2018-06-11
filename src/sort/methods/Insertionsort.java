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


public class Insertionsort implements Istrategy {
    
    
    
       
        int ile_liczb;
        @Override
       public int[] bsort(int tablica[]) {
          int i,j,v;
         for (i=1;i<ile_liczb;i++) 
         {
           j=i;
           v=tablica[i];
          while ((j>0) && (tablica[j-1]>v)) 
          {
          tablica[j]=tablica[j-1];
          j--;
          }
         
       tablica[j]=v;
         }
         
         return tablica;
       }
       
       
}
 

    

    

