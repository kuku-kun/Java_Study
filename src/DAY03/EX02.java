package DAY03;

public class EX02 {

	public static void main(String[] args) {
	// �ݺ���
	// 3. For��
		for(int i = 0;i < 5;i++) { 
		// for(�ʱ��;����;�ʱ�Ŀ��� ����)
			System.out.println(i);
		}
		// 1 ~ 5: 5��
		for (int j = 1; j <= 5; j++) {
			System.out.println("hello world! " + j);
		}		
		// 5 ~ 1: 5��
		for (int j = 5; j >= 1; j--) {
			System.out.println("hello world! 5~1 " + j);
		}		
		// 1+2+ .. +10
		int sum = 0;
		for (int j = 1; j <= 10; j++) {
			sum += j;
		}
		System.out.println(sum);
		
	// break�� continue
	// 1. break
		// ���� ����(while��)
		int j = 0;
		while(true) { 
			if(j == 5) {
				break;
			}
			System.out.println(j);j++;
		}
		// ���� ����(for��)
		for(int k = 0; ;k++) { 
			if(k == 5) {
				break;
			}
			System.out.println(k);
		}
		
	// 2. continue - �ش��ϴ� �ڵ�� skip(���X)
		// - if��
		for(int k = 0;k <= 10;k++) {
			if(k % 4 != 0) {
				System.out.print(k+" ");
			}
		}
		System.out.println();
	
		// - continue�� ���� ���� ��� ����
		for(int k = 0;k <= 10;k++) {
			if(k % 4 == 0) {
				continue;
			}
			System.out.print(k+" ");
		}
		// ��� - 1 2 3 5 6 7 9 10
	}

}
