
package vendingmachine;

import java.util.Scanner;

/**
 *
 * @Nada
 */
public class VendingMachine {

    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
         System.out.println("\t**************************************");
        System.out.println("\t         welcome to java drinks !!      ");
        System.out.println("\t***************************************\n\n");
      
       
            Item[][] items = new Item[][] {
            { new Item("Pepci", 1.99, 3) , new Item("Fresca", 1.49, 3), new Item("Brisk", 2.49, 2) },
            { new Item("Fanta", 1.99, 2) , new Item("Barq's", 1.49, 2), new Item("A & W", 2.49, 3) },
            { new Item("Crush", 1.99, 2) , new Item("C-Cola", 1.49, 2), new Item("Berry", 2.49, 1) }
        }; 
            Machine machin = new Machine(items);
          
             while(true){
                 
                    System.out.print("Pick a row: "); 
                    int row = in.hasNextInt() ? in.nextInt() : 404; // pick up row. 
                    in.nextLine();
                    System.out.print("\nPick a spot in the row: "); 
                    int spot = in.hasNextInt() ? in.nextInt() : 404; // pick up spot. 
                    
                    if(row == 404 || spot == 404){
                        System.out.println("INVALID INPUT");
                        continue;
                    }else if(row < 0 || row > machin.getLength() -1 || spot < 0 || spot > machin.getLength() -1 ){
                         System.out.println("INVALID INDEX");
                        continue;
                    }
                    
                   boolean dispensed = machin.dispense(row, spot);
                    System.out.println("\n"+machin);

                    if(dispensed){
                        System.out.println("\nEnjoy your drink! Press 1 to purchase another: "); 
                    }else{
                        System.out.println("\nSorry, we're out of this item. Press 1 to purchase another: ");
                    }   
                    
                    if(in.nextInt() != 1){
                        break;
                    }
                    
                    
                     } 

            
        

            
               
    }
    
}
