package chap04.ex;

public class Ex01 {
	public static void main(String[] args) {
		int a;
		int b;
		String sum;
		
		for(a = 2; a < 10; a++) {
			System.out.println("===="+ a +"��===");
			
			for(b = 1; b < 10; b++) {
				
				System.out.println(a + " X " + b + " = " + (a*b));
				
			}
		}
		
	}

}
