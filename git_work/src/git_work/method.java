package git_work;

public class method {
	public static void power(int number) { // Parameter, �Ű�����
		int result = number * number;
		System.out.println(number + " �� 2 ���� " + result);
	}

	public static void powerByExp(int number, int exponent) {
		int result = 1;
		for (int i = 0; i < exponent; i++) {
			result *= number;
		}
		System.out.println(number + " �� " + exponent + " ���� " + result);
	}

	public static void main(String[] args) {
		power(2); // Argument, �μ� 
		power(3);
		
		powerByExp(2, 3);
	 	powerByExp(3, 3);
	}
}