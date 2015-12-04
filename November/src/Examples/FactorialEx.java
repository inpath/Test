package Examples;

import java.util.Scanner;

 public class FactorialEx {

	/*public static int factrecur(int n){
		int val;
		
		if(n==1){
		
		return 1;
	}
	val = factrecur(n-1)*(n);
	return val;
	
	}*/
	public static int fact(int n){
		int val=1;
		if (n==1){
			return 1;
			
		}
		for (int i=2;i<=n;i++){
		
			val = val*i;
		}
			
		return val;
		
	}	
	
	
	
	public static void main(String [] args){
		int finalval;
		System.out.println("Enter the number for factorial :");
		Scanner sc = new Scanner (System.in);
		int number = sc.nextInt();
		
		//finalval = factrecur(number);
		//System.out.println("The factorial of  " + number +" is :" +finalval );
		
		finalval = fact(number);
		System.out.println("The factorial of  " + number +" is :" +finalval );
		
						
		}
			
		
	}
	
	

