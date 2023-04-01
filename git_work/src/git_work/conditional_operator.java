package git_work;

public class conditional_operator {
	public static void main(String[] args) {
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
}