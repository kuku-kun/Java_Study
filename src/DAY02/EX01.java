package DAY02;

import java.util.Scanner;

public class EX01 {
	public static void main(String[] args) {
		// �� ������
		Scanner scan = new Scanner(System.in);
		System.out.println("������:");int weight = scan.nextInt();
		
		// ���ǹ� ���
		if(weight < 55) {
			System.out.println("�Ծ��");
		} else if (weight >= 100) {
			System.out.println("���̾�Ʈ �ñ�");
		} else {
			System.out.println("������");
		}
		
		// ���Ͽ� ���� �Ͽ� ���
		System.out.println("���� �� �� �Է��Ͻÿ�");
		int num1 = scan.nextInt(); int num2 = scan.nextInt();
		System.out.println(num1+" "+num2);
		
		if(num1 > num2) {
			System.out.println(num1+"�� �� ũ��");
		} else if(num1 == num2) {
			System.out.println("����");
		} else {
			System.out.println(num2+"�� �� ũ��");
		}
	}
}
