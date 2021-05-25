package renamefile.java;
import java.util.Scanner;
import java.io.*;
public class renamefile {
      public static void main(String args[])
      {
    	  Scanner sc=new Scanner(System.in);
    	  System.out.print("Enter filename with accurate path : ");
    	  String path=sc.nextLine();
    	  File oldname=new File(path+"");
    	  System.out.print("Enter different filename with accurate path : ");
    	  String samepath=sc.nextLine();
    	  File newname=new File(samepath+"");
    	  if(oldname.renameTo(newname)) {
    		  System.out.println("Renamed Successfully");
    	  }
    	  else {
    		  System.out.println("Error Ocured : ");
    	  }
      }
}
