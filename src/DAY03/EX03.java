package DAY03;

public class EX03 {
	public static void main(String[] args) {
		// 중첩 반복문 - 이중 반복문
		// 바깥 - 행, 안 - 열
		// 스쿼트 10회 3세트
		for (int i = 1; i <= 3; i++) {    // i: 1 2 3
			for (int j = 1; j <= 10; j++) { // j : 1 2 3 4 5 6 7 8 9 10
				System.out.println("스쿼트 " + i + "세트째, " + j + "회");
			}
		}

		// 한줄짜리 별 5개 3행 찍기
		// *****
		// *****
		// *****
		for (int i = 0; i < 3; i++) {   // 행
			for (int j = 0; j < 5; j++) {   // 열: 별의 개수
				System.out.print("*");
			}
			System.out.println();  // 한 행이 끝나는 시점에 줄바꿈
		}
	}
}
