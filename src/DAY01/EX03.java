package DAY01;

public class EX03 {
	public static void main(String[] args) {
		// �ڷ��� ��ȯ - casting
		double pi = 3.14;
		int intPi = (int)pi;
		//System.out.println(intPi, (double)intPi);
		// - println()�� �ڷ����� ���ƾ� ��½�Ŵ
		System.out.println(intPi); // 3
		System.out.println((double)intPi); // 3.0
		
		int num = 7;
		double result = num/3;
		System.out.println(result);// int��/int�� = int���̶� 2.0
		
		// double�� ����� ��������? 
		//1. �� �� �ϳ��� ����ȯ
		result = num / (double)3; 
		System.out.println(result); // 2.33333333333
		//2. double��/double��
		
		// �ݿø� �ϴ� �� - Math.round(�Ǽ�)
		pi = 3.1454353;
		System.out.println(Math.round(pi)); // double�� or float���� �־ �ݿø�
		// if �Ҽ��� n��° �ڸ����� �ݿø��ϰ� �ʹٸ�?
		System.out.println(Math.round(pi*100)/100.0); // �Ҽ��� 2��°(10^2) �ڸ� �ݿø�
		
	}
}
