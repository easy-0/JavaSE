package section12.access4;

public class Card {
	public static int width = 62;
	public static int height = 88;
	
	public String type = "Spade";
	public String number = "Ace";
	
	public void getInfo() {
		System.out.println("widht : " + width);
		System.out.println("height : " + height);
		System.out.println("type : " + type);
		System.out.println("number : " + number);
	}
}
