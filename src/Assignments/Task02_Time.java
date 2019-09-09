package Assignments;

public class Task02_Time {
	public static void main(String[] args) {

		int hour=14, minute=57 , second=59;
		String amOrPm="";
		
		if (hour>=24 && hour<0) {
			System.out.println("invalid hour format");
		}
		
		else if (minute>59 && minute<0) {
			System.out.println("invalid hour format");
		}
		else if (second>59 && second<0) {
			System.out.println("invalid hour format");
		}
		
		else if(hour>=12 && hour<24) {
			amOrPm="PM";
			System.out.println((hour-12)+":"+minute+":"+second+" "+amOrPm);
	    }
		else if(hour<12 && hour>=0) {
			amOrPm="AM";
			System.out.println(hour+":"+minute+":"+second+" "+amOrPm);
	    }
		
		else {
			
			System.out.println("invalid hour format");
		}
		
		
		
	}
	
	
  

}
