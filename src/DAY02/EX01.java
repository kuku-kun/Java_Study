package DAY02;

import java.util.Scanner;

public class EX01 {
	public static void main(String[] args) {
		// 비교 연산자
		Scanner scan = new Scanner(System.in);
		System.out.println("몸무게:");int weight = scan.nextInt();
		
		// 조건문 출력
		if(weight < 55) {
			System.out.println("먹어라");
		} else if (weight >= 100) {
			System.out.println("다이어트 시급");
		} else {
			System.out.println("괜찮네");
		}
		
		// 비교하여 조건 하에 출력
		System.out.println("숫자 두 개 입력하시오");
		int num1 = scan.nextInt(); int num2 = scan.nextInt();
		System.out.println(num1+" "+num2);
		
		if(num1 > num2) {
			System.out.println(num1+"이 더 크다");
		} else if(num1 == num2) {
			System.out.println("같다");
		} else {
			System.out.println(num2+"이 더 크다");
		}
	}
}
