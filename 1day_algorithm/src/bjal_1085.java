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

//���� Scanner�� ����Ͽ� �Է��� �޽��ϴ�. �Է��� ���簢���� ���� �Ʒ� ������ ��ǥ (x, y)�� ������ �� ������ ��ǥ (w, h)�� �־����ϴ�.
//�� ����, Math.min() �Լ��� ����Ͽ� (x, w-x)�� (y, h-y) �Ÿ� �� �ּҰ��� ���� xmin, ymin ������ �����մϴ�. �̵� ���� �� �� ���� ���� ����մϴ�.
//���� �� �ڵ�� �־��� ���簢���� �� ������ �Ÿ� �� �ּҰ��� ����ϴ� �˰����� �����ϰ� �ֽ��ϴ�.