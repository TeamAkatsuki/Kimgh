package chap06.method;

public class Calculator {
	
	//메소드
	
	void powerOn() {
		System.out.println("전원을 킨다.");
	}
	
	int plus(int x, int y) {
		int result = x + y;
		return result;
	}
	
	int minus(int x, int y) {
		int result = x - y;
		return result;
	}
	
	double divide(int x, int y) {
		double result = (double)x / y;
		return result;
	}
	
	int multiply(int x, int y) {
		int result = x * y;
		return result;
	}
	
	void powerOff() {
		System.out.println("종료");
	}

}
