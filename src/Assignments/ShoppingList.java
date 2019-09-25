package Assignments;

import java.util.Scanner;
public class ShoppingList {

 public static void main(String[] args) {
   //WRITE YOUR CODE HERE:

   
	 Scanner scan = new Scanner(System.in);
	    
	    
	   System.out.println("Enter Item1 and its price:");
	            String item1 = scan.nextLine();
	            double price1 =	scan.nextDouble(); 
	            
	   System.out.println("Enter Item2 and its price:");
       scan.nextLine();
	            String item2 = scan.nextLine();
	            double price2 =	scan.nextDouble(); 
	   System.out.println("Enter Item3 and its price:");
       scan.nextLine();
	            String item3 = scan.nextLine();
	            double price3 =	scan.nextDouble(); 
	   System.out.println("Enter Item4 and its price:");
       scan.nextLine();
	            String item4 = scan.nextLine();
	            double price4 =	scan.nextDouble(); 
	      System.out.println("Item1: "+item1+": "+price1+", Item2: "+item2+": "+price2+", Item3: "+item3+": "+price3+", Item4: "+item4+": "+price4);
	     
	      System.out.println("Total price: "+(price1 + price2 + price3 + price4) );
	  
	  }
	}