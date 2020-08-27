package chap05;

public class AdvancedForExample {
	public static void main(String [] args) {
		int [] scores = {95, 71, 84, 93, 87};
		
		int sum = 0;
		for(int score : scores) { // array의 처음부터 끝까지 훑는 for문 고유의 명령
			sum += score;
		}
		System.out.println("총합 = " + sum);
		
		double avg = (double)sum/scores.length;
		
		System.out.println("평균 = " + avg);
	}

}
