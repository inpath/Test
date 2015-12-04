package Examples;
	
import java.util.Scanner;
	


public class SwapNumberVariable {
	int i;
	int j;
	
	public static void swapNumber(SwapNumberVariable ref){
		int temp;
		temp = ref.i;
		ref.i=ref.j;
		ref.j=temp;
		
		}
	
	public static void swap(SwapNumberVariable val){
				
		val.i=val.i+val.j;
		val.j=val.i-val.j;
		val.i=val.i-val.j;
			
		}
	
	public static void main (String [] args){
			
		SwapNumberVariable s=new SwapNumberVariable();
		System.out.println("Enter Firstnumber to swap a: ");
		
		Scanner sc = new Scanner(System.in);
		 s.i= sc.nextInt();
		System.out.println("Enter Secondnumber to swap b: ");
		s.j = sc.nextInt();
		
		swapNumber(s);
	
		System.out.println("a : "+s.i +"b : "+s.j);
		swap(s);
		System.out.println("a : "+s.i +"b : "+s.j);
		sc.close();	
	}
	
}
