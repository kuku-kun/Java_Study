package DAY02;

import java.util.Scanner;

public class EX03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자 입력"); int num = scan.nextInt();
		
		// switch - case
		switch(num) { // 변수명 적어서 case에 해당하면 출력
		case 1: // num == 1이면
			System.out.println("1이다");break;
		case 2: // num == 2이면
			System.out.println("2이다");break;
		default:
			System.out.println("nothing");
		}

	}

}
