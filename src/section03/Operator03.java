package section03;

import java.util.Scanner;

/*
 * 3. 비교연산자
 *  연산 결과를 비교하여 boolean으로 반환한다.
 * 
 *  >	: 크다
 *  >=	: 크거나 같다
 *  <	: 작다
 *  <=	: 작거나 같다
 *  ==	: 같다
 *  |=	: 다르다
 * 
 * 
 * ctrl + shift + l : 모든 단축키
 * ctrl + shift + o : 모두 임포트
 */
public class Operator03 {
	public static void main(String[] args) {
		boolean result = 10 < 20 ; 
		System.out.println(result);
		
		if(result) {
			System.out.println("10은 20보다 작다.");
		} else {
			System.out.println("10은 20보다 크거나 같다.");
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.println("나이를 입력하세요.");
		int age = sc.nextInt();
		if(age>=19) { // 괄호 안 boolean형
			System.out.println("성인 입니다.");
		} else {
			System.out.println("미성년자 입니다.");
		}
		
	}
}
