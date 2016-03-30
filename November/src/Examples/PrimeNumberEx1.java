package Examples;

public class PrimeNumberEx1 {


public  Boolean isPrime(int n){
		
	Boolean isPrime = true;
		for (int i=2;i<(n/2);i++){
		if (n%2==0)  {
			
			//System.out.println("Not prime");
			return isPrime=false;
				}
			}
		//System.out.println("Prime");
		return isPrime;
		}
						
	}

