package DAY01;

public class EX01 {

	public static void main(String[] args) {
		// 정수형 변수 - int
		int num1 = 10; // 초기화
		System.out.println(num1);
		
		num1 = 15; System.out.println(num1); // 선언
		
		// 실수형 변수 - float, double
		float num2 = 1.5f; // double로 권장
		System.out.println(num2);
		double num3 = 162.8;
		System.out.println(num3);

		// 문자형 변수 - char
		char c = 'z';
		System.out.println(c);
		
		// boolean변수: true / false
		boolean isWhat = false;
		System.out.println(isWhat);
		if(isWhat == true) {
			System.out.println(isWhat);
		} else {
			isWhat = true;
		}
		System.out.println(isWhat);
	}
}
