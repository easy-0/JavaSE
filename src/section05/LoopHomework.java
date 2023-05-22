package section05;

public class LoopHomework {
	public static void main(String[] args) {
		
//		for(int i=0; i<5; i++) {		
//			for(int j=0; j<i+1; j++) {	
//				System.out.print('*');	
//			}
//			System.out.print('\n');		
//		}
		
		
		/*2번*/
//		for(int i=4; i>=0; i--) {
//			for(int j=0; j<5; j++) {
//				if(i>j) System.out.print(" ");
//				else System.out.print("*");
//			}
//			System.out.println();
//		}
		
		/*3번*/
		
		for(int i=4; i>0; i--) {
			for(int j=1; j<8; j++) {
				if(8-i<j||j<i) System.out.print(" ");
				else System.out.print("*");
			}
			System.out.println();
		}
		
		
	}
}
