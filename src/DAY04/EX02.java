package DAY04;

public class EX02 {
	// Method만들기 - function
	/*
	 1. 어떤 함수를 만들지 메소드명을 짓는다.(동사)
	 2. input을 무엇을 받을지 생각한다.
	 3. output을 무엇으로 돌려줄지 생각한다.
	 4. 구현
	 */
	// static이면 다른 method를 부를 수 있다(<->private)
	// 메모리에 없으면 참조 불가로 static으로 정의!
	public static int sum(int a, int b) {
		return a+ b;
	}
	public static void printHelloWorld() {
		System.out.println("HellWorld!");
		return; // return으로 method는 종료
	}
	
	public static void main(String[] args) {
	// 메소드를 사용하는 곳
		int x = 30;
		int y = 50;
		int result = sum(x, y);  // 전달 인자 (argument)
		System.out.println(result); // 80
		System.out.println(sum(x, y)); // method로 return값 부르기
				
		printHelloWorld(); // method사용
	}
}
