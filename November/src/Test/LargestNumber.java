package Test;

public class LargestNumber {
	
	public int findMax(int[] arr){
	int n=arr[0];
	
	
	for (int j=0;j<arr.length-1;j++)
	{
	if (n<arr[1]){
		n=arr[1];
						
	}
			
	}
		
	return n;
	}
	
	public static void main(String[] args) {
		
		LargestNumber ln = new LargestNumber();
		int [] arr = {213,111,102};
		System.out.println("The largest number in array is "+ ln.findMax(arr));
	}

}
