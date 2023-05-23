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
//		for(int i=4; i>0; i--) {
//			for(int j=1; j<8; j++) {
//				if(8-i<j||j<i) System.out.print(" ");
//				else System.out.print("*");
//			}
//			System.out.println();
//		}
		
		/*4번*/
//		for(int i=0; i<7; i++) {
//			for(int j=0; j<7; j++) {
//				if(i<4) {
//					if(i+j<3||j-i>3) System.out.print(" ");
//					else System.out.print("*");
//				} else {
//					if(i-j>3||i+j>9) System.out.print(" ");
//					else System.out.print("*");
//				}
//				
//			}
//			System.out.println();
//		}
		
		
		/*
		 *    *   
		 	 ***  
		 	***** 
		   *******
		    ****** i=4, j=6
		     ***** i=5, j=5,6
		      **** i=6, j=4,5,6
		 * 
		 * 
		 * 
		 */
		
		/*구구단*/
		for(int x=0; x<3; x++) {
			for(int i=1; i<10; i++) {
				for(int j=2; j<5; j++) {
					//System.out.print(j + " * " + i + " = " + j*i + "\t");
					int dan = x*3+j;
					if(dan>9) break;
					System.out.printf("%d * %d = %d\t", dan, i, dan*i);
					
				}
				System.out.println();
			}
		}
		
		
		
		
		
	}
}
