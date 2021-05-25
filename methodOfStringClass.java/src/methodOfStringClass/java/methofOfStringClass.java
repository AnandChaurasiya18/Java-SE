//Method Of String Class
package methodOfStringClass.java;

public class methofOfStringClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		(1)str.length()--It return the length of String
		
		/*String str="Welcome";
		int l=str.length();
		System.out.println(l);*/
		
//		(2)str.toLowerCase()--It convert the given characters of String into Lowercase
		/*String str1="Welcome";
		str1=str1.toLowerCase();
		System.out.println(str1);*/
		
//		(3)str.toUpperCase()--It covert the given characters of String into UpperCase
		/*String str2="Welcome";
		str2=str2.toUpperCase();
		System.out.println(str2);*/
		
//		(4)str.trim()--It is used to remove the leading and tailing spaces from the array if there are any
		/*String str3="     Welcome     ";
		str3=str3.trim();
		System.out.println(str3);*/
		
//		(5)str.substring(int begin)---IT return a new String by giving the part of a string from where the indexing given
		/*String str4="Welcome";
		str4=str4.substring(3);
		System.out.println(str4);*/
		
//		(6)str.substring(int begin,int end)--It work same as the [str.substring(int begin)] but the starting and ending index both can be given in the substring
		/*String str4="Welcome";
		str4=str4.substring(1,5);
		System.out.println(str4);*/
		
//		(7)str.replace(char old,char new)--It replace the old character with the new character.
		String str5="Welcome";
		str5=str5.replace('e','k');
		System.out.println(str5);
		
	}

}
