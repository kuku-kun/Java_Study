package DAY05;

public class EX03_1 {
	public static void main(String[] args) {
	// ���ڿ�
		// 1.String������ �� ����
		String a = "�ȳ��ϼ���";
		String b = new String("�ȳ��ϼ���"); // ��ü�� ����
		String c = new String("�ȳ��ϼ���");
		String d = "�ȳ��ϼ���"; // heap ������ constant pool�� ����ǰ� ��Ȱ���� �ȴ�.(new�� ���� X)
		System.out.println(a);
		System.out.println(b);
		
		// 2.String���� �� ���ϱ�
		// == ���� �񱳸� �ϴ� ���� stack������ ����� �ּҰ��� ���� ���̴�.
		// String���� ���� ���Ϸ��� .equals() ����ؾ� �Ѵ�.
		System.out.println(a == d); // true
		System.out.println(b == c); // false : ���� ���� ���� �ƴ϶� ��ü�� �ּҰ� �������� ���� ��
		System.out.println(a == b); // false
		System.out.println(a.equals(b)); 
		// equal() ���� => a == b�̸� true
		// 				   a =/= b�̸� false
		
		// 3.�ڷ��� ��ȯ
		// int -> String
		int num1 = 3;
		String str1 = String.valueOf(num1); 
		System.out.println(num1); // "3"
		
		// String -> int
		String str2 = "5";
		int num2 = Integer.parseInt(str2);
		num2 = Integer.valueOf(str2);
		System.out.println(num2); // 5
		
	}
}
