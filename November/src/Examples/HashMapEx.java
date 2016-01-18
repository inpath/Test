package Examples;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapEx {

	
	public static HashMap <Integer,String>createHashMap(HashMap<Integer,String> hs1){
		
		hs1.put(101, "student1");
		hs1.put(102, "student2");
		hs1.put(103, "student3");
		hs1.put(104, "student4");
		hs1.put(105, "student5");
		return hs1;
		}

	public static void searchHashMap(HashMap<Integer,String> hs2){
		System.out.println("Enter key to be searched  :  ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
	
		System.out.println(hs2.get(n));
		sc.close();
			
	}
	@SuppressWarnings("rawtypes")
	public static void printHashMap(HashMap<Integer,String> hs1){
		System.out.println("The elements in HashMap are : ");
		System.out.println(hs1.entrySet());
		System.out.println(hs1.values());
		for(Map.Entry m: hs1.entrySet()){
			System.out.println(m.getKey()+"-- "+m.getValue());
			
		}
		
	}
	public static void main(String [] args){
		
		HashMap <Integer,String> hs = new HashMap<Integer,String>();
		
		createHashMap(hs);
		printHashMap(hs);
		searchHashMap(hs);
		
			}
}
