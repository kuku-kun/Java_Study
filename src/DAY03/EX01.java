package DAY03;

public class EX01 {
	public static void main(String[] args) {
		// 반복문
		// 1.while문
		int i = 0;
		while(i < 3) {
			System.out.println(i); // 0 1 2 출력
			++i;//더한 뒤에 시행(증감 연산자_전위)
			// i++: 시행하고서 더한다(증감 연산자_후위)
		}
		
		// ++i vs i++
		int num = 1;
		System.out.println("num = 1이면");
		System.out.println("num: "+num); // 1
		System.out.println("num++: "+ num++); // 1 - 출력시키고서 연산
		System.out.println("++num: "+(++num)); // 3 - 연산하고서 출력
		System.out.println("num: "+num); // 3
	
		// 0 ~ 4: 5번 
		i = 0;
		while (i < 5) {
			System.out.println("Hello world! " + i);
			i++;
		}
				
		// 1 ~ 5: 5번 
		i = 1;
		while (i <= 5) {
			System.out.println("Hello world! " + i);
			i++;
		}
				
		// 5 ~ 0: 6번
		i = 5;
		while (i >= 0) {
			System.out.println("Hello " + i);
			i--;
		}
		
		// 2. do-while문
		// -> 조건이 거짓이라도 한 번 수행하는 반복문
		int a = 4;
		do {
			System.out.println(a);
			a++;
		} while (a < -1); // a = 4로 조건에 거짓이지만 한 번 출력된다

	}
}
