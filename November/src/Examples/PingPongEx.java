package Examples;



public class PingPongEx {

	public static void main(String [] args){
		int a=15;
		if ((a%3==0)&& (a%5==0)){
			System.out.println("ping pong");
		}
		else if (a%3==0){
			System.out.println("ping");
		}
	
		else if (a%5 == 0){
			System.out.println("pong");
		}
		else 
			System.out.println(a);
	}
	
}
