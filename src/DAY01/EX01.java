package DAY01;

public class EX01 {

	public static void main(String[] args) {
		// ������ ���� - int
		int num1 = 10; // �ʱ�ȭ
		System.out.println(num1);
		
		num1 = 15; System.out.println(num1); // ����
		
		// �Ǽ��� ���� - float, double
		float num2 = 1.5f; // double�� ����
		System.out.println(num2);
		double num3 = 162.8;
		System.out.println(num3);

		// ������ ���� - char
		char c = 'z';
		System.out.println(c);
		
		// boolean����: true / false
		boolean isWhat = false;
		System.out.println(isWhat);
		if(isWhat == true) {
			System.out.println(isWhat);
		} else {
			isWhat = true;
		}
		System.out.println(isWhat);
	}
}
