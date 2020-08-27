package chap05;

public class EnumMethodExample {
	public static void main(String [] args) {
		//name() 메쏘드
		//열거 객체가 가지고 있는 문자열을 리턴한다
		Week today = Week.SUNDAY;
		System.out.println("name() 결과");
		String name = today.name();
		
		
		System.out.println(name);
		
		//ordinal() 멨오드
		//전체 열거 객체 중에 몇 번째 열거 객체인지 리턴한다
		int ordinal = today.ordinal();
		
		System.out.println("ordinal() 결과");
		System.out.println(ordinal);
		
		//compareTo() 메쏘오오오드
		//매개값으로 주어진 열거 객체를 기준으로 전후 위치를 숫자로 리턴한다
		Week day1 = Week.MONDAY;
		Week day2 = Week.TUESDAY;
		int result1 = day1.compareTo(day2);
		int result2 = day2.compareTo(day1);
		
		System.out.println("compareTo() 결과");
		System.out.println(result1);
		System.out.println(result2);
		
		//valueOf() 메thㅗ드
		//매개값으로 주어진 문자열과 동일한 문자열을 가지는 열거 객체 리턴
		if(args.length ==1) {
			String strDay = args[0];
			Week weekDay = Week.valueOf(strDay);
			System.out.println("valueOf() 결과");
			if(weekDay == Week.SATURDAY || weekDay == Week.SUNDAY) {
				System.out.println("주말이군뇨!");
			}else {
				System.out.println("평일이네옹...");
			}
		}
		
		//values() 메sword
		//열거타입의 모든 열거 객체들을 배열로 리턴
		
		System.out.println("values() 결과");
		Week[] days = Week.values();
		for(Week day : days) {
			System.out.println(day);
		}
		
	}

}
