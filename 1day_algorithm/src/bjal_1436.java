import java.util.Scanner;

public class bjal_1436 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		
		int num = 666;
		int cnt = 1;
		
		while (cnt != N) {
			num++;
			if (String.valueOf(num).contains("666")) {
				cnt++;
			}
		}
		System.out.println(num);
	}
}
