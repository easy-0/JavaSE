package section12.access2;

public interface Cat {
	public final int PAW = 4; // interface에서 변수 선언하면 상수, final 명시적으로 사용
	
	public void eat(); // abstract 명시 안해도 추상메소드
	
	public void sleep();
	
	public void hunt();
	
}
