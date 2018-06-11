/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

import sort.methods.Bubblesort;
import sort.methods.Insertionsort;
import sort.methods.Quicksort;
import sort.methods.Selectionsort;
/**
 *
 * @author student
 */
public class SortFactory {
    
    
  
    //SortMethodsEnum s_enum = SortMethodsEnum.valueOf(s)
    
    public static IStratMethod ChooseMethod(String s) //wybieranie odpowiedniej metody
    {
        SortMethodEnum s_enum = SortMethodEnum.valueOf(s);
        
        IStratMethod method = null;
        
        switch(s_enum){
            case bubblesort:
                method = new Bubblesort();
                break;
            case selectionsort:
                method = new Selectionsort();
                break;
            case insertionsort:
                method = new Insertionsort();
                break;
            case quicksort:
                method = new Quicksort();
                break;
        }
        
        return method;
        
        
    }
}
