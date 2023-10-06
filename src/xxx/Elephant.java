package xxx;

public class Elephant extends Animal {
	private String aname;
	
	public Elephant (int age, float weight, String aname) {
		super(age, weight);
		this.aname = aname;
	}
	
	public void speak() {//override 的複寫
		super.speak();
		System.out.println("動物名字 = " + aname);
	}
	
	
}
