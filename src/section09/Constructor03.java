package section09;

public class Constructor03 {
	public static void main(String[] args) {
		Food food1 = new Food(3);
		food1.getInfo();
		
		System.out.println("======================");
		
		Food food2 = new Food("수블라키", 20000, 6, 2);
		food2.getInfo();
	}
}
