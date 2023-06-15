package section13;

import section13.access2.Bird;

public class InnerClass05 {
	public static void main(String[] args) {
		
		String name = new Bird() {
			
			private String name = "비둘기";
			
			@Override
			public void sing() {
				System.out.println("구구");
			}
			
			@Override
			public void fly() {
				System.out.println("푸드덕푸드덕");
			}
			public String getName() {
				return name;
			}
		}.getName();
		
		System.out.println("name: " + name);
	}
}
