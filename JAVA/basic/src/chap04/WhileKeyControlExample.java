package chap04;

public class WhileKeyControlExample {
	public static void main(String [] args) throws Exception{
		boolean run = true;
		int speed = 0;
		int keyCode = 0;
		
		while(run) {
			if(keyCode != 13 && keyCode != 10) {
				
//				아스키코드 13번 -> 캐리지 리턴 (문자열 첫 자리로)
//				아스키코드 10번 -> 라인 피드 (라인 갱신)
//				13 + 10 = Enter!
//				  --> 타자기에서 유래
//				따라서 키 하나 + Enter는 3개의 코드로 이루어져 있다.
//				이 정보는 버퍼에 저장된다.
				
				System.out.println("===================");
				System.out.println("1. 가속 | 2. 감속 | 3. 중지");
				System.out.println("===================");
				System.out.print("선택 : ");
				
//				println은 출력 후 줄바꿈, print는 줄 안 바꿈


			}
			
			keyCode = System.in.read();
//			엔터만 제외한 코드를 keyCode에 대입한다
			
			if(keyCode == 49) {//1을 읽었을 경우
				speed++;
				System.out.println("현재 속도 = " + speed);
			}else if(keyCode == 50) {//2를 읽었을 경우
				speed--;
				System.out.println("현재 속도 = " + speed);
			}else if(keyCode == 51) {
				run = false;
				
			
			}
		}
	}

}
