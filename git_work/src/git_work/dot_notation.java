package git_work;

public class dot_notation {
	public static void main(String[] args) {
		String s = "I like Java and Python and C.";
		System.out.println(s);
		
		System.out.println(s.length()); // ���ڿ��� ����
		System.out.println(s.toUpperCase()); // �빮��
		System.out.println(s.toLowerCase()); // �ҹ���
		System.out.println(s.contains("Java")); // ���Եȴٸ� true, ���Ե��� �ʴ´ٸ� false
		System.out.println(s.contains("C#"));
		System.out.println(s.indexOf("Java")); // ���ڿ� ���� ���Ե� ������ ��ġ ����
		System.out.println(s.startsWith("I like")); // �� ���ڿ��� �����ϸ� true
		
		System.out.println(s.replace(" and", ",")); // " and" �� "," �� ��ȯ
		System.out.println(s.substring(7)); // �ε��� ���� 7 ���� ���� (���� ������ ����)
		System.out.println(s.substring(s.indexOf("Java")));
		System.out.println(s.substring(s.indexOf("Java"), s.indexOf("."))); // ���� ������ ��ġ�� ���� ������ ����� �ȴ�
		
		s = "              I love Java.      ";
		System.out.println(s.trim()); // �� �� ���� ����
		
		String s1 = "Java";
		String s2 = "Python";
		System.out.println(s1 + s2);
		System.out.println(s1 + ", " + s2);
		System.out.println(s1.concat(", ").concat(s2)); // ���ڿ� ����
	}
}
