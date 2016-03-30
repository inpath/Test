package Examples;

import java.util.TreeSet;

//import java.util.*;
public class FindDuplicates {

	public static void main(String [] args){
		
	String [] arr = {"abc","xyz","asdf","ijk","abc","xyz","xyz"};
		
	TreeSet <String> ts	 = new TreeSet<String> ();
	for(String str :arr)
		
		if (!ts.add(str)){
		
			System.out.println(str);
					}
		System.out.println("The array after removing duplicates is " +ts.toString());
		
		
		}
		
		
	}
