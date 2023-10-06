package orm;

import java.util.List;
import java.util.Scanner;

public class DeptTest {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		System.out.println("要新增(查詢)的部門編號");
//		int deptno = sc.nextInt();
//		System.out.println("要新增的部門名稱");
//		String dname = sc.next();
//		System.out.println("要新增的部門所在地");
//		String loc = sc.next();
		
//		sc.close();
		
		
//		//要對部門表格操作，透過dao物件進行
//		DeptDAO dao = new DeptDAOImpl();
//		//利用Dept Bean,包裝著要新增的資料夾交給方法處理
//		Dept dept = new Dept(deptno, dname, loc);
//		dao.insert(dept);
////		
		
//		要對部門表格操作，透過dao物件進行
//		DeptDAO dao = new DeptDAOImpl();
//		Dept dept = dao.findByDeptno(deptno);
//		System.out.println(dept);
		
		
//		要對部門表格操作，透過dao物件進行
//		DeptDAO dao = new DeptDAOImpl();
//		List<Dept> deptlist = dao.getAll();
//		for(Dept dept : deptlist) {
//			System.out.println(dept);
//		}
		
		
//		要對部門表格操作，透過dao物件進行
		DeptDAO dao = new DeptDAOImpl();
		System.out.println("修改部門編號");
		int deptno = sc.nextInt();
		System.out.println("修改的部門所在地");
		String loc = sc.next();
		Dept dept = new Dept(deptno, loc);
		dao.update(dept);
		
		sc.close();
		
//		dept.setLoc("中國香港");
//		dept.setDeptno(70);
//		dao.update(dept);
		
		
	}

}
