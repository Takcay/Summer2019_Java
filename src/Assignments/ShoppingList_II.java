package Assignments;

import java.util.Scanner;

public class ShoppingList_II {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	    
	    
		   System.out.println("Enter Item1, count and its price:");
		            String item1 = scan.nextLine();
		            double price1 =	scan.nextDouble();
		            int count1 = scan.nextInt();
		            
		   System.out.println("Enter Item2, count and its price:");
	       scan.nextLine();
		            String item2 = scan.nextLine();
		            double price2 =	scan.nextDouble();
		            int count2 = scan.nextInt();
		   
		   System.out.println("Enter Item3, count and its price:");
	       scan.nextLine();
		            String item3 = scan.nextLine();
		            double price3 =	scan.nextDouble();
		            int count3 = scan.nextInt();
		            
		            String report = "";
		            double totalPrice = 0;
		           
		            
		   if (price1>0 && price2>0 && price3>0) {
			   totalPrice = price1+price2+price3;
		   }
		   
		   else if (price1<=0 && price2>0 && price3>0) {
			   totalPrice = price2+price3;
		   }
		   else if (price1>0 && price2<=0 && price3>0) {
			   totalPrice = price1+price3;
		   }
		   else if (price1>0 && price2>0 && price3<=0) {
			   totalPrice = price1+price2;
		   }
		   else if (price1<=0 && price2<=0 && price3>0) {
			   totalPrice = price3;
		   }
		   else if (price1<=0 && price2>0 && price3<=0) {
			   totalPrice =price2;
		   }
		   else if (price1>0 && price2<=0 && price3<=0) {
			   totalPrice = price1;
		   }
		
		   
		   if (count1>0 && count2>0 && count3>0) {
			   report = "Item1: "+item1+" Price: "+price1+", Item2: "+item2+" Price: "+price2+", Item3: "+item3+" Price: "+price3;
		   }
		   
		   else if (count1<=0 && count2>0 && count3>0) {
			   report = "Item2: "+item2+" Price: "+price2+", Item3: "+item3+" Price: "+price3;
		   }
		   else if (count1>0 && count2<=0 && count3>0) {
			   report = "Item1: "+item1+" Price: "+price1+", Item3: "+item3+" Price: "+price3;
		   }
		   else if (count1>0 && count2>0 && count3<=0) {
			   report = "Item1: "+item1+" Price: "+price1+", Item2: "+item2+" Price: "+price2;
		   }
		   else if (count1<=0 && count2<=0 && count3>0) {
			   report = "Item3: "+item3+" Price: "+price3;
		   }
		   else if (count1<=0 && count2>0 && count3<=0) {
			   report = "Item2: "+item2+" Price: "+price2;
		   }
		   else if (count1>0 && count2<=0 && count3<=0) {
			   report = "Item1: "+item1+" Price: "+price1;
		   }
		  
		   System.out.println(report);
		   System.out.println("Total price: "+totalPrice);
		   
	}

}
