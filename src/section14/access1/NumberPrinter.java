package section14.access1;

public class NumberPrinter {

	public void printNumber() throws InterruptedException { // 구체적인 예외처리 짬때리기
		for(int i = 0; i < 10; i++) {
			System.out.println(i);
			
			Thread.sleep(1000); 
		}
	}
}
