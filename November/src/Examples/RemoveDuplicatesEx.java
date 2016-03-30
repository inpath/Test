package Examples;

import java.util.TreeSet;

public class RemoveDuplicatesEx {

	public static void main(String [] args){
	
	String arr [] = {"1","2","3","4","5","2","4"};
	
	TreeSet<String> ts=new TreeSet <String>();
	for (String arr2:arr)
	{
	if(!ts.add(arr2))
	System.out.println("the duplicates are :"+arr2);
	
	}	
		
	System.out.println("The Array after removing duplicates is :"+ts.toString());
	
}	
}