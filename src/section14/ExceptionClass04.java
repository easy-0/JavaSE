package section14;
/*
 * Exception 종류
 * 	1. Checked Exception
 * 	 반드시 try ~ catch 또는 throws 예약어로 예외 처리 해야한다.
 * 	 예외처리 하지 않을시 컴파일 에러 발생!
 * 	2. Unchecked Exception
 * 	 예외 처리를 하지 않아도 컴파일시 에러 발생하지 않는다.
 * 
 */
public class ExceptionClass04 {
	public static void main(String[] args) {
		
		for(int i = 0; i < 10; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000); // 1초 일시정지
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 
			
		}
	}
}
