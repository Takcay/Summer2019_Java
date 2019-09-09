package Assignments;

public class Task03_bigger_number {
	
	public static void main(String[] args) {
		int n1=200, n2=300, n3=500;
		
		if(n1>n2 && n1>n3) {
			System.out.println(n1 + " is bigger.");
		}
		else if(n2>n1 && n2>n3) {
			System.out.println(n2 + " is bigger.");
		}
		else if(n3>n2 && n3>n1) {
			System.out.println(n3 + " is bigger.");
		}
		else if(n1==n2 && n2==n3) {
			System.out.println("All numbers are equal");
		}
	
	}

}
