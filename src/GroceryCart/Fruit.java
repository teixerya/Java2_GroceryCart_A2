
package GroceryCart;

/*

 */
/**
 * The Fruit class is a subclass of the Item class. Fruit has a number, a 
 * centsDz, and a function to get cost.
 */
public class Fruit extends Item {
    
    /**
     * The declaration of number and centsDz.
     */
    private int number;
    private int centsDz;
    
    /**
     * The default constructor for the Fruit class.
     */
    public Fruit(){
        this.number = 0;
        this.centsDz = 0;
    }
    
    /**
     * A constructor that takes name, number and priceLb as parameters. 
     * @param name the parameter to set the initial name value using a 
     * super class String name constructor.
     * @param number the parameter to set the initial number value.
     * @param centsDz the parameter to set the initial centsDz value.
     */
    public Fruit(String name, int number, int centsDz){
        super(name);
        this.setNumber(number);
        this.setCentsDz(centsDz);
    }
    
    
    /**
     * A setter that sets a new int number.
     * @param number value to be set as new number.
     */ 
    public void setNumber(int number){
        this.number=number;
    }
    
    /**
     * A setter that sets a new int centsDz.
     * @param centsDz value to be set as new centsDz.
     */
    public void setCentsDz(int centsDz){
        this.centsDz=centsDz;
    }
    
    /**
     * A getter that retrieves the number.
     * @return retrieves number as an int.
     */
    public int getNumber(){
        return number;
    }
    
    /**
     * A getter that retrieves the centsDz.
     * @return retrieves centsDz as an int.
     */
    public int getCentsDz(){
        return centsDz;
    }
    
    /**
     * Override the parent "Item" getCost method. 
     * @return returns an int value.
     */
    @Override
    public int getCost(){
    
        return (int)Math.round(this.getNumber()*((double)this.getCentsDz()/12));
    }
    
    /**
     * toString returns object type as a string.
     * @return formats number as a integer value 
     * and cents to a string value.
     */
    @Override
    public String toString(){
        String cents = BulkShoppe.centsToDollarsAndCents(this.getCentsDz());
        return String.format("%d @ %s /dz.%n",this.getNumber(), cents);
    }
    
}
