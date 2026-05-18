package week_One;


/* What is DSA? It stands for Data Structures and algorithms
 * 				Data Structure: Way to store and organize data efficiently.
 * 				Algorithm: Step by step procedure to solve a problem.
 * In simple words DSA helps us write fast and optimized code.
 * 
 * Why DSA? Reduce time complexity (make code faster)
 * 			Reduce space usage (use less memory)
 * 			Handle large-scale data efficiently.
 * 			Write optimized solutions for real world systems.
 * 
 * Time Complexity: It measures how runtime grows with input size (n). It does not measure 
 * 					actual time in seconds, measures growth of operations.
 * 
 * Big O Notation: It describes worst-case performance.
 * O(1) Constant Time: Time does not depend on input size. Ex: arr[indexvalue]
 * O(1) means constant time complexity where execution time remains same regardless of input size.
 * 
 * O(n) Linear Time: Time increases linearly with input.
 * It means linear time complexity where the number of operations grows proportionally
 * with input size.
 * 
 * O(log n) Logarithmic Time : Problem size reduces by half each step. Ex: Binary search
 * Instead of checking all elements - we eliminate half every time
 * It means logarithmic time complexity where the input size reduces exponentially at each 
 * step, commonly seen in binary search.
 * 
 * O(n log n): It is a time complexity where the algorithm performs n operations across 
 * 			   log n levels, commonly seen in efficient sorting algorithms like merge sort.
 */


public class Day_1 {
	 
	// Complexity O(n)
	static void LargestElement() {
		
		int[] arr = {2,3,53,5,66,234,998,450};
		
		int max = arr[0];
		
		for(int i = 0;i<arr.length;i++) {
			
			if(arr[i]>max)
				max=arr[i];
		}
		System.out.println("Maximum value : "+max);
	}
	
	//Complexity O(n)
	static void SmallestElement() {
		
		int[] arr = {25,63,58,741,12,565,962,5,63,2,7890};
		
		int min = arr[0];
		
		for(int i= 0;i<arr.length;i++) {
			
			if(arr[i]<min)
				min = arr[i];
		}
		System.out.println("Minimum Number : "+min);
	}
	
	//Complexity O(n)
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

/*			INTERVIEW QUESTIONS
 * 
 * Q. Which is better O(n) or O(log n)?
 * 	  O(log n) is better because it reduces problem size exponentially and performs fewer operations compared to O(n).
 * 
 */























