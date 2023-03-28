import java.util.Scanner;

public class bjal_10952 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (true) {
			int first = in.nextInt();
			int seccond = in.nextInt();

			if (first == 0 && seccond == 0) {
				in.close();
				break;
			}
			System.out.println(first + seccond);
		}
	}
}