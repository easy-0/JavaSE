package section09;

public class Constructor02 {
	public static void main(String[] args) {
		Food food1 = new Food();
		food1.getInfo();
		
		System.out.println("===================");
		
		Food food2 = new Food("사케동",20000,3);
		food2.getInfo();
	}
}
