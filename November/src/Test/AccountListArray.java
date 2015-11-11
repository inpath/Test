package Test;
import java.util.ArrayList;
import java.util.Iterator;
public class AccountListArray {
	int id;
	String name;
	public AccountListArray(int id,String name){
		
				this.id = id;
		this.name = name;
		
		}
	
/*	public void search(String s)
	{
		this.name = s;
		ArrayList <AccountListArray> b = new ArrayList<>();
		for(AccountListArray y: b)
		{
			if (y.name ==This.name)
			System.out.println(y.id+" "+y.name);	
	}
	}
	*/
		public static void main(String[] args) {
		AccountListArray acc1 =new AccountListArray(100,"Sam");
		AccountListArray acc2 = new AccountListArray(101,"Tom");
		AccountListArray acc3 = new AccountListArray(102,"Bob");
		AccountListArray acc4 = new AccountListArray(103,"Adam");
		AccountListArray acc5 = new AccountListArray(104,"Ted");
		
		ArrayList <AccountListArray> a = new ArrayList<>();
		a.add(acc1);
		a.add(acc2);
		a.add(acc3);
		a.add(acc4);
		a.add(acc5);
		
		// Print using For each loop
		for(AccountListArray i :a)
		{
		System.out.println("The AccountNumber and name ");
		System.out.println(i.id +" "+ i.name);
		}
		// Print get one element in ArrayList
		for(AccountListArray k :a)
		{
			
			if (k.name == "Sam" ){
				
			System.out.println("Printing only one element");
						
				System.out.println("The Account number of sam is : "+ k.id);
			}
		}
		// To print elements of Account using iterator
		Iterator <AccountListArray> i1 = a.iterator();
		while(i1.hasNext()){
		AccountListArray acc = i1.next();		
		System.out.println("Printing using Iterator Id :  " + acc.id + " Name : "+acc.name);	
		}
		}
	}