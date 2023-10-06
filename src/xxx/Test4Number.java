package xxx;

public class Test4Number {
	
	public static void main(String[] args) {
		
//		請建立一個Test4Numbers.java，可輸出0～100裡4的倍數
		
		int num1 = 0;
		for(int num2 = 4,y = 0; y <= 25; y++){
			System.out.print(num1 + " ");
			num1 += num2;							
		}
		
		System.out.println();
		
//老師寫的
		
		for (int i = 0; i <= 100; i++) {
			if (i % 4 == 0)
				System.out.print(i + " ");
			}
			
//換行的方法
			System.out.println();
//			System.out.print("\n");
//			System.out.println("\n");
				
		
		for (int i = 0; i <= 100; i += 4) {
			System.out.print(i + " ");		
		
		}
			
			System.out.println();
		
		
	}

}
