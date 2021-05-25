package area.java;

import java.util.Scanner;

public class area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int b,h;
		System.out.print("Enter The value of Base : ");
		b=sc.nextInt();
		System.out.print("Enter the valueb of Height : ");
		h=sc.nextInt();
		float a=(1*b*h)/2;
		//float a=0.5f*b*h;
		//float a=1f/2f*b*h;
		System.out.print("The Area of Triangle is : "+a);//Here +a is a Concatenation in Java
	}

}
