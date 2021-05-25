package cuboidArea.java;
import java.util.Scanner;
public class cuboidArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int l,b,h,v,p,tsa,lsa;
        double d;
        /*
         * l=Lenght
         * b=Breadth
         * h=Height
         * v=Volume
         * p=Perimeter
         * tsa=Total Surface Area
         * lsa=Lateral Surface Area
         * d=Diagonal
         * */
        Scanner sc=new Scanner(System.in);
        System.out.print("Eneter the value of Length : ");
        l=sc.nextInt();
        System.out.print("Eneter the value of Breadth : ");
        b=sc.nextInt();
        System.out.print("Eneter the value of Height : ");
        h=sc.nextInt();
        v=l*b*h;
        p=4*(l+b+h);
        tsa=2*(l*b+b*h+h*l);
        lsa=2*h*(l+b);
        d=(Math.sqrt(l*l+b*b+h*h));
        System.out.println("Volume of Cuboid is : "+v);
        System.out.println("Perimeter of Cuboid is : "+p);
        System.out.println("Total Surface Area of Cuboid is : "+tsa);
        System.out.println("Lateral Surface Area of Cuboid is : "+lsa);
        System.out.println("Diagonal of Cuboid is : "+d);
	}

}
