package DAY05;

public class EX01 {
	public static void main(String[] args) {
		// Array - �迭
		// �迭�� �ʱ�ȭ
		// 1. 
		int[] scores = {89, 100, 99, 91, 92};
		System.out.println("ù��° ��:" + scores[0]); // index(����)
		System.out.println("�׹�° ��:" + scores[3]);
	
		// 2.
		int[] numbers = new int[3];
		numbers[0] = 10;
		numbers[1] = 20;
		numbers[2] = 30;
		System.out.println(numbers[2]);
		
		// �迭�� �� ����
		numbers[2] = 14;
		System.out.println(numbers); // �ּҰ� - hash������ ���
		System.out.println(numbers[2]); // 14
		
		// �迭���� index�� �ݺ����� ���� ���
		int sum = 0;
		for (int i = 0; i < scores.length; i++) {
			System.out.println(scores[i]);
			sum += scores[i];
		}
		System.out.println(sum); // 471
		
	}
}
