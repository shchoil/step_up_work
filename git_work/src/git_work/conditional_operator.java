package git_work;

import java.util.Scanner;

public class conditional_operator {
	public static void main(String[] args) {
		method1();
		method2();
	}
	
	public static void method1() {
//		삼항 연산자
//		결과 = (조건) ? (참의 경우 결과값) : (거짓의 경우 결과값)
		int x = 5; 
		int y = 3;
		int max = (x > y) ? x : y; // x 가 y 보다 크면은 x 아니라면 y

		System.out.println(max);

		int min = (x < y) ? x : y;

		System.out.println(min);
		
		boolean b = (x == y) ? true : false;
		
		System.out.println(b);
		
		String s = (x != y) ? "달라요" : "같아요";
		
		System.out.println(s);
	}

	public static void method2() {
		Scanner height = new Scanner(System.in);
		
		int n = height.nextInt();

		String r = (n <= 120) ? "키가 120 이하 이므로 탑승 불가능합니다." : "키가 121 이상 이므로 탑승 가능합니다.";
		
		System.out.println(r);
	}
}