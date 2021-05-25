package operator.java;

public class operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     //Arithametic Operator
	 // *,/,% (High Precedence)
	//  +,-
		byte b=126;
		short s=32767;
		int i= 24435434;
		long l=253653545747l;
		float f=2.775f;
		double d=2.8937367563d;
		char c=65;
		//byte+byte==Give us integer Type
		/*This plus operator assume that the value of these bytes is nothing but integer.
		That is the reason it gives the result does integer type and for short also it assume that
		these are integer type and performed operation and get the result as integer.
		It means compiler will internally convert into integer type that is the reason that
		there does integer type on this process or this mechanism of compiler is called as Coercion.
		Coercion--Internally it will convert the data types.*/
		
		/* (int)--x=byte+byte;->Give in Integer type
		   (int)--y=short+byte;
		   (float)--z=int+float;->If float is used in the expression means the result
		    is going to be in float 
		    */
	}

}
