package git_work;

public class string_compare {
	public static void main(String[] args) {
		String s1 = "Java";
		String s2 = "Python";
		System.out.println(s1.equals(s2)); // ���ڿ� ���� �� ������ true, �ٸ��� false
		System.out.println(s2.equalsIgnoreCase("python")); // ��ҹ��� ���� ���� ���ڿ� ������ ������ ���� üũ
		
		s1 = "1234";
		s2 = "1234";
		System.out.println(s1.equals(s2));
		System.out.println(s1 == s2);
		
		s1 = new String("1234");
		s2 = new String("1234");
		System.out.println(s1.equals(s2));
		System.out.println(s1 == s2); // false java ���� ���ڿ��� �� �ϰ� ������ �ظ��ϸ� equals �� ���°� ����
		
		System.out.println("�ڹٰ�\n�ʹ�\n��վ��"); // \n : �ٹٲ� Ư������, �̽������� ���� (Escape Sequence)
		System.out.println("��ġ��\t8000��"); // \t : tab ���̸�ŭ ������� ���
		System.out.println("C:\\Program Files\\Java"); // \ǥ���ϰ� ������ \\ �ι� ǥ��
		System.out.println("�ܺ� \"�Ŀ�\" �̶�� �߾��"); // Ư������ �տ��� \
		
		char c = 'A';
		c = '\'';
	}
}
