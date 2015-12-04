package Examples;

import java.util.ArrayList;

public class ArrayListToArrayEx {

	public static void main(String [] args){
		
		ArrayList <String> alist = new ArrayList <String>();
		
		alist.add("a1b1c1");
		alist.add("a2b2c2");
		alist.add("a3b3c3");
		alist.add("a4b4c4");
		alist.add("a5b5c5");
		
		int j;
		j=alist.size();
		String [] arr= new String [j];
		for(int i=0;i<alist.size();i++){
			arr[i] = alist.get(i);
		}
		System.out.println("Elements in array are : ");
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]); 
		}
	}
	
}
