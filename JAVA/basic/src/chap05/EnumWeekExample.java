package chap05;

import java.util.Calendar;

public class EnumWeekExample {
	public static void main(String[] args) {
		Week today = null; //열거타입 변수 선언
		
		Calendar cal = Calendar.getInstance();
		// 현재 시간을 가져옵니다
		int week = cal.get(Calendar.DAY_OF_WEEK);
		//일(1) ~ 토(7)를 숫자로 반환
		
		switch(week) {
		
		case 1:
			today = Week.SUNDAY;
			break;
		case 2:
			today = Week.MONDAY;
			break;
		case 3:
			today = Week.TUESDAY;
			break;
		case 4:
			today = Week.WEDNESDAY;
			break;
		case 5:
			today = Week.THURSDAY;
			break;
		case 6:
			today = Week.FRIDAY;
			break;
		case 7:
			today = Week.SATURDAY;
			break;
		}
		
		System.out.println("오늘은" + today + "!");
		
		if(today == Week.SUNDAY) {
			System.out.println("일요일에는 축구함");
		}else {
			System.out.println("열심히 자바를 공부함");
		}
	}

}
