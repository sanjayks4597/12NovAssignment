package recursion;

public class SumOfArrayElement {

	public static int sum(int[] arr,int i,int total) {
		
		if(i>arr.length-1)
		{
			return total;
		}
		total=total+arr[i];
		return sum(arr,i+1,total);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		int arr[]= {1,2,5,5,10};
		int total=0;
		int i=0;
		System.out.println(sum(arr,i,total));
	}

}
