package programmers;

import java.util.Arrays;

public class Budget {
	
	 public int solution(int[] d, int budget) {
		 Arrays.sort(d);
		 int answer = 0;
		 for(int i=0 ; i<d.length ; i++) {
			 budget -= d[i];
			 if(budget<0)
				 break;
		 answer++;
		 }
		 return answer;
	 }
}