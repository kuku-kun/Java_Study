package DAY05;

public class EX02 {
	public static void main(String[] args) {
		// 2차원 배열 - 바깥: 행, 안: 열
		int[][] scores = {
				{89, 93, 91}, 
				{91, 82, 72}, 
				{98, 93, 94}, 
				{65, 63, 71}, 
				{45, 50, 48}
		};
		System.out.println("3행 2열:"+scores[2][1]); //93
		System.out.println("5행 1열:"+scores[4][0]); //45
	
		// 2차원 배열 출력 - 이중 반복문(행/열)
		for(int i = 0;i < scores.length;i++) {
			for(int j = 0; j < scores[i].length;j++) {
				System.out.println((i+1)+"행"+(j+1)+"열"+scores[i][j]);
			}
		}
		
		// Avg
		int sum1 = 0; // 총 점수 평균
		for(int i = 0;i < scores.length;i++) {
			int sum2 = 0; // i+1행 학생의 평균
			for(int j = 0;j < scores[i].length;j++) {
				sum1 += scores[i][j];
				sum2 += scores[i][j];
			}
			double avg2 = sum2 / (double)scores[i].length;
			System.out.println((i+1)+"행의 평균"+avg2);
		}
		double avg1 = sum1 / ((double)scores.length * (double)scores[0].length);
		System.out.println("총 평균"+avg1);
	}
}
