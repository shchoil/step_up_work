package git_work;

public class conditional_operator {
	public static void main(String[] args) {
//		���� ������
//		��� = (����) ? (���� ��� �����) : (������ ��� �����)
		int x = 5; 
		int y = 3;
		int max = (x > y) ? x : y; // x �� y ���� ũ���� x �ƴ϶�� y

		System.out.println(max);

		int min = (x < y) ? x : y;

		System.out.println(min);
		
		boolean b = (x == y) ? true : false;
		
		System.out.println(b);
		
		String s = (x != y) ? "�޶��" : "���ƿ�";
		
		System.out.println(s);
	}
}