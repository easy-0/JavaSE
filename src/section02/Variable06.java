package section02;
/*
 * 5. String 형 (문자열)
 *  문자열을 저장할 수 있다.
 *  참조형 변수
 * 
 * 	선언방법
 * 	 String 변수명;
 *  
 *  기본형 - boolean, char, byte, short, int, long, float, double
 *  		8가지
 *  		실제 값을 저장
 *  
 *  참조형 - 기본형을 제외한 모든 객체(클래스 코드로 되어있다.)
 *  		주소 값을 저장
 *  		속성(변수), 기능(메소드)
 */
public class Variable06 {
	public static void main(String[] args) {
		// 변수 초기화
		String str = "반갑고";
		System.out.println("str: " + str);
		
		String hello = "hello";
		System.out.println("0번 인덱스: " + hello.charAt(0));
		System.out.println("1번 인덱스부터 4번 인덱스까지: " + hello.substring(1, 4));
		
		String addr = "서울특별시 강남구 압구정";
		boolean isContain = addr.contains("특별시");
		
		if(isContain) {
			System.out.println("특별시민 입니다!");
		} else {
			System.out.println("특별시민이 아닙니다!");
		}
		
	}
}
