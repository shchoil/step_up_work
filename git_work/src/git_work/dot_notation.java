package git_work;

public class dot_notation {
	public static void main(String[] args) {
		String s = "I like Java and Python and C.";
		System.out.println(s);
		
		System.out.println(s.length()); // 문자열의 길이
		System.out.println(s.toUpperCase()); // 대문자
		System.out.println(s.toLowerCase()); // 소문자
		System.out.println(s.contains("Java")); // 포함된다면 true, 포함되지 않는다면 false
		System.out.println(s.contains("C#"));
		System.out.println(s.indexOf("Java")); // 문자열 내의 포함된 문자의 위치 정보
		System.out.println(s.startsWith("I like")); // 이 문자열로 시작하면 true
		
		System.out.println(s.replace(" and", ",")); // " and" 를 "," 로 변환
		System.out.println(s.substring(7)); // 인덱스 기준 7 부터 시작 (이전 내용은 삭제)
		System.out.println(s.substring(s.indexOf("Java")));
		System.out.println(s.substring(s.indexOf("Java"), s.indexOf("."))); // 끝은 지정한 위치의 직전 까지만 출력이 된다
		
		s = "              I love Java.      ";
		System.out.println(s.trim()); // 앞 뒤 공백 제거
		
		String s1 = "Java";
		String s2 = "Python";
		System.out.println(s1 + s2);
		System.out.println(s1 + ", " + s2);
		System.out.println(s1.concat(", ").concat(s2)); // 문자열 결합
	}
}
