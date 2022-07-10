package DAY03;

public class EX02 {

	public static void main(String[] args) {
	// 반복문
	// 3. For문
		for(int i = 0;i < 5;i++) { 
		// for(초기식;조건;초기식에서 증감)
			System.out.println(i);
		}
		// 1 ~ 5: 5개
		for (int j = 1; j <= 5; j++) {
			System.out.println("hello world! " + j);
		}		
		// 5 ~ 1: 5개
		for (int j = 5; j >= 1; j--) {
			System.out.println("hello world! 5~1 " + j);
		}		
		// 1+2+ .. +10
		int sum = 0;
		for (int j = 1; j <= 10; j++) {
			sum += j;
		}
		System.out.println(sum);
		
	// break와 continue
	// 1. break
		// 무한 루프(while문)
		int j = 0;
		while(true) { 
			if(j == 5) {
				break;
			}
			System.out.println(j);j++;
		}
		// 무한 루프(for문)
		for(int k = 0; ;k++) { 
			if(k == 5) {
				break;
			}
			System.out.println(k);
		}
		
	// 2. continue - 해당하는 코드는 skip(출력X)
		// - if문
		for(int k = 0;k <= 10;k++) {
			if(k % 4 != 0) {
				System.out.print(k+" ");
			}
		}
		System.out.println();
	
		// - continue로 위와 같은 결과 도출
		for(int k = 0;k <= 10;k++) {
			if(k % 4 == 0) {
				continue;
			}
			System.out.print(k+" ");
		}
		// 결과 - 1 2 3 5 6 7 9 10
	}

}
