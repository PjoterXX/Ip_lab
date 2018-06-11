/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategymyfriend;

/**
 *
 * @author student
 */


public class Context {
    public class Context {
        
        private AbstarctStrategy strat;

   public Context(AbstarctStrategy strategy){
      this.strat = strategy;
   }

   public int executeStrategy(int num1, int num2){
      return strategy.doOperation(num1, num2);
   }
}
}
