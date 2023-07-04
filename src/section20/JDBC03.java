package section20;
/*
 * pre
 * 
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBC03 {
	public static void main(String[] args) throws SQLException {
		Connection conn = null;
		// Statement 사용하지 않기!! PreparedStatement 사용하기!!
		PreparedStatement pstmt = null;	// 바인드변수. 하드파싱 방지
		ResultSet rs = null;
		
		try {
			// 1. 드라이버 클래스 정보 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
									
			// 2. 데이터베이스 연결
			String url = "jdbc:oracle:thin:@localhost:21521:xe";
			conn = DriverManager.getConnection(url, "hr", "hr");
			
			// 3. 쿼리 작성
			StringBuffer sql = new StringBuffer();
			sql.append("SELECT id, name, salary ");
			sql.append("FROM sales_reps ");
			sql.append("WHERE id = ? ");
			sql.append("WHERE salary >= ? ");
			
			// 4. PrepareStatement 객체 생성
			pstmt = conn.prepareStatement(sql.toString());
			
			pstmt.setInt(1, 1);	// 첫번재 ?에 1 
			pstmt.setString(2, "200"); // 두번째 ?에 "200"
			
			// 5. 쿼리 수행
			rs = pstmt.executeQuery();
			
			// 6. 실행결과 출력하기
			while(rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				double salary = rs.getDouble(3);
				
				System.out.println(id + "/" + name + "/" + salary);
			}
			
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			if(rs != null) rs.close();
			if(pstmt != null) pstmt.close();
			if(conn != null) conn.close();
		}
		
	}
	
}
