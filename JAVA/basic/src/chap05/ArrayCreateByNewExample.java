package chap05;

public class ArrayCreateByNewExample {
	public static void main(String[] args) {
		int[] arr1 = new int[3]; //배열의 크기만 3으로 지정해 줌, int로 구성된 배열 arr1 
		
		for(int i = 0; i < 3; i++) {
			System.out.println("arr1[" + i + "] : " + arr1[i]);
		}
		
		double[] arr2 = new double[3];
		for(int i = 0; i < 3; i++) {
			System.out.println("arr2[" + i + "] : " + arr2[i]);
			
		}//배열의 크기만 지정한 경우에는 값을 바꿔줄 수 있다.
		
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;
		for(int i = 0; i < 3; i++) {
			System.out.println("arr1[" + i + "] = " + arr1[i]);
			
		}
		arr2[0] = 0.1;
		arr2[1] = 0.2;
		arr2[2] = 0.3;
		for(int i = 0; i < 3; i++) {
			System.out.println("arr2[" + i + "] = " + arr2[i]);
		}
		
		String[] arr3 = new String[3];
		for(int i = 0; i < 3; i++) {
			System.out.println("arr3[" + i + "] = " + arr3[i]);
		}
		
		arr3[0] = "A";
		arr3[1] = "B";
		arr3[2] = "C";
		for(int i = 0; i < 3; i++) {
			System.out.println("arr3[" + i + "] = " + arr3[i]);
		}
	}
}
