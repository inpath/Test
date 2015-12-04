package Examples;

public class StringWordsCount {

	public static void main(String [] args){
		
		String str = "This is nice";
		String str1;
		String [] words;
		try{		
		for (int i=0;i<str.length();i++){
		words = str.split(" ");
		str1 = words[i];
		str1=str1+(i+1);
		System.out.print(str1+" ");
		
		}
		}catch( ArrayIndexOutOfBoundsException e){
			e.printStackTrace();
			System.out.println("error");
			
		}
	}
	
}
