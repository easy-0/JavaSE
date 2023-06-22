package section15;

import java.util.Random;

public class JavaUtilClass02 {
	public static void main(String[] args) {
		// 크기가 45인 배열생성
		int[] lNum = new int[45];	
		// 1~45를 lNum에 저장
		for(int i = 0; i <lNum.length; i++) {	
			lNum[i] = i + 1;
		}
		
		Random ran = new Random();
		for(int i = 0; i < lNum.length; i++) { // 셔플
			// 0~44 숫자중 임의 값 반환
			int changeIndex = ran.nextInt(45);	
			
			int tmp = lNum[i];
			lNum[i] = lNum[changeIndex];
			lNum[changeIndex] = tmp;
		}
		
		for(int i = 0; i < 6; i++) {
			System.out.print(lNum[i] + " / ");
		}
	}
}
