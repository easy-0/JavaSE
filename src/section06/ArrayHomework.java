package section06;

public class ArrayHomework {
	public static void main(String[] args) {
		int[][] array = new int[7][7];
		for(int i=0; i < array.length; i++) {
			for(int j=0; j < array[i].length; j++) {
				int num1 = i*7;
				int num2 = j+1;
				array[i][j] = num1+num2;
			}
		}

		for(int i=0; i < array.length; i++) {
			for(int j=0; j < array[i].length; j++) {
				System.out.print(array[i][j]+"\t");
				}
			System.out.println();
			}
		//[0][0]
		//[0][1] [1][0]
		//[0][2] [1][1] [2][0]
		//[0][3] [1][2] [2][1] [3][0]
		//...
		//[0][6] [1][5] [2][4] [3][3] [4][2] [5][1] [6][0]
		//[6][1] [5][2] [4][3] [3][4] [2][5] [1][6]
		//...
		//[6][4] [5][5] [4][6]
		//[6][5] [5][6]
		//[6][6]
//		for(int i=0; i<12; i++) {
//		for(int j=0; j<i+1; j++) {
//			System.out.printf("[%d][%d] ",j,i-j);
//		}
//		System.out.println();
//	}
//	

		System.out.println("========================");
	

		
		for(int i=0; i<13; i++) {
			for(int j=0; j < i+1; j++) {
				if(i<7) {
					if(i%2!=0)
						System.out.print(array[j][i-j] + " ");
					else
						System.out.print(array[i-j][j] + " ");
				} else {
					if(i+j>12)
						break;
					else if(i%2!=0)
						System.out.print(array[i-6+j][i-j-(i-6)] + " ");
					else
						System.out.print(array[i-j-(i-6)][i-6+j] + " ");
				}
			}
			System.out.println();
		}
		
//		for(int i=0; i<13; i++) {
//			System.out.println("depth: "+ i);
//			for(int j=0; j< i+1; j++) {
//				if(i<7) {
//					if(i%2!=0)
//						System.out.printf("[%d][%d] ",j,i-j);
//					else
//						System.out.printf("[%d][%d] ",i-j,j);
//				} else {
//					if(i+j>12)
//						break;
//					else if(i%2!=0)
//						System.out.printf("[%d][%d] ",i-6+j,i-j-(i-6));
//					else
//						System.out.printf("[%d][%d] ",i-j-(i-6),i-6+j);
//				}
//			}
//			System.out.println();
//		}

	}
}
