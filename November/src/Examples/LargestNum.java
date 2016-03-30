package Examples;

public class LargestNum {

		
		public int findMax(int[] arr){
		int n=arr[0];
				
		for (int j=0;j<arr.length;j++)
		{
			if (n < arr[j])
			{
			n = arr[j];
							
			}
			
		}
			
		return n;
		}
/*	public static void main(String[] args) {
		
		LargestNum ln = new LargestNum();
		int [] arr = {11,115,35,67,70};
		System.out.println("The largest number in array is "+ ln.findMax(arr));
	} 
	*/

}
