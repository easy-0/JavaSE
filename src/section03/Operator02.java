package section03;
/*
 * 2. 증감연산자
 *  ++ : 1씩 증가한다.
 *  -- : 1씩 감소한다.
 *  
 * 
 */
public class Operator02 {
	public static void main(String[] args) {
		int num = 0;
		num = num + 1;
		System.out.println(num);   // num = 1
		num++;
		System.out.println(num);   // num = 2
		// 전위 증감연산자
		System.out.println(++num); // num = 3
		// 후위 증감연산자
		System.out.println(num++); // 선출력 후연산 num = 3
		System.out.println(num);   // num = 4
				
	}
}
