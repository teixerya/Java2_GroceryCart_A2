
package GroceryCart;

/*

 */
/*
The DryFruit class ia a subclass of the Item class. DryFruit has a weight, 
priceLb, and function to get cost.   
*/
public class DryFruit extends Item {
    
    /**
     * The declaration of weight and priceLb.
     */
    private double weight= 0.0;
    private int priceLb = 0;
    
    /**
     * The default constructor for the DryFruit class.
     */
    public DryFruit(){

    }
    
    /**
     * A constructor that takes name, weight and priceLb as parameters.
     * @param name the parameter to set the initial name value using a 
     * super class String name constructor.
     * @param weight the parameter to set the initial weight value.
     * @param priceLb the parameter to set the initial priceLb value.
     */    
    DryFruit(String name, double weight,int priceLb){
        super(name);
        this.weight = weight;
        this.priceLb = priceLb;
          
    }
    
    /**
     * A setter that sets a new double weight.
     * @param weight value to be set as new weight.
     */
    public void setWeight(double weight){
        this.weight=weight;
        
    }
    
    /**
     * A setter that sets a new int priceLb.
     * @param priceLb value to be set as new priceLb.
     */
    public void setPriceLb(int priceLb){
        this.priceLb=priceLb;
    }
    
    /**
     * A getter to retrieve the weight.
     * @return retrieves weight as a double.
     */
    public double getWeight(){
        return weight;
    }
    
    /**
     * A getter to retrieve the priceLb.
     * @return retrieves priceLb as int.
     */
    public int getPriceLb(){
        return priceLb;
    }
    
    /**
     * Override the parent "Item" getCost method. 
     * @return returns an int value.
     */
    @Override
    public int getCost(){
        
    return (int)(getWeight()*getPriceLb());
    
    }
    
    /**
     * toString returns object type as a string.
     * @return formats weight as a floating point value 
     * and cents to a string value.
     */
    @Override
    public String toString(){
        String cents = BulkShoppe.centsToDollarsAndCents(this.getPriceLb());
        return String.format("%.2f lbs. @ %s /lb.%n", this.getWeight(), cents);

    }
    
    
}
