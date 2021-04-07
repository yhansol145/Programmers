package programmers;

public class SumOfDivisor {
	
	public static int solution(int n) {
		int answer = 0;
		
		for(int i=1 ; i<=n ; i++) {
			if(n%i==0)
				answer += i;
			else
				continue;
		}
		
		return answer;
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("12의 약수를 모두 더하면 "+ solution(12));
		System.out.println("5의 약수를 모두 더하면 "+ solution(5));
		
	}

}
