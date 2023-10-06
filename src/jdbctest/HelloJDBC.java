package jdbctest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


public class HelloJDBC {
	public static final String DRIVER = "com.mysql.cj.jdbc.Driver";
	public static final String URL = "jdbc:mysql://localhost:3306/jdbcsample?serverTimezone=Asia/Taipei";
	public static final String USER = "root";
	public static final String PASSWORD = "qaz810615";
	
	public static void main(String[] args) {//關閉的資源先宣告在外面
		Connection con = null;
		Statement stmt = null;//建立一個物件
		ResultSet rs = null;//查詢指令宣告
		PreparedStatement ptmt = null;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("要新增的部門編號");
		int deptno = sc.nextInt();
		System.out.println("要新增的部門名稱");
		String dname = sc.next();
		System.out.println("要新增的部門所在地");
		String loc = sc.next();
		
		sc.close();
		
		try {
			//step1:載入驅動
			Class.forName(DRIVER);//每個軟體載入的不一樣看P14
			System.out.println("載入成功");
			
			//step2:建立連線
			con = DriverManager.getConnection(URL, USER, PASSWORD);
			System.out.println("連線成功");
			
			//step3:下SQL指令
			
			ptmt = con.prepareStatement("insert into department values (?, ?, ?)");//只能針對SQL指令的值做?
			
			ptmt.setInt(1, deptno);
			ptmt.setString(2, dname);
			ptmt.setString(3, loc);
			
			ptmt.executeUpdate();//更新資料庫 傳回成功更新的筆數
			
			
//			stmt = con.createStatement();
//			int count = stmt.executeUpdate("insert into department values (50, '人事部', '中壢')");
//			System.out.println(count + "row(s) update.");
//			
//
//			stmt = con.createStatement();
//			rs = stmt.executeQuery("select * from department order by deptno");//Query才會回傳一個查詢結果
//			while(rs.next()) {//游標有指向資料就是true 就會進入迴圈 沒有就會跳出去
//				int deptno = rs.getInt("deptno");//rs.getInt(1) JDBC索引值從1開始 用欄位索引值
//				String dname = rs.getString("dname");
//				String loc = rs.getString("loc");
//				
//				System.out.println("DEPTNO = " + deptno);
//				System.out.println("DNAME = " + dname);
//				System.out.println("LOC = " + loc);
//				System.out.println("====================");
//			}
//			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException se) {
			se.printStackTrace();
		} 
		finally {//要加上例外處理 要確認關閉 釋放資料
			
			if(ptmt != null) {
				try {
					ptmt.close();
				} catch (SQLException se) {
					se.printStackTrace();
				}
			}
				
//			if(rs != null) {
//				try {
//					rs.close();
//				} catch (SQLException se) {
//					se.printStackTrace();
//				}
//			}
//			
//			if(stmt != null) {
//				try {
//					stmt.close();
//				} catch (SQLException se) {
//					se.printStackTrace();
//				}
//			}
//			
//			if(con != null) {
//				try {
//					con.close();
//				} catch (SQLException se) {
//					se.printStackTrace();
//				}
			}
		}
	}


