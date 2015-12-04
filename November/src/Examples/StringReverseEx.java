package Examples;

import java.util.Scanner;

	public class StringReverseEx {

			public static void main(String [] args){
			
			System.out.println("Enter string please : ");
			Scanner str = new Scanner(System.in);
			String str1=str.nextLine();
			for (int i=str1.length()-1;i>=0;i--){
				System.out.print(str1.charAt(i));
				
				}		
		str.close();
			}
			
	}	