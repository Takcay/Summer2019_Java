package Day06AritmathicOperators;

public class PrimitivesCasting {
	
		
		/*
		 casting: converting larger primitives to smaller size.
		     datatype variablename = (daratype) value
		 
		 
		  primitives: byte, short, int, long, float, double
		  
		 
		 */
		
	public static void main(String[] args) {
		
		int a=10;  // explicit casting
		byte b = (byte) a;
		
		System.out.println();
		
		byte ByteNum = 100;    // implicit casting
		int IntNnm = ByteNum;
		
		int IntNum2 = (int) ByteNum;
		
	}	
		

}
