package Day10_IfStatement;

public class Multi_Branch_IfStatements {

    /*
     if-else if-else:
            if(condition1){
                // A ==> if condition1 is true
            }
            else if( condition2 ) {
                //B   ==> if condition1 is false and condition2 is true
            }
            else {
                //C  ==> if condition1 and condition2 are both false
            }
     
     */
    
    public static void main(String[] args) {
        
        if(false) {
            System.out.println("if block");
        }
        else if(false) {
            System.out.println("else if block");
        }
        else {
            System.out.println("else block");
        }
        
        int grade = 100;
        
        if(grade >= 90) {
        	System.out.println("You have made A");
        }
        else if(grade < 90 && grade >= 80) {
        	System.out.println("You have made B");
        	
        }
        
        else if(grade < 80 && grade >= 70) {
        	System.out.println("You have made C");
        }	
        else if(grade < 70 && grade >= 60) {
        	System.out.println("You have made D");
        }
        else {
        	System.out.println("You have made E, study more");
        }
        
        int num1 =30, num2=300, num3 =200;
        
        if( num1 > num2 && num1 > num3) {
            System.out.println(num1+" is the bigger number");
        }
        
        else if( num2 > num1 && num2 > num3){
            System.out.println(num2+" is bigger number");
        }
        
        else if(num3 > num2 && num3 >num1) {
            System.out.println(num3+" is the bigger number");
        }
        
        else if (num3 == num2 && num3 > num1) {
            System.out.println(num3+" and "+num2+" are the bigger number");
        }
    
        else if(num3==num1 && num3 > num2) {
            System.out.println(num3+" and "+num1+" are the bigger number");
        }
        else if(num2 == num1 && num2 > num3) {
            System.out.println(num2+" and "+num1+" are the bigger number");
        }
        else {
            System.out.println("all of them are equal");
        }
    }
}
