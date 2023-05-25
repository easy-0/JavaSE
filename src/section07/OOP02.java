package section07;

public class OOP02 {
	public static void main(String[] args) {
		PokerCard card1 = new PokerCard();
		PokerCard card2 = new PokerCard();
		
		System.out.println("card1 type: " + card1.type);
		System.out.println("card1 number: " + card1.number);
		System.out.println("card1 width: " + card1.width);
		System.out.println("card1 height: " + card1.height);

		System.out.println("card2 type: " + card2.type);
		System.out.println("card2 number: " + card2.number);
		System.out.println("card2 width: " + card2.width);
		System.out.println("card2 height: " + card2.height);
		
		System.out.println("==================================");
		
		card1.number = "J";
		System.out.println("card1 number: " + card1.number); // J
		System.out.println("card2 number: " + card2.number); // A
		
		PokerCard.width = 70; // static은 다른 메모리영역을 사용. static 영역의 값을 참조
		System.out.println("card1 width: " + PokerCard.width); // 70
		System.out.println("card2 width: " + PokerCard.width); // 70
	}
}
