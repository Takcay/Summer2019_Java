package Assignments;

public class Task01_greaterNumber {
	public static void main(String[] args) {
		
		int num1 = 30;  
		int num2= 30;
        int max=0;
	
        if( num1>num2 ) {
        	max = num1;
        	System.out.println(max + " is greatest number");
        }
        else if (num2>num1) {
	    	max = num2;
	    	System.out.println(max + " is greatest number");
	    }
        else {
        	max = num1;
        	System.out.println("Both numbers are equal");
        }
        
	}
	
	

}
