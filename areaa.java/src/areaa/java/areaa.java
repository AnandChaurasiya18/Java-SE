//Finding Area of Triangle by Heron`s Formula
package areaa.java;
import java.util.Scanner;
public class areaa {
//
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        double area,s;
        System.out.print("Eneter the value first side of Trianle : ");
        a=sc.nextInt();
        System.out.print("Eneter the value Second side of Trianle : ");
        b=sc.nextInt();
        System.out.print("Eneter the value Third side of Trianle : ");
        c=sc.nextInt();
        s=(a+b+c)/2f;//s is a Semi-Perimeter.
        area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.print("Area of Trianle is : "+area);
	}

}
