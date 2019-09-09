package Day07_UnerayShortHand;

public class UnerayOperators {
	
	public static void main(String[] args) {
		
		/*
		 +  : positive
		 -  : negative
		 ++ : increment
		 -- : decrement 
		 
		 */
		
		int a = +10;
		int b = -10;
		
		System.out.println(a + "\n" + b );
		
		//pre increment 
		int a2 = 10;
		int b2 = ++a2;
		int c2 = 15;
		++c2;
		
		
		System.out.println(b2);
		System.out.println(++b2);
		System.out.println(c2);
		
		//post increment
		int d = 100;
		
		System.out.println(d ++);
		System.out.println(d);
		
		int e = d ++;
		
		System.out.println(e);
		System.out.println(d);
		
		
		int x = 100;
		int y = x++ -1;
		
		System.out.println(y);
		
		
		int p = 50;
		p = --p + p++ + p-- + p++;
		
		System.out.println(p);
		
		
		int S = 4;
		int R = S*4 - S--;
		
		System.out.println(R);
		System.out.println(S);

		
		
		
	}

}
