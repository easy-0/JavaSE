package section07;
/*
 * OOP (Object Oriented Programming)
 *  - 객체 지향 프로그래밍
 *  - 프로그램을 작성할 때 데이터와 데이터를 조작하는 메소드를 하나의 논리적 단위인 객체로 묶는 방식
 *  
 * 객체(Object)
 *  - 물리적으로 존재하거나 추상적으로 생각할 수 있는 것
 *  - 정의 가능하고 식별 가능하다
 *  - 속성(변수)과 기능(메소드)으로 구성되어 있다.
 * 
 *  예) 물리적인 객체 - 실존하는 모든것
 *     추상적인 객체 - 주문, 생산정보, 회계장부 등 
 *     
 * 객체 구성요소
 *  1) 속성
 *  2) 기능
 *  
 *  예) 티모 객체
 *  	속성 1) 체력 - 500
 *          2) 공격력 - 10
 *          3) 방어력 - 5
 *      기능 1) 실명 
 *      	2) 신속
 * 
 *   Class
 *    - 객체를 만들기 위한 설계도
 *    - new 연산자를 통해 class에 작성된 코드를 읽어 인스턴스(객체)화 한다. => 메모리에 저장 또는 로드
 *    
 *   클래스 구조
 *   
 *   (접근제한자) class 클래스명 (extends 상속클래스) (implements 인터페이스 상속) { // 클래스 선언부
 *   	(생성자) => 초기화
 *   	변수(멤버변수, 멤버필드) -> 속성
 *   	메소드(멤버메소드) => 기능
 *   }
 *	
 *	 객체화 - new 연산자로 인스턴스화 가능!
 *	 클래스명(타입) 변수명 = new 클래스();
 *
 * 	 가비지 컬렉터(Garbage Collector)
 * 		자바에서 동적 할당된 메모리(Heap 영역) 중에서 더 이상 사용되지 않는
 * 		객체를 찾아 제거하는 프로세스
 * 	
 *	 JVM Runtime Data Area 에서 Method Area, Heap Area, Stack Area 영역별 역할 공부하기.
 * 
 */
public class OOP01 {
	public static void main(String[] args) {
		Car c1 = new Car(); // 클래스를 이용해서 객체 생성
		Car c2 = new Car();
		
		System.out.println("c1 바퀴 개수: " + c1.wheel);
		System.out.println("c2 바퀴 개수: " + c2.wheel);
		
		c1.wheel = 3;
		System.out.println("c1 바퀴 개수: " + c1.wheel);
		System.out.println("c2 바퀴 개수: " + c2.wheel);
	}
}
