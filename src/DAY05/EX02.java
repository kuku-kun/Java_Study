package DAY05;

public class EX02 {
	public static void main(String[] args) {
		// 2���� �迭 - �ٱ�: ��, ��: ��
		int[][] scores = {
				{89, 93, 91}, 
				{91, 82, 72}, 
				{98, 93, 94}, 
				{65, 63, 71}, 
				{45, 50, 48}
		};
		System.out.println("3�� 2��:"+scores[2][1]); //93
		System.out.println("5�� 1��:"+scores[4][0]); //45
	
		// 2���� �迭 ��� - ���� �ݺ���(��/��)
		for(int i = 0;i < scores.length;i++) {
			for(int j = 0; j < scores[i].length;j++) {
				System.out.println((i+1)+"��"+(j+1)+"��"+scores[i][j]);
			}
		}
		
		// Avg
		int sum1 = 0; // �� ���� ���
		for(int i = 0;i < scores.length;i++) {
			int sum2 = 0; // i+1�� �л��� ���
			for(int j = 0;j < scores[i].length;j++) {
				sum1 += scores[i][j];
				sum2 += scores[i][j];
			}
			double avg2 = sum2 / (double)scores[i].length;
			System.out.println((i+1)+"���� ���"+avg2);
		}
		double avg1 = sum1 / ((double)scores.length * (double)scores[0].length);
		System.out.println("�� ���"+avg1);
	}
}
