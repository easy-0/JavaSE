package section15;

import java.util.Calendar;

/*
 * Calendar 클래스
 * 	날짜 관련 객체
 * 	날짜 계산용으로 자주 사용
 * 	Date 객체와 호환 가능
 * 
 */
public class JavaUtilClass04 {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance(); // new로 생성 못함 protected

		int year = cal.get(Calendar.YEAR);
		System.out.print("지금은 " + year + "년 ");
		
		int month = cal.get(Calendar.MONTH) + 1;
		System.out.print(month + "월 ");
		
		int day = cal.get(Calendar.DAY_OF_MONTH);
		System.out.print(day + "일 ");
		
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		int min = cal.get(Calendar.MINUTE);
		int sec = cal.get(Calendar.SECOND);
		System.out.print(hour + "시 " + min + "분 " + sec + "초");

	}
}
