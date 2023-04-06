import java.util.Scanner;

public class bjal_1978 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int cnt = 0;
		
		for (int i = 0; i < N; i++) {
			boolean tr = true;
			int num = in.nextInt();
			
			if (num == 1) {
				continue;
			}
			for (int j = 2; j < Math.sqrt(num); j++) {
				if (num % j == 0) {
					tr = false;
					break;
				}
			}
			if (tr) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}
