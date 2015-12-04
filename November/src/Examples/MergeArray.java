package Examples;

import java.io.*;

public class MergeArray {

	public static void main(String[]args)throws IOException{

		  int[]a = {1, 2, 3,9};
		  int[]b = {4, 5, 6};
		  int x = a.length; 
		  int y = b.length;
		 int j = (a.length+b.length);
		 int i;
		 int[] c = new int[a.length + b.length];
		/* System.arraycopy(a,0,c,0,a.length);
		 System.arraycopy(b, 0, c, a.length, b.length);
		
		 for (int i=0;i<j;i++){
			 
		 System.out.println(c[i]);
		 } */
		 for ( i=0;i<x;i++){
		 c[i] = a[i];
		 System.out.println(c[i]);
		 }
		 for ( i=0;i<y;i++){
			 
			  c[x+i] = b[i];
			 
		 }
		 System.out.println("The merged array is : ");
		 for (i=0;i<=j;i++){
			 System.out.println(c[i]);
		 	}
	}
				
	}
