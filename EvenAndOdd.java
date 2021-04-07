package programmers;

public class EvenAndOdd {
	
	public static String solution(int num) {
		return num%2==0 ? "Even" : "Odd";
	}

	public static void main(String[] args) {
		
		System.out.println("3는(은) Even? Odd? "+ solution(3));
		System.out.println("4는(은) Even? Odd? "+ solution(4));

	}

}
