package DAY01;

public class EX02 {
	public static void main(String[] args) {
		int noodleCup = 850;
		// ������ 3�� ���� ���
		int total = noodleCup * 3;
		System.out.println("����:"+total);
		
		// 10000������ ���� �� �Ž�����
		int num = 10000 / noodleCup;
		total = num * noodleCup;
		System.out.println("�Ž�����:"+(10000-total));
		System.out.println("����:"+num);
		
		// 5000������ ���� �� �Ž�����, ����
		num = 5000 / noodleCup;
		total = num * noodleCup;
		System.out.println("�Ž�����:"+(5000-total));
		System.out.println("����:"+num);
	}
}
