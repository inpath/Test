package Examples;

public class PrintTen {

	public static void recurTen(int n){
		
	if (n<=10){
		System.out.println(n);
		recurTen(n+1);
	}		
	}
	public static void main(String[] args){
			recurTen(1);		
	}
		
}
