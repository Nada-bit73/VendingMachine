/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vendingmachine;

import java.util.Scanner;

/**
 *
 * @author Amcِ
 */
public class VendingMachine {

    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
         System.out.println("\t**************************************");
        System.out.println("\t         welcome to java drinks !!      ");
        System.out.println("\t***************************************\n\n");
      
        /*
        Inside main(), remove all code that follows creating the Machine object.

Call the dispense() action twice for the item at row 0, spot 0. Then, print that object. The quantity should decrease from three to one
        */
            Item[][] items = new Item[][] {
            { new Item("Pepsi", 1.99, 3) , new Item("Fresca", 1.49, 3), new Item("Brisk", 2.49, 2) },
            { new Item("Fanta", 1.99, 2) , new Item("Barq's", 1.49, 2), new Item("A & W", 2.49, 3) },
            { new Item("Crush", 1.99, 2) , new Item("C-Cola", 1.49, 2), new Item("Berry", 2.49, 1) }
        }; 
            Machine machin = new Machine(items);
          
             while(true){
                 
                    System.out.print("Pick a row: "); 
                    int row = in.nextInt(); // pick up row. 
                    System.out.print("\nPick a spot in the row: "); 
                    int spot = in.nextInt();// pick up spot. 
                    
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
