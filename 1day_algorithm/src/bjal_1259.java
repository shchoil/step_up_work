import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bjal_1259 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		while (true) {
			String s = br.readLine(); // ���� �Է¹޽��ϴ�~
			int n = s.length(); // �Է¹��� ���� ���� Ȯ��~
			boolean b = true;
			if (s.equals("0")) break;
			for (int i = 0; i <= n / 2; i++) {
				if (s.charAt(i) != s.charAt(n - i - 1)) b = false; // �յڰ� �ٸ���~
			}
			if (b) {
				sb.append("yes\n");
			} else {
				sb.append("no\n");
			}
		}
		System.out.println(sb);
	}
}
