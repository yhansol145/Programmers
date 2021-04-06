package programmers;

public class GetAvg {
	
	public static double solution(int[] arr) {
		
		double sum = 0;
		double avg = 0;
		
		for(int i=0 ; i<arr.length ; i++) {
			sum += arr[i];
		}
		
		avg = sum/(arr.length);
		
		return avg;
		
	}

	public static void main(String[] args) {
		
		
		int [] arr1 = {1,2,3,4};
		int [] arr2 = {5,5};
		
		System.out.println(solution(arr1));
		System.out.println(solution(arr2));
		
	}

}
