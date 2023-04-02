package git_work;

public class string_compare {
	public static void main(String[] args) {
		String s1 = "Java";
		String s2 = "Python";
		System.out.println(s1.equals(s2)); // 문자열 내용 비교 같으면 true, 다르면 false
		System.out.println(s2.equalsIgnoreCase("python")); // 대소문자 구분 없이 문자열 내용이 같은지 여부 체크
		
		s1 = "1234";
		s2 = "1234";
		System.out.println(s1.equals(s2));
		System.out.println(s1 == s2);
		
		s1 = new String("1234");
		s2 = new String("1234");
		System.out.println(s1.equals(s2));
		System.out.println(s1 == s2); // false java 에서 문자열을 비교 하고 싶으면 왠만하면 equals 를 쓰는게 좋다
		
		System.out.println("자바가\n너무\n재밌어요"); // \n : 줄바꿈 특수문자, 이스케이프 문자 (Escape Sequence)
		System.out.println("김치전\t8000원"); // \t : tab 길이만큼 띄워져서 출력
		System.out.println("C:\\Program Files\\Java"); // \표시하고 싶으면 \\ 두번 표기
		System.out.println("단비가 \"냐옹\" 이라고 했어요"); // 특수문자 앞에는 \
		
		char c = 'A';
		c = '\'';
	}
}
