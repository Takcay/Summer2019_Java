package Day18_StringClass_Continue;

import java.util.Scanner;

public class WarmUp {
	
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter your first and last names");
	 String firstName = input.nextLine();
	 String lastName = input.nextLine();
	 //String initials = firstName.substring(0,1).concat(".") + lastName.substring(0,1);
	 String initials =""+firstName.charAt(0)+"."+lastName.charAt(0);
	 System.out.println("Initial is: "+initials);
	
	
}

	
	
}
