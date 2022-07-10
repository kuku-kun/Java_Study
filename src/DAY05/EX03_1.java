package DAY05;

public class EX03_1 {
	public static void main(String[] args) {
	// 문자열
		// 1.String변수에 값 저장
		String a = "안녕하세요";
		String b = new String("안녕하세요"); // 객체로 ㅓ장
		String c = new String("안녕하세요");
		String d = "안녕하세요"; // heap 영역에 constant pool에 저장되고 재활용이 된다.(new로 생성 X)
		System.out.println(a);
		System.out.println(b);
		
		// 2.String끼리 값 비교하기
		// == 으로 비교를 하는 것은 stack영역에 저장된 주소값을 비교한 것이다.
		// String에서 값을 비교하려면 .equals() 사용해야 한다.
		System.out.println(a == d); // true
		System.out.println(b == c); // false : 값을 비교한 것이 아니라 객체의 주소가 같은지를 비교한 것
		System.out.println(a == b); // false
		System.out.println(a.equals(b)); 
		// equal() 사용시 => a == b이면 true
		// 				   a =/= b이면 false
		
		// 3.자료형 변환
		// int -> String
		int num1 = 3;
		String str1 = String.valueOf(num1); 
		System.out.println(num1); // "3"
		
		// String -> int
		String str2 = "5";
		int num2 = Integer.parseInt(str2);
		num2 = Integer.valueOf(str2);
		System.out.println(num2); // 5
		
	}
}
