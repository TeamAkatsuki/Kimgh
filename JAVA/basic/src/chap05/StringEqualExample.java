package chap05;

public class StringEqualExample {
	public static void main(String [] args) {
		String strVar1 = "김근호";
		String strVar2 = "김근호";
		
		if(strVar1 == strVar2) { // 참조를 비교한다
			System.out.println("strVar1과 strVar2는 참조가 같다");
		}else {
			System.out.println("참조가 다르다");
		}
		if(strVar1.equals(strVar2)) { // 값을 비교한다
			System.out.println("strVar1과 strVar2는 문자열이 같다");
		}
		
		String strVar3 = new String("김근호");
		String strVar4 = new String("김근호"); // new가 붙으면 무조건 새로운 객체를 생성한다
		
		if(strVar3 == strVar4) {
			System.out.println("strVar3와 strVar4는 참조가 같다");
		}else {
			System.out.println("strVar3와 strVar4는 참조가 다르다");
		}
		if(strVar3.equals(strVar4)) {
			System.out.println("strVar3와 strVar4는 문자열이 같다");
		}
		
		strVar3 = null;
		
	}

}
