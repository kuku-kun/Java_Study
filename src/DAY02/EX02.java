package DAY02;

import java.util.Scanner;

public class EX02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("���� �Է�:");int num = scan.nextInt();
		// ��������
		if(num >= 10 && num <= 40) {
			System.out.println(15);
		} else if(num < 10 || num > 40) {
			System.out.println(55);
		}
		// && - AND
		// || - OR
	}
}
