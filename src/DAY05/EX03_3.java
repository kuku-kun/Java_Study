package DAY05;

import java.util.Scanner;

public class EX03_3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String word = scan.next(); // String���� �� �ܾ� �ۼ���
		System.out.println(word); // I love you �Է� �� ���: I
		
		scan.nextLine(); // ���� ����
		
		String text = scan.nextLine(); // ����(�����̽��� ����)
		System.out.println(text); // I love you �Է� �� ���: I love you
		
		scan.close();

	}
}
