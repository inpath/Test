package Examples;

import java.io.DataInputStream;
import java.io.IOException;

public class MultiplyEx {

	public static void main(String [] args) throws NumberFormatException, IOException{
		
	DataInputStream s= new DataInputStream(System.in);
	System.out.println("Enter first number : ");
	int i= Integer.parseInt(s.readLine());
	System.out.println("Enter second number : ");
	int j = Integer.parseInt(s.readLine());
	
	i=i*j;
	System.out.println("The product of two number : "+i);
			
	}
		
}
