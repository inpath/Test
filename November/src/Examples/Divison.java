package Examples;

import java.util.Scanner;

import javax.imageio.IIOException;

public class Divison {

	public static void main(String [] args){
		
		System.out.println("Enter first number " );
		Scanner sc = new Scanner (System.in);
		int a = sc.nextInt();
		sc.close();
		System.out.println("Enter second number " );
		
		int b = sc.nextInt();
		try{
		System.out.println(a/b);
		}catch (Exception e){
		
			System.out.println("You are trying to divide by zero");
		}
		
	}
}
