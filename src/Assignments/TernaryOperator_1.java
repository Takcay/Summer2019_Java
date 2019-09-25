package Assignments;
import java.util.Scanner;
public class TernaryOperator_1 {
	
	public static void main(String[] args) {
		    //DO NOT CHANGE
		    Scanner scan = new Scanner(System.in);
		    System.out.println("Enter number:");
				int x = scan.nextInt();
				//WRITE YOUT CODE HERE
				
				x = (x >= 5) ? x : -x;
				
				System.out.println(x);
	}

}
