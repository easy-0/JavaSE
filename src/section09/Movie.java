package section09;

public class Movie {
	public String title;
	public int price;
	public String director;
	
	static {
		System.out.println("Movie() static 초기화 블록");
	}
	
	// 초기화 블록
	{
		this.title = "매트릭스";
		this.price = 14000;
		this.director = "워쇼스키 자매";
		System.out.println("Movie() 초기화 블록");
	}

	public Movie() {
		this.title = "기생충";
		this.price = 14000;
		this.director = "봉준호";
		System.out.println("Movie() 생성자");
	}
	
	@Override
	public String toString() { //최상위클래스 object
		return title + " / " + price + " / " + director;
	}
	
}
