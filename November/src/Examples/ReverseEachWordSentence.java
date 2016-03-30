package Examples;
import java.util.*;

public class ReverseEachWordSentence {
	
	public static void main(String [] args){
			
			System.out.println("Enter String : ");
			Scanner sc = new Scanner(System.in);
			String s = sc.nextLine();
			StringBuffer buffer = new StringBuffer();
			
			String[] str = s.split(" ");
			for (int i=str.length-1;i>=0;i--){
				buffer.append(str[i]);
				buffer.append(" ");			
			}		
				System.out.println(s);
				System.out.println(buffer.reverse());	
				
				sc.close();
				}
	
			}
	

	

