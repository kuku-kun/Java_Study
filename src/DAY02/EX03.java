package DAY02;

import java.util.Scanner;

public class EX03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("���� �Է�"); int num = scan.nextInt();
		
		// switch - case
		switch(num) { // ������ ��� case�� �ش��ϸ� ���
		case 1: // num == 1�̸�
			System.out.println("1�̴�");break;
		case 2: // num == 2�̸�
			System.out.println("2�̴�");break;
		default:
			System.out.println("nothing");
		}

	}

}
