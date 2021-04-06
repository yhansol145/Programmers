package programmers;

public class SumBetweenInteger {
	
	public static long solution(int a, int b) {
		
		long answer = 0;
		
		if(a==b) {
			answer = a;
		}
		else if(a<b) {
			for(int i=a ; i<=b ; i++) {
				answer += i;
			}
		}
		else if(a>b) {
			for(int i=b ; i<=a ; i++) {
				answer += i;
			}
		}
		
		return answer;
	}

	public static void main(String[] args) {
		
		System.out.println(solution(3,5));
		System.out.println(solution(3,3));
		System.out.println(solution(5,3));
		
	}

}
