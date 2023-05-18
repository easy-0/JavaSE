package section03;
/*
 * 연산자(Operator)
 *  프로그램에서 데이터를 처리하여 산출하는것을 연산이라하고,
 *  연산에 사용되는 표시나 기호를 연산자(operator)라고 한다.
 * 
 * 1. 산술연산자
 *  +, -, *, /, %
 *  
 *  	숫자 + 숫자 > 숫자
 *  	문자 + 문자 or 숫자 > 문자 연결
 *  	!문자에서 +는 연결연산자 이다.!
 *  
 */
public class Operator01 {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 5;
		
		// 두 수의 합을 구해서 sum이라는 int형 변수에 대입
		int sum = num1 + num2;
		System.out.println("두 수의 합: " + sum);
		
		// 두 수의 곱을 구해서 mul이라는 변수에 대입
		int mul = num1 * num2;
		System.out.println("두 수의 곱: " + mul);
		
		// 나누기
		int div = 10/3;
		System.out.println("10 / 3 = " + div);
		
		int div2 = num1/num2;
		System.out.println("num1 / num2 = " + div2);

		// 나머지 값
		int resultNum = 9 % 5;
		System.out.println("9 / 5 의 나머지 : " + resultNum);
		
	}
}
