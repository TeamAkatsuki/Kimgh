package chap04.ex;
import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		
		boolean run = true;
		int balance = 0;
		Scanner scanner = new Scanner(System.in);
		int input;
		
		while(run) {
			System.out.println("=====================================");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
			System.out.println("=====================================");
			System.out.print("선택>");
			input = scanner.nextInt();
			
				if (input == 1) {
					System.out.println(">> 얼마 넣을라고?");
					input = scanner.nextInt();
					balance += input;
				}
									
				else if (input == 2) {
					System.out.println(">> 얼마 뺄라고?");
					input = scanner.nextInt();
					balance -= input;
				}
					
				
				else if (input == 3) {
					System.out.println(balance + "원 있다");
					}
				
				else if (input == 4) {
					break;
				}
					}
		}

	
	
	
}



			
