package section04;
/*
 * 2. switch ~ case 문
 * 
 * 
 * 
 * 
 */
public class Conditional03 {
	public static void main(String[] args) {
		int num = 1;
		
		switch(num) {
		case 0 :
			System.out.println("num = 0");
			break;
		case 1 :
			System.out.println("num = 1");
			break;
		case 2 :
			System.out.println("num = 2");
			break;
		case 3 :
			System.out.println("num = 3");
			break;
		default:
			System.out.println("num은 0 ~ 3 이 아닙니다.");
			break;
		}
		
		switch(num) {
		case 0 :
			System.out.println("num = 0");
		case 1 :
			System.out.println("num = 1");
		case 2 :
			System.out.println("num = 2");
		case 3 :
			System.out.println("num = 3");
		default:
			System.out.println("num은 0 ~ 3 이 아닙니다.");
		}
	}
}
