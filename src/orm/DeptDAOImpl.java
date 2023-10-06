package orm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DeptDAOImpl implements DeptDAO{
	
	public static final String INSERT_STMT = "insert into department values (?, ?, ?)";//建立部門資料
	public static final String FIND_BY_SEPTNO = "select * from department where deptno = ?";//反向查詢
	public static final String GET_ALL = "select * from department order by deptno desc";//降冪排序
	public static final String UPDATE_STMT = "update department set loc = ? where deptno = ?";//更新部門地點
	
	static {
		try {
			Class.forName(Util.DRIVER);
		}catch(ClassNotFoundException ce) {
			ce.printStackTrace();
		}
	}

	@Override
	public void insert(Dept dept) {//老師帶我們做三個 建立部門資料
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			con = DriverManager.getConnection(Util.URL, Util.USER, Util.PASSWORD);
			pstmt = con.prepareStatement(INSERT_STMT);
			
			pstmt.setInt(1, dept.getDeptno());
			pstmt.setString(2, dept.getDname());
			pstmt.setString(3, dept.getLoc());
			
			pstmt.executeUpdate();
			
			
		}catch(SQLException se) {
			se.printStackTrace();
		}finally {
			Util.closeResources(con, pstmt,null);
		}
		
	}

	@Override
	public void update(Dept dept) {
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
		con = DriverManager.getConnection(Util.URL, Util.USER, Util.PASSWORD);
		pstmt = con.prepareStatement(UPDATE_STMT);
		pstmt.setString(1, dept.getLoc());
		pstmt.setInt(2, dept.getDeptno());	
		
		pstmt.executeUpdate();
		
		}catch(SQLException se) {
			se.printStackTrace();
		}finally {
			Util.closeResources(con, pstmt,null);
		}
		
	}

	@Override
	public void delete(Integer deptno) {
		
		
	}

	@Override
	public Dept findByDeptno(Integer deptno) {//老師帶我們做三個，反向查詢
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Dept dept = null;
		
		try {
			con = DriverManager.getConnection(Util.URL, Util.USER, Util.PASSWORD);
			pstmt = con.prepareStatement(FIND_BY_SEPTNO);
			pstmt.setInt(1, deptno);//方法的參數 因為有問號才要做設定的動作
			rs = pstmt.executeQuery();
		
			while(rs.next()) {
				//利用Dept Bean,包裝著查詢的資料回傳給呼叫端
				dept = new Dept();
				dept.setDeptno(deptno);
				dept.setDname(rs.getString("dname"));
				dept.setLoc(rs.getString("loc"));;
			}
			
		}catch(SQLException se) {
			se.printStackTrace();
			
		}finally {
			Util.closeResources(con, pstmt, rs);
			
		}
		return dept;
	}

	
	@Override
	public List<Dept> getAll() {//老師帶我們做三個 例如:薪水大於100的員工 多筆資料 用集合來呈現 降冪排序
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<Dept> deptList = new ArrayList<>() ;
		
		try {
			con = DriverManager.getConnection(Util.URL, Util.USER, Util.PASSWORD);
			pstmt = con.prepareStatement(GET_ALL);//SQL指令
			rs = pstmt.executeQuery();
		
			while(rs.next()) {
				//利用Dept Bean,包裝著查詢的資料回傳給呼叫端
				Dept dept = new Dept();
				dept.setDeptno(rs.getInt("deptno"));
				dept.setDname(rs.getString("dname"));
				dept.setLoc(rs.getString("loc"));;
				//用集合收集著包裝好的部門物件
				deptList.add(dept);
			}
			
		}catch(SQLException se) {
			se.printStackTrace();
			
		}finally {
			Util.closeResources(con, pstmt, rs);
			
		}
		return deptList;
	}
	

}
