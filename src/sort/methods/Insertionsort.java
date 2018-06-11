/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sort.methods;

/**
 *
 * @author LeopardProMK
 */
import strategymyfriend.AbstarctStrategy;

public class Insertionsort implements AbstarctStrategy{
   
@Override
public double[] sort(double tab[]){
      
    double klucz;
    int j;
      for (int i=1;i<tab.length;i++){
	j=i;
	klucz=tab[i];
	while (j>0 && tab[j-1]>klucz){
            tab[j]=tab[j-1];
		j--;
	}
	tab[j]=klucz;
    }
    return tab;
    }

    
}