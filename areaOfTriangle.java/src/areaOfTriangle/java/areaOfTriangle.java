package areaOfTriangle.java;
import java.util.Scanner;

public class areaOfTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    		int b,h;
    		System.out.println("Enter The value of Base : ");
    		int b=sc.nextInt();
    		System.out.println("Enter the valueb of Height : ");
    		int h=sc.nextInt();
    		float a=1/2*b*h;
    		System.out.println("The Area of Triangle is : "+a);
	}

}
