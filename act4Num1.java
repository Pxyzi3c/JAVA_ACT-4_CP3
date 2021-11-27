import java.util.Scanner;
public class act4Num1 {
    // Programmer: Harvy Jones Pontillas DICT 2-2
    public static void main(String[] args){
     // Variables declaration
     int itemCode;
     double oldPrice, newPrice; // Double because price has a decimal point
     
     Scanner keyboard = new Scanner(System.in); // Input scanner
     
     // Input item code and old price from the keyboard scanner
     System.out.print("\tENTER THE ITEM CODE (1 THOUGH 3): ");
     itemCode = keyboard.nextInt();
     System.out.print("\tOLD PRICE: $ ");
     oldPrice = keyboard.nextDouble();
     
     // Conditional if statement to evaluate the entries
     if(itemCode == 1) {
         System.out.println("\n\tITEM: WOMEN'S WEAR");
         // Compute and display new price
         newPrice = oldPrice + (oldPrice * .10);
         System.out.printf("\tNEW PRICE: $ %.2f", newPrice);
     }
     else if(itemCode == 2) {
         System.out.println("\n\tITEM: MEN'S WEAR");
         // Compute and display new price
         newPrice = oldPrice + (oldPrice * .20);
         System.out.printf("\tNEW PRICE: $ %.2f", newPrice);
     }
     else if(itemCode == 3) {
        System.out.println("\n\tITEM: CHILDREN'S WEAR");
        // Compute and display new price
        newPrice = oldPrice - (oldPrice * .10);
        System.out.printf("\tNEW PRICE: $ %.2f", newPrice);
     }
    }
}

/**
 * 1.  Write a program that will input the ITEM CODE and the OLD PRICE.
    Test and compute the NEW PRICE

		ITEM CODE	ITEM			    % OF INCREASE/DECREASE

		1		    WOMEN'S WEAR	    10% INCREASE
		2		    MEN'S WEAR		    20% INCREASE
		3		    CHILDREN'S WEAR	    10% DECREASE


	SAMPLE OUTPUT:

		ENTER THE ITEM CODE (1 THROUGH 3):
		OLD PRICE:

		ITEM:
		NEW PRICE:	

 */