package Examples;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListEx {
	
	/*public List createList(){
		List  l =  ArrayList() <String>;
		l.add("pen");
		l.add("pencil");
		l.add("paper");
		l.add("ruler");
		
		return l;	
		}
	public static void printList(List l1){
		
		Iterator <String>  it = l1
		while(l1.hasnext()){
			syso("The elements are : "+ l1.next());
			
		}
		
	}*/
	
	public static void main (String [] args){
		
		ArrayList <String>  alist = new ArrayList <String> ();
		
		//createList(alist);
		alist.add("pen");
		alist.add("pencil");
		alist.add("paper");
		alist.add("ruler");
		
		for (int i=0;i<alist.size();i++){
		
		System.out.println("The alist elements using for loop : "+ alist.get(i));
		
		}
		for (String k: alist){
			System.out.println("The printing elements using For each loop : "+k);
		} 
		// using iterator
				Iterator <String> it = alist.iterator();
				while(it.hasNext()){
					
					System.out.println("printing using iterator");
					System.out.println(it.next());
					
				}
			//using ListIterator
		ListIterator <String> listit = alist.listIterator();
		while (listit.hasNext()){
			System.out.println(listit.next());
		}
		while (listit.hasPrevious()){
			System.out.println("printing using LIST iterator");
			System.out.println(listit.previous());
			
		}
		// To search an element
		for(int j=0;j<alist.size();j++){
			if (alist.get(j)== "pen"){
				System.out.println("The element is found.");
			}
			
		}
		
	}
	
}

	