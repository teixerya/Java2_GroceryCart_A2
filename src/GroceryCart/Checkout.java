
package GroceryCart;

import java.util.ArrayList;

/*

 */
/**
 * The Checkout class implements a Cloneable interface. 
 * Checkout has an ArrayList of the Item class named checklist.
 * The Checkout class has the function to enterItem, clear checklist,
 * get number of items, total cost, total tax, an equals method, and a Clone 
 * method.
 */
public class Checkout implements Cloneable {
    
    
   /**
    * The declaration of checklist.
    */
    private ArrayList<Item> checklist;

    /**
     * The default constructor for the Checkout class.
     */
    public Checkout(){
      checklist= new ArrayList<>();  
    }

    /**
     * Item is added to the end of the list of items.
     */
    public void enterItem(Item item){
        
        checklist.add(item);   
    }
    
    /**
     * Clears the Checkout to begin checking out a new set of items
     */
    public void clear(){
      checklist.clear();
    }
    
    /**
     * Returns the number of Item's in the list
     */
    public int numberOfItems(){

        return checklist.size();
    }
    
    /**
     * Returns total cost of items in cents (without tax)
     */
    public int totalCost(){
        
        int cartSum = 0;

        for (Item item: checklist)
            cartSum +=  item.getCost();
            return cartSum;  
    }
    
    /**
     * Returns total tax on items in cents
     */
    public int totalTax(){

          int tax = (int)(Math.round(this.totalCost()*(BulkShoppe.TAX_RATE/100)));
        return tax;

    }

    /**
     * Returns a String representing a receipt for the current list of 
     * Item's with the name of the store, the items purchased, the tax, 
     * and the total cost, for example,
     */
    @Override
    public String toString(){


    
    String itemS2 ="             Bulk Shoppe\n";
    itemS2 += "         -------------------\n";
        
    for (Item item: checklist){
        String cents = BulkShoppe.centsToDollarsAndCents(item.getCost());
        itemS2 += item.toString();
        itemS2 += String.format("%-30s%10s%n", item.getName(),cents);
    }
        
    itemS2 += "\nNumber of items: " + this.numberOfItems() ;
    itemS2 += "\nTotal cost: " + this.totalCost() ;
    itemS2 += "\nTotal tax: " + this.totalTax() ;
    itemS2 += "\nCost + Tax: " + (this.totalCost() + this.totalTax()) + "\n";
    
    return itemS2;
    
    } 
    /**
     * Override the equals method to check if new value obj2 is equal 
     * to this run time class object.
     * @param obj2 the parameter to set the obj2 value.
     * @return retrieves if obj2 is equal to the run time object as a boolean.
     */
    @Override
    public boolean equals(Object obj2){
       
        return this.getClass().equals(obj2.getClass());
    }
   
    
    /**
     * Override the clone interface to create a clone and store in 
     * checkListClone
     * @return a clone called checklistClone that is an object type.
     */
    @Override
    public Object clone(){
        
        Object checklistClone = checklist.clone();
        
        return checklistClone;
                
    }
    
}
