package DAY04;

public class EX02 {
	// Method����� - function
	/*
	 1. � �Լ��� ������ �޼ҵ���� ���´�.(����)
	 2. input�� ������ ������ �����Ѵ�.
	 3. output�� �������� �������� �����Ѵ�.
	 4. ����
	 */
	// static�̸� �ٸ� method�� �θ� �� �ִ�(<->private)
	// �޸𸮿� ������ ���� �Ұ��� static���� ����!
	public static int sum(int a, int b) {
		return a+ b;
	}
	public static void printHelloWorld() {
		System.out.println("HellWorld!");
		return; // return���� method�� ����
	}
	
	public static void main(String[] args) {
	// �޼ҵ带 ����ϴ� ��
		int x = 30;
		int y = 50;
		int result = sum(x, y);  // ���� ���� (argument)
		System.out.println(result); // 80
		System.out.println(sum(x, y)); // method�� return�� �θ���
				
		printHelloWorld(); // method���
	}
}
