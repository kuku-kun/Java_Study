package DAY03;

public class EX03 {
	public static void main(String[] args) {
		// ��ø �ݺ��� - ���� �ݺ���
		// �ٱ� - ��, �� - ��
		// ����Ʈ 10ȸ 3��Ʈ
		for (int i = 1; i <= 3; i++) {    // i: 1 2 3
			for (int j = 1; j <= 10; j++) { // j : 1 2 3 4 5 6 7 8 9 10
				System.out.println("����Ʈ " + i + "��Ʈ°, " + j + "ȸ");
			}
		}

		// ����¥�� �� 5�� 3�� ���
		// *****
		// *****
		// *****
		for (int i = 0; i < 3; i++) {   // ��
			for (int j = 0; j < 5; j++) {   // ��: ���� ����
				System.out.print("*");
			}
			System.out.println();  // �� ���� ������ ������ �ٹٲ�
		}
	}
}
