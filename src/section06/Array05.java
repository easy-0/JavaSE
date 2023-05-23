package section06;

public class Array05 {
	public static void main(String[] args) {
		// new 연산자를 사용하지 않고 2중 배열 선언 및 대입 생성
		int[][] nums = {
				{1, 2, 3},
				{4, 5, 6},
				{7, 8, 9},
				{10, 11, 12}
				};
		
		for(int i = 0; i < nums.length; i++) {
			// i = 0 -> nums[0] = {1, 2, 3} -> nums[0].length = 3
			for(int j = 0; j < nums[i].length; j++) {
				System.out.print(nums[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
