package section13.access1;

public class MyUtill {
	public String str1 = "일반멤버 변수";
	public static String str2 = "static멤버 변수";
	
	public class HelloPrinter{	//일반 클래스 일반 메소드
		public void printHello() {
			System.out.println("내부클래스 HelloPrinter 입니다.");
			System.out.println(str1);
			System.out.println(str2);
		}
	}
	
	public static class Calculater {
		public void calc(int a, int b) {
			System.out.println("전달받은 두 정수의 합: " + (a + b));
//			System.out.println(str1);
			System.out.println(str2);
		}
	}
	
}
