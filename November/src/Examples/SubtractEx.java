package Examples;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class SubtractEx {

	public static void main(String [] args) throws NumberFormatException, IOException {
	int a,b,c;
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(ir);
		
			
		System.out.println("Enter first number : ");
		
		 a= Integer.parseInt(br.readLine());
		
		System.out.println("Enter second number : ");
		 b = Integer.parseInt(br.readLine());
	if (a>b){
		c=a-b;
	}
		else {
			c=b-a;
		}
				
		System.out.println("The subtraction of two numbers is : "+c);
	
	}
	
}
