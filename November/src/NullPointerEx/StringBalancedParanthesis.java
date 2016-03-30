package NullPointerEx;

	import java.util.Scanner;
	import java.util.Stack;

	public class StringBalancedParanthesis {

		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
	        
	        Stack<Integer> stk = new Stack<Integer>();
	        System.out.println("Parenthesis Matching Test\n");
	        
	        System.out.println("Enter expression");
	        String exp = scan.next();        
	        int len = exp.length();
	        System.out.println("\nMatches and Mismatches:\n");
	        for (int i = 0; i < len; i++)
	        {    
	            char ch = exp.charAt(i);
	            if (ch == '('){
	                stk.push(i);
	            System.out.println("push"+i);
	            }
	            else if (ch == ')')
	            {
	                try
	                {
	                
	                	int p = stk.pop() + 1;
	                	System.out.println("pop"+p);
	                    System.out.println("')' at index "+(i+1)+" matched with '(' at index "+p);
	                }
	                catch(Exception e)
	                {
	                    System.out.println("')' at index "+(i+1)+" is unmatched");
	                }
	                finally{
	                	scan.close();
	                }
	                
	            }            
	        }
	        while (!stk.isEmpty() )
	            System.out.println("'(' at index "+(stk.pop() +1)+" is unmatched");
	       
	    }
	}

