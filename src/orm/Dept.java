package orm;

import java.io.Serializable;

public class Dept implements Serializable{//建立部門類別 下面三個實體變數(屬性或者欄位)
	private Integer deptno;//改用包裝類別Integer，後面會說為什麼
	private String dname;
	private String loc;
	
	public Dept() {
		super();
	}
	
	public Dept(Integer deptno, String dname, String loc) {
		super();
		this.deptno = deptno;
		this.dname = dname;
		this.loc = loc;
	}
	
	public Dept(Integer deptno, String loc) {
		super();
		this.deptno = deptno;
		this.loc = loc;
	}
	
	public Integer getDeptno() {
		return deptno;
	}
	
	public void setDeptno(Integer deptno) {
		this.deptno = deptno;
	}
	
	public String getDname() {
		return dname;
	}
	
	public void setDname(String dname) {
		this.dname = dname;
	}
	
	public String getLoc() {
		return loc;
	}
	
	public void setLoc(String loc) {
		this.loc = loc;
	}

	@Override
	public String toString() {//查詢新增
		return "Dept [deptno=" + deptno + ", dname=" + dname + ", loc=" + loc + "]";
	}
	
	
	
	
	
}
