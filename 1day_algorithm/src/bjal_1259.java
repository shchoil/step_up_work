import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bjal_1259 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		while (true) {
			String s = br.readLine(); // 숫자 입력받습니다~
			int n = s.length(); // 입력받은 숫자 개수 확인~
			boolean b = true;
			if (s.equals("0")) break;
			for (int i = 0; i <= n / 2; i++) {
				if (s.charAt(i) != s.charAt(n - i - 1)) b = false; // 앞뒤가 다르죠~
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
