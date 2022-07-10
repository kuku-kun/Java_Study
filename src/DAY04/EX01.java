package DAY04;

public class EX01 {
	// 함수(function - method)
	public static void main(String[] args) {
		// method 사용하기
		
		//반올림 - Math.round();
		double d = 3.68;
		long roundNumber = Math.round(d);
		System.out.println(roundNumber);
		System.out.println(Math.round(d));
		
		// 큰 값
		int max = Math.max(10, 90);
		System.out.println(max);
		System.out.println(Math.max(10, 90));
		
		//절대값 - Math.abs()
		double abs = Math.abs(-5.5);
		System.out.println(abs);
		
		// argument - 전달인자, 인수, input값
		// return - 결과값, output값
	}
}
