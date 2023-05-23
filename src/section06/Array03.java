package section06;

public class Array03 {
	public static void main(String[] args) {
		// new 연산자를 사용하지 않고 직접 배열값 e대입 생성
		String[] names = {"루피", "조로", "초파", "브룩", "나미", "우솝"};
		
		// 배열 내용 출력해보기
		for (int i = 0; i < names.length; i++)
			System.out.println(names[i]);
		
		System.out.println("================================");
		
		// 배열 값 수정하기
		names[5] ="프랑키";
		
		// 확장 for문 ..변수가 배열성 객체일때만 가능
		for(String name : names) {
			System.out.println(name);
		}
		
	}
}
