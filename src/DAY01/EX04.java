package DAY01;

import java.util.Scanner;

public class EX04 {
	public static void main(String[] args) {
		// 입력하기
		Scanner scan = new Scanner(System.in);
		
		System.out.print("가격:");
		int noodleCup = scan.nextInt(); // int형 입력
		System.out.println("가격: "+noodleCup);
		
		System.out.print("구매 갯수:");
		int count = scan.nextInt(); 
		int sum = noodleCup * count;
		System.out.println("총 가격:"+sum);
		
		scan.close(); // https://ikjo.tistory.com/131

	}
}
