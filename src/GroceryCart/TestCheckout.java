
package GroceryCart;

/**
 *
 * @author ryanteixeira
 */
public class TestCheckout {
      public static void main(String[] args) {
          
    Checkout checkout = new Checkout();
    checkout.enterItem(new DryFruit("Cashew", 1.25, 399)); 
    checkout.enterItem(new Cake("Vanilla Cake",1005)); 
    checkout.enterItem(new Cake("Choc. Chip Cake",999)); 
    checkout.enterItem(new Fruit("Banana", 4, 399));
   


    System.out.println("\n");
    System.out.println(checkout);
    checkout.clear(); 

   
    }
}

/*Expected Output:
     Bulk Shoppe
     --------------------
1.25 lbs. @ 3.99 /lb.
Cashew                     4.98
Vanilla Cake              10.05
Choc. Chip Cake            9.99
4 @ 3.99 /dz.
Banana                     1.33
Number of items: 4
Total cost: 2635
Total tax: 171
Cost + Tax: 2806*/
