package DAY05;

public class EX03_2 {
	public static void main(String[] args) {
		//���ڿ� ���� �޼ҵ� ����
		String s1 = "eclipse";
		
		// charAt: n��° index�� ���� ���ڰ� �ִ��� Ȯ��
		System.out.println("charAt:" + s1.charAt(4));
		
		// contains: Ư�� ���ڿ��� ���ڿ��� ���ԵǾ� �ִ��� Ȯ��
		System.out.println("contains:" + s1.contains("lip"));
		
		// startsWith: Ư�� ���ڿ��� �����ϴ��� Ȯ��
		System.out.println("startsWith:" + s1.startsWith("ecl"));
		
		// endsWith: Ư�� ���ڿ��� �������� Ȯ��
		System.out.println("endsWith:" + s1.endsWith("aaa"));
		
		// length: ���ڿ��� ���̸� Ȯ��. ���ĺ��� �� ������
		System.out.println("length:" + s1.length());
		
		// replace: ���Ե� ���ڿ� �κ��� ��ü
		String s2 = "���� ���� �԰���� ���� ġŲ�̴�.";
		s2 = s2.replace("ġŲ", "������");  // �� �ٽ� �����ؾ��Ѵ�.
		System.out.println("replace:" + s2);
		
		// split: Ư�� ��Ʈ���� �������� �߶� �迭�� �ִ´�.
		String s3 = "apple,melon,grape";
		String[] fruits = s3.split(",");
		System.out.println("split:" + fruits[0] + " " + fruits[1] + " " + fruits[2]);
		
		// substring: ���ڿ��� �ڸ���.
		String s4 = "javastudy";
		System.out.println("substring:" + s4.substring(4));  // study
		
		// begin index: ���� �ε���
		// end index: �ڸ��� ���� �� �ε��� + 1
		System.out.println("substring param 2:" + s4.substring(0, 4)); // java
		System.out.println("substring param 2:" + s4.substring(4, 9)); // study
	}
}
