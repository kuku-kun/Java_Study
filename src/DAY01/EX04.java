package DAY01;

import java.util.Scanner;

public class EX04 {
	public static void main(String[] args) {
		// �Է��ϱ�
		Scanner scan = new Scanner(System.in);
		
		System.out.print("����:");
		int noodleCup = scan.nextInt(); // int�� �Է�
		System.out.println("����: "+noodleCup);
		
		System.out.print("���� ����:");
		int count = scan.nextInt(); 
		int sum = noodleCup * count;
		System.out.println("�� ����:"+sum);
		
		scan.close(); // https://ikjo.tistory.com/131

	}
}
