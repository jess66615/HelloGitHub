package xxx;

public class PolyAnimal {
	
	public static void main(String[] args) {
		
		Animal[] p = new Animal[3];
		
		p[0] = new Elephant(20, 1000, "大象爺爺");
		p[1] = new Animal(2, 5.0f);
		p[2] = new Elephant(5, 500, "大象奶奶");

		for(int i = 0; i < p.length; i++) {
			p[i].speak();
			System.out.println("==================");
		}
	}
	
}
