package section07;

public class OOP03 {
	// 참조형/전역변수/동적(heap)
	Car car3 = new Car();
	public static void main(String[] args) {
		// 참조형/지역변수/동적
		Car car1 = new Car();
		Car car2 = new Car();
		
		
		
		car1.drive();
		car2.parking();
		
		System.out.println(System.identityHashCode(car1)); // car1 객체의 주소값 (c의 포인터)
		System.out.println(System.identityHashCode(car2));
		
		// 기본형/지역변수
		int num = 10;
	}
}
