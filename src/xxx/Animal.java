package xxx;

public class Animal {
	private int age;
	private float weight;
	
	//保留無參數的建構子
	public Animal() {
		//1.方便給子類別建構子的對應
		//2.給日後搭配的框架(工具)呼叫 幫我們建立物件
		//3.也是Java Bean的規範之一
	}
	
	public Animal(int age, float weight) {
		this.age = age;
		this.weight = weight;
	}
	
	public void speak() {
		System.out.println("年紀 = " + age);
		System.out.println("體重 = " + weight);
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setWeight(float weight) {
		this.weight = weight;
	}
	
	public int getAge() {
		return age;
	}
	
	public float getWeight() {
		return weight;
	}
}
