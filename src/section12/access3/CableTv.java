package section12.access3;

public class CableTv extends NormalTv{
	@Override
	public void channel() {
		System.out.println("공영 + 케이블 방송이 나와요!");
	}
	
	public void extChannel() {
		System.out.println("외부 입력으로 컴퓨터 연결이 돼요!");
	}
}
