package section12.access2;

public class HouseCat implements Cat, Playable{
	public String name;

	public HouseCat(String name) {
		this.name = name;
	}
	
	@Override
	public void eat() {
		System.out.println(name + " 이(가) 경계하며 먹어요.");
	}

	@Override
	public void sleep() {
		System.out.println(name + " 이(가) 밤에 잠을 안자요!");
	}

	@Override
	public void hunt() {
		System.out.println(name + " 이(가) 쥐를 사냥해요!!");
	}

	@Override
	public void play() {
		System.out.println(name + " 이(가) 방울을 가지고 놀아요!");
	}
		
}

