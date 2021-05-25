//%[arugument_index][flags][width][.precision]coversion
//argument_index---1$,2$,3$....
//flags '+','-','0','','('
//coversion--char c
//           int d(integer) , o(octal) , x(hexadecimal)
//           float f(for float as well as double) , g , e(e and g are scientific represention)
//           String s
package printing1.java;
public class printing1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a=10;
        float f=28.90f;
        System.out.printf("%2$6.2f %1$5.2d",f,a);
	}

}
