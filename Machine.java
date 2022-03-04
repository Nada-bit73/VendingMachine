
package vendingmachine;

import java.util.Arrays;

/**
 *
 * @Nada
 */
public class Machine {
   private Item[][] items;
   
   
   
   
   public Machine(Item[][] items){
       this.items = new Item[items.length][items[0].length];//first set the length
       
       for(int i = 0 ; i < items.length ; i++){
           
           for(int j = 0 ; j < items[i].length ; j++){
               
           this.items[i][j] = new Item(items[i][j]);
           
       }
           
       }
   }
   
   /*
   It receives two parameters: int row and int spot.

It returns an object at the requested spot inside a row.
   */
   
   public Item getItems(int row, int spot){
       return  new Item(this.items[row][spot]);
   }
   
  
   
   public void setItems(Item item,int row, int spot){
       this.items[row][spot] = new Item(item);
   }
   
   public int getLength(){
       return this.items.length;
   }
   
    public int getRowLength(){
       return this.items[0].length;
   }
   /**
     * Function name -- dispense
     * @param row (int)
     * @param spot (int)
     * @return (boolean)
     *
     * Inside the function:
     *  1. Checks if the requested item has a quantity bigger than 0.
     * - if so: decreases its quantity by one and returns true.
     * - otherwise: returns false.
     */
   public boolean dispense(int row, int spot){
     
       if(this.items[row][spot].getQuantity() > 0){
           this.items[row][spot].setQuantity(this.items[row][spot].getQuantity() - 1) ;
           return true;
       }else{
           return false;
       }
           
       
   }
   
   public String toString(){
       String temp = "";
       
      for(int i = 0 ; i < items.length ; i++){
          temp+="\t";
           for(int j = 0 ; j < items[i].length ; j++){
           temp +=  this.items[i][j].toString();
          
           
       }
            temp+= "\n\n";
       }
            
   
       temp+="\t***************************************";
       return temp;
}
}
