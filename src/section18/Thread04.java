package section18;

/*
 * synchronized 키워드
 * 	멀티 Thread에서 동기화 시켜주는 예약어
 * 	vector.add, StringBuffer.append 에서도 사용됨
 * 
 */


import section18.access2.Brother;
import section18.access2.Sister;
import section18.access2.Wallet;

public class Thread04 {
	public static void main(String[] args) {
		System.out.println("메인스레드 시작!");
		
		Wallet wallet = new Wallet();
		
		Sister sister = new Sister(wallet);
		
		Brother brother = new Brother(wallet);
		
		sister.start();
		brother.start();
		
		System.out.println("메인스레드 종료!");
	}

}
