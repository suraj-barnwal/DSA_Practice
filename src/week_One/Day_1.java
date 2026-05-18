package week_One;

public class Day_1 {
	
	static void LargestElement() {
		
		int[] arr = {2,3,53,5,66,234,998,450};
		
		int max = arr[0];
		
		for(int i = 0;i<arr.length;i++) {
			
			if(arr[i]>max)
				max=arr[i];
		}
		System.out.println("Maximum value : "+max);
	}
	
	
	static void SmallestElement() {
		
		int[] arr = {25,63,58,741,12,565,962,5,63,2,7890};
		
		int min = arr[0];
		
		for(int i= 0;i<arr.length;i++) {
			
			if(arr[i]<min)
				min = arr[i];
		}
		System.out.println("Minimum Number : "+min);
	}
	
	static void SumArray() {
		
		int[] arr = {22,56,365,48,96,78,41,36,963};
		
		int sum = 0;
		
		for(int i=0;i<arr.length;i++) {
			sum += arr[i];
		}
		System.out.println("Sum of the array : "+ sum);
	}
	
	public static void main(String[] args) {
		
		LargestElement();
		SmallestElement();
		SumArray();
	}
}
