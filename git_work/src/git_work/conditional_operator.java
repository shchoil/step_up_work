package git_work;

import java.util.Scanner;

public class conditional_operator {
	public static void main(String[] args) {
		method1();
		method2();
	}
	
	public static void method1() {
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

	public static void method2() {
		Scanner height = new Scanner(System.in);
		
		int n = height.nextInt();

		String r = (n <= 120) ? "Ű�� 120 ���� �̹Ƿ� ž�� �Ұ����մϴ�." : "Ű�� 121 �̻� �̹Ƿ� ž�� �����մϴ�.";
		
		System.out.println(r);
	}
}