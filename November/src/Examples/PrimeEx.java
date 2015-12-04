package Examples;

public class PrimeEx {

	public static void isPrime(int n){
		
		for (int i=2;i<(n/2);i++){
		if (n%2==0)  {
			
			System.out.println("Not prime");
				}
			}
			
		System.out.println("Prime");
		}
		
		public static void  main (String[] args){
			isPrime(17);
			
		}
	}
