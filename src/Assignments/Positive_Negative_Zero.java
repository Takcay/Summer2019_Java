package Assignments;
import java.util.Scanner;
public class Positive_Negative_Zero {
	
	
public static void main(String[] args) {
	
	    Scanner input = new Scanner(System.in);
	    System.out.println("Enter a number:");
	    int number = input.nextInt();
	
	
	if(number>0) {
		System.out.println(number+" is positive");
	}
	else if(number<0) {
		System.out.println(number+" is negative");
	}
	else {
		System.out.println("it is zero");
	}
}

}
