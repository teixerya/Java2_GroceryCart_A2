
package GroceryCart;

/*

 */
/**
 * The Cake class is a subclass of the Item class. Cake has a cost 
 * and a function to get cost.
 */
public class Cake extends Item {
    
    /**
     * The declaration of cost.
     */
    private int cost;
    
    /**
     * The default constructor for the Cake class.
     */
    public Cake(){
        int cost = 0;
        
    }
    
    /**
     * A constructor that takes name and cost as a parameters.
     * @param name the parameter to set the initial name value with the
     * super class String name constructor.
     * @param cost the parameter to set the initial balance value.
     */
    public Cake(String name, int cost){
        super(name);
        this.cost= cost;
    }
    
    /**
     * A setter that sets a new int cost.
     * @param cost value to be set as new cost.
     */
    public void setCost(int cost){
        this.cost=cost;
    }
    
    /**
     * Override the parent "Item" getCost method. 
     * @return returns an int value.
     */
    @Override
    public int getCost(){
        return cost;
    }   

    /**
     * toString returns object type as a string.
     * @return returns a String value.
     */
    @Override
    public String toString(){
      
    return "";

    }
   
}
