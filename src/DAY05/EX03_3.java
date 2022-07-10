package DAY05;

import java.util.Scanner;

public class EX03_3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String word = scan.next(); // String으로 긴 단어 작성용
		System.out.println(word); // I love you 입력 시 출력: I
		
		scan.nextLine(); // 엔터 지움
		
		String text = scan.nextLine(); // 문장(스페이스바 포함)
		System.out.println(text); // I love you 입력 시 출력: I love you
		
		scan.close();

	}
}
