package chap04.ex;

public class Ex02 {
	
	public static void main(String[] args) {
		//while���� Math.random() �޼ҵ� ���, �� ���� �ֻ����� ������ �� ������ ���� 
		//���� Ʃ�� ���·� ǥ���ϰ�, 5�� �ƴϸ� ������, 5�̸� ���߰� ������
		Outter: while(true) {
		int a = (int)(Math.random() * 6) + 1;
		int b = (int)(Math.random() * 6) + 1;
		System.out.println("(" + a + " , " + b + ")");
			
		
		if(a + b == 5) {
			break Outter;
			}
		}
	}
}