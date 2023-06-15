package section14;
/*
 * try ~ catch 에서 catch 블럭을 사용하여 다양한 예외 처리를 할 수 있다.
 * 
 */
public class ExceptionClass02 {
	public static void main(String[] args) {
		String str = null;
		
		int num1 = 10;
		int num2 = 0;
		int result = 0;
		
		try {
			System.out.println("str 첫번째 글자: " + str.charAt(0));
			
			result = num1 / num2;
			
			System.out.println("result: " + result);
		} catch (NullPointerException ne) {
			System.out.println("null 익셉션 발생하였습니다.");
		} catch (ArithmeticException ae) {
			System.out.println("0으로 나눌 수 없습니다.");
		} catch(Exception e) {
			System.out.println("예외가 발생하였습니다.");
			e.printStackTrace();
		}
		
	}
}
