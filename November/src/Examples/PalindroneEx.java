package Examples;

import java.util.Scanner;

public class PalindroneEx {

	public static void main(String [] args){
		
		String reverse="",str;
		int length;
		
	System.out.println("Enter string : ");
	Scanner sc = new Scanner(System.in);
	str = sc.nextLine();

	length = str.length();
	
	for (int i=length-1;i>=0;i--){
		reverse=reverse+str.charAt(i);
		}
	
		if (str.equals(reverse)){
			System.out.println("String is Palindrone");
		}
		else{
			System.out.println("Sting is not Palindrone");
		}
		
	
	sc.close();	
	}
	
		
	
}
