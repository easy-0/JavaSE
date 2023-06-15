package section13;

import section13.access2.Animal;
import section13.access2.Bird;

public class InnerClass06 {
	public static void main(String[] args) {
		Animal animal = new Animal(new Bird() {
			
			@Override
			public void sing() {
				System.out.println("꼬끼오");
			}
			
			@Override
			public void fly() {
				System.out.println("퍼덕퍼덕");
			}
		});
		animal.b.sing();

	}
}
