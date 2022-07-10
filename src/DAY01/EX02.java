package DAY01;

public class EX02 {
	public static void main(String[] args) {
		int noodleCup = 850;
		// 육개장 3개 가격 계산
		int total = noodleCup * 3;
		System.out.println("가격:"+total);
		
		// 10000원으로 구매 시 거스름돈
		int num = 10000 / noodleCup;
		total = num * noodleCup;
		System.out.println("거스름돈:"+(10000-total));
		System.out.println("갯수:"+num);
		
		// 5000원으로 구매 시 거스름돈, 갯수
		num = 5000 / noodleCup;
		total = num * noodleCup;
		System.out.println("거스름돈:"+(5000-total));
		System.out.println("갯수:"+num);
	}
}
