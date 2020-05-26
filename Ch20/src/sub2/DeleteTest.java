package sub2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DeleteTest {
	public static void main(String[] args) throws Exception {
		// DB정보
		String host = "jdbc:mysql://192.168.44.7:3306/sdh";
		String user = "sdh";
		String pass = "1234";
		
		// 1단계 - JDBC 드라이버 동적로드
		Class.forName("com.mysql.jdbc.Driver");
		
		// 2단계 - 데이터베이스 접속
		Connection conn = DriverManager.getConnection(host, user, pass);
		
		// 3단계 - SQL 실행객체 생성
		Statement stmt = conn.createStatement();
		
		// 4단계 - SQL 실행
		String sql = "DELETE FROM `USER1` WHERE ('J101','정철','010-1231-2121',52)";
		String sql1 = "DELETE FROM `USER1` WHERE ('J102','정철호','010-1231-2222',55)";
		
		stmt.executeUpdate(sql);
		stmt.executeUpdate(sql1);
		
		// 5단계 - 결과셋(ResultSet) 처리(SELECT일 경우)
		
		// 6단계 - 데이터베이스 종료(해제)
		conn.close();
		
		System.out.println("DELETE 완료...");
	}

}
