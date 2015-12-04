package Examples;

import java.util.Scanner;

public class StringReplaceEx {
	
	//String str;
	public static void main (String[] args){
		
		String strold,strnew;
		System.out.println("Enter String :");
		
		Scanner str = new Scanner(System.in);
				 strold = str.nextLine();
		strnew = strold.replace("is","at");
		System.out.println("The replaced string is : " + strnew);
		System.out.println("The actual string is : " + strold);
		str.close();
		
		
		
	}
	
	
	
	

}
