package orm;

import java.util.List;

public interface DeptDAO {//DAO就是設計界面
	//宣告各個對部門表格操作的方法
	//程式裡，現在一筆部門資料就是一個Dept物件
	//有了Dept類別，就是一個要新增部門的資料，就當作一個部門物件
	void insert(Dept dept);//宣告五個方法 基本模板 字型增加減少方法的宣告
	void update(Dept dept);
	void delete(Integer deptno);
	
	Dept findByDeptno(Integer deptno);
	List<Dept> getAll();//集合回傳
	
	

}
