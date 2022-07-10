package DAY01;

public class EX03 {
	public static void main(String[] args) {
		// 자료형 변환 - casting
		double pi = 3.14;
		int intPi = (int)pi;
		//System.out.println(intPi, (double)intPi);
		// - println()는 자료형이 같아야 출력시킴
		System.out.println(intPi); // 3
		System.out.println((double)intPi); // 3.0
		
		int num = 7;
		double result = num/3;
		System.out.println(result);// int형/int형 = int형이라서 2.0
		
		// double로 결과를 얻으려면? 
		//1. 둘 중 하나를 형변환
		result = num / (double)3; 
		System.out.println(result); // 2.33333333333
		//2. double형/double형
		
		// 반올림 하는 법 - Math.round(실수)
		pi = 3.1454353;
		System.out.println(Math.round(pi)); // double형 or float형을 넣어서 반올림
		// if 소수점 n번째 자리에서 반올림하고 싶다면?
		System.out.println(Math.round(pi*100)/100.0); // 소수점 2번째(10^2) 자리 반올림
		
	}
}
