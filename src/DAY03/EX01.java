package DAY03;

public class EX01 {
	public static void main(String[] args) {
		// �ݺ���
		// 1.while��
		int i = 0;
		while(i < 3) {
			System.out.println(i); // 0 1 2 ���
			++i;//���� �ڿ� ����(���� ������_����)
			// i++: �����ϰ� ���Ѵ�(���� ������_����)
		}
		
		// ++i vs i++
		int num = 1;
		System.out.println("num = 1�̸�");
		System.out.println("num: "+num); // 1
		System.out.println("num++: "+ num++); // 1 - ��½�Ű�� ����
		System.out.println("++num: "+(++num)); // 3 - �����ϰ� ���
		System.out.println("num: "+num); // 3
	
		// 0 ~ 4: 5�� 
		i = 0;
		while (i < 5) {
			System.out.println("Hello world! " + i);
			i++;
		}
				
		// 1 ~ 5: 5�� 
		i = 1;
		while (i <= 5) {
			System.out.println("Hello world! " + i);
			i++;
		}
				
		// 5 ~ 0: 6��
		i = 5;
		while (i >= 0) {
			System.out.println("Hello " + i);
			i--;
		}
		
		// 2. do-while��
		// -> ������ �����̶� �� �� �����ϴ� �ݺ���
		int a = 4;
		do {
			System.out.println(a);
			a++;
		} while (a < -1); // a = 4�� ���ǿ� ���������� �� �� ��µȴ�

	}
}
