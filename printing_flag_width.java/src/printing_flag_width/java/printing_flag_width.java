//Flags--'-', '+' , '0' , ' ' , '('
package printing_flag_width.java;

public class printing_flag_width {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//      int a=10;
//		int a=-10;
//      System.out.printf("%d",a);
//      System.out.printf("%5d",a); (Width)
//      System.out.printf("%+5d",a);
//		System.out.printf("%(5d",a); OpenBracket
//		System.out.printf("%(5d",a);
/*       Note--If the number is negative then show bracket
      and if no. is positive then show bracket */
//		float a=123.45f;
//		System.out.printf("%f",a);
/*		System.out.printf("%6f",a);  (Not show Places,the reason is after
		decimal there are more than two digit. It is not accurate.It is precise) */
//		System.out.printf("%6.2f",a); 6 means 6 place before decimal , 2 means 2 place after decimal
//		float a=5.45f;
//		System.out.printf("%6.2f",a); It is not showing six places b/c the no. bigger
//		Note--If the no. is bigger,it will take all places
//		Note--If the no. is very small then it will six places
//		System.out.printf("%6.2f",a);
		String str="Java";
//		System.out.printf("%s",str);
//		System.out.printf("%6s",str);
//		System.out.printf("%-6s",str);
		System.out.format("%s",str);
	}

}
