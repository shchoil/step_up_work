package git_work;

public class overloading {
	public static int getPower(int number) {
		int result = number * number;
		return result;
	}
	
	public static int getPower(String strNumber) {
		int number = Integer.parseInt(strNumber);
		return number * number;
	}
	
	public static int getPower(int number, int exponent) {
		int result = 1;
		for (int i = 0; i < exponent; i++) {
			result *= number;
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println(getPower(3)); // 메소드의 전달값과 타입이 다를경우 메소드의 이름이 같아도 상관이 없다(메소드 오버로딩)
		System.out.println(getPower("4"));
		System.out.println(getPower(3, 3));
	}
}
