import java.util.*;

public class bjal_1018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();

        char[][] board = new char[n][m];

        for (int i = 0; i < n; i++) {
            String row = sc.nextLine();
            for (int j = 0; j < m; j++) {
                board[i][j] = row.charAt(j);
            }
        }

        int minCnt = Integer.MAX_VALUE;

        for (int i = 0; i <= n - 8; i++) {
            for (int j = 0; j <= m - 8; j++) {
                int cnt1 = 0;
                int cnt2 = 0;

                for (int x = i; x < i + 8; x++) {
                    for (int y = j; y < j + 8; y++) {
                        if ((x + y) % 2 == 0) {
                            if (board[x][y] == 'B') {
                                cnt1++;
                            } else {
                                cnt2++;
                            }
                        } else {
                            if (board[x][y] == 'W') {
                                cnt1++;
                            } else {
                                cnt2++;
                            }
                        }
                    }
                }

                minCnt = Math.min(minCnt, Math.min(cnt1, cnt2));
            }
        }

        System.out.println(minCnt);
    }
}