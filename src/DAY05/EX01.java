package DAY05;

public class EX01 {
	public static void main(String[] args) {
		// Array - 배열
		// 배열의 초기화
		// 1. 
		int[] scores = {89, 100, 99, 91, 92};
		System.out.println("첫번째 값:" + scores[0]); // index(색인)
		System.out.println("네번째 값:" + scores[3]);
	
		// 2.
		int[] numbers = new int[3];
		numbers[0] = 10;
		numbers[1] = 20;
		numbers[2] = 30;
		System.out.println(numbers[2]);
		
		// 배열의 값 변경
		numbers[2] = 14;
		System.out.println(numbers); // 주소값 - hash값으로 출력
		System.out.println(numbers[2]); // 14
		
		// 배열값을 index로 반복문을 통해 출력
		int sum = 0;
		for (int i = 0; i < scores.length; i++) {
			System.out.println(scores[i]);
			sum += scores[i];
		}
		System.out.println(sum); // 471
		
	}
}
