package section17;

import java.util.ArrayList;
import java.util.List;

public class Lambda03 {
	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>();
		
		numbers.add(4);
		numbers.add(6);
		numbers.add(7);
		numbers.add(55);
		numbers.add(22);
		numbers.add(88);
		
//		int result = normalSum(numbers);
//		System.out.println("합계: " + result);
		
		System.out.println(fpSum(numbers));
	}
	
	private static int normalSum(List<Integer> numbers) {
		int sum = 0;
		for(int number : numbers) {
			sum += number;
		}
		
		return sum;
	}
	
	// stream reduce 람다식 - 스트림요소들을 결합하여 단일결과를 생성
	private static int fpSum(List<Integer> numbers) {
		return numbers.stream()
				.reduce(0, (sum, number) -> sum + number);
	}
}
