/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vendingmachine;

/**
 *
 * @author Amcِ
 */
public class Item {
  //name, price and quantity
    private String name;
    private double price;
    private int quantity;
    
    public Item(String name,double price,int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    
     public Item(Item source){
        this.name = source.name;
        this.price = source.price;
        this.quantity = source.quantity;
    }
    
 public String getName(){
        return this.name;
    }
 
 public double getPrice(){
        return this.price;
    }
 
 public int getQuantity(){
        return this.quantity;
    }
 
 public void setName(String name){
     this.name = name;
 }
 
 public void setPrice(double price){
     this.price = price;
 }
 
 public void setQuantity(int quantity){
     this.quantity = quantity;
 }
 
 public String toString(){
     //<name>: <price> (<quantity>)
     
     return this.name +" : "+this.price+"("+this.quantity+") ";
 }
}
