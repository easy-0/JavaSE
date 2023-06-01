package section10;

public class ExtendsClass02 {
	public static void main(String[] args) {
		Sandwich sandwich = new Sandwich();
		sandwich.breadName = "플랫";
		sandwich.brand = "서브웨이";
		sandwich.ham = "살라미";
		sandwich.vegetable = "오이빼고 전부";
		sandwich.sauce = "핫칠리";
		
		sandwich.getInfo();
	}
}
