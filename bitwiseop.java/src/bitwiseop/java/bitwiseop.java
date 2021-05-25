package bitwiseop.java;

public class bitwiseop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //int x=10,y=6,z;
        //int x=10,z;
		
		//NOT
        //z=~x;
		
		//AND
        //z=x&y;
		
		//OR
        //z=x|y;
		
		//XOR
        //z=x^y;
		
		
		//int x=10,z;
		
		//Left Shift
		//z=x<<1;
		//z=x<<2;
		//z=x<<3;
		
		//Right Shift 
		//z=x>>1;
		//z=x>>2;
		//z=x>>3;
		
		//Right Shift For Negative Number
		//int x=-10,z;
		//z=x>>1;
		//System.out.println(String.format("%s",Integer.toBinaryString(x)));
        //System.out.println(String.format("%32s",Integer.toBinaryString(z)));
        //System.out.println(x);
		
		 //Unsigned Right Shift
	     int x=-0b1010,z,y;
		 z=x>>>1;
		 y=~x;
		 /* (String.format("%s",Integer.toBinaryString(x)) use in to display 
		 a bit patter of number */
		 /* "%32s" Use in to print in 32 bits */
		 System.out.println(String.format("%32s",Integer.toBinaryString(y)));
		 System.out.println(String.format("%s",Integer.toBinaryString(x)));
		 System.out.println(String.format("%s",Integer.toBinaryString(z)));
		 System.out.println(String.format("%32s",Integer.toBinaryString(z)));
		 System.out.println(x);
	}

}
