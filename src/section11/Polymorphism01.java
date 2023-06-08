package section11;

import section11.access1.Bus;
import section11.access1.Car;

/*
 * *****다형성(Polymorphism)*****
 * 	같은 인터페이스 또는 부모를 공유하는 객체가 여러 유형의 타입을 가질 수 있는것
 * 
 * 
 */
public class Polymorphism01 {
	public static void main(String[] args) {
		Bus bus = new Bus();
		bus.drive();
		bus.bell();
		
		
		Car car = new Bus();
		car.drive(); //오버로딩된 객체로 호출
//		car.bell(); //자식객체 메소드 호출 불가능
		
		Bus bus2 = (Bus) car;
		bus2.drive();
		bus2.bell();
	}
}
