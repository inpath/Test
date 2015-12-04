package Examples;

import java.io.IOException;
import java.util.Scanner; 

public class a1b1 {

	public static void main(String [] args) throws IOException{
		
	int i,j,n;
	System.out.println("How many numbers you want to enter : ");
	Scanner sc = new Scanner(System.in);
	n=sc.nextInt();
	int [] arr1 = new int [n];
	
	System.out.println("Enter the numbers : ");
	
	for(i=0;i<n;i++){

	arr1[i] = sc.nextInt();	
}
	int [] arr2 = new int [n];
	System.out.println("Enter elements for second array : ");
	for(i=0;i<n;i++){

		arr2[i] = sc.nextInt();	
	}	
	
	System.out.println("elements in array1 are:  ");
	
	for(i=0;i<n;i++){
		System.out.println(arr1[i]);		
	}
	System.out.println("elements in array2 are:  ");
	for(i=0;i<n;i++){
		System.out.println(arr2[i]);		
	}
	System.out.println("The desired output is : ");
	for(i=0;i<n-1;i++){
		System.out.print(arr1[i]+","+arr2[i]+",");
	}
	for(i=n-1;i<n;i++){
		System.out.print(arr1[i]+","+arr2[i]+".");
	}
	
	}
		
}
