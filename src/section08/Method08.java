package section08;

public class Method08 {
	public static void main(String[] args) {
		int[] values = {3, 5, 14, 26};
		int[] result = sumAndAvg(values);
		System.out.println("sum: " + result[0]);
		System.out.println("avg: " + result[1]);
	}
	
	// 8. 인자 o 리턴 o 배열리턴 
	public static int[] sumAndAvg(int[] values) {
		int[] result = new int[2];
		
		int sum = 0;
		for(int value : values) {
			sum += value;
		}
		
		int avg = sum / values.length;
		
		result[0] = sum;
		result[1] = avg;
		
		return result;
	}
}
