package DAY02;

import java.util.Scanner;

public class EX02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("숫자 입력:");int num = scan.nextInt();
		// 논리연산자
		if(num >= 10 && num <= 40) {
			System.out.println(15);
		} else if(num < 10 || num > 40) {
			System.out.println(55);
		}
		// && - AND
		// || - OR
	}
}
