import java.util.Scanner;

public class bjal_1085 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int x = in.nextInt();
		int y = in.nextInt();
		int w = in.nextInt();
		int h = in.nextInt();
		
		int xmin = Math.min(x, w - x);
		int ymin = Math.min(y, h - y);
		
		System.out.println(Math.min(xmin, ymin));
	}
}

//먼저 Scanner를 사용하여 입력을 받습니다. 입력은 직사각형의 왼쪽 아래 꼭짓점 좌표 (x, y)와 오른쪽 위 꼭짓점 좌표 (w, h)가 주어집니다.
//그 다음, Math.min() 함수를 사용하여 (x, w-x)와 (y, h-y) 거리 중 최소값을 각각 xmin, ymin 변수에 저장합니다. 이들 변수 중 더 작은 값을 출력합니다.
//따라서 이 코드는 주어진 직사각형과 점 사이의 거리 중 최소값을 계산하는 알고리즘을 구현하고 있습니다.