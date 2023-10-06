package xxx;

public class Test7_1 {

	public static void main(String[] args) {
		
		int kilo = 50;
		double height = 1.53 ;//建立身高體重資料
		double BMI = kilo / (height * height);//Math.pow(height, 2) 身高平方的函數
		
		System.out.println("BMI=" + BMI );
		System.out.printf("BMI = %.3f%n " , BMI);//format(格式) 只取小數點兩或三位數 %n代表換行
		
		if( BMI < 18.5) {
			System.out.println( "過瘦" );
		} else if( 18.5 <= BMI && BMI < 24 ) {//也可以寫成BMI<24
			System.out.println("正常");
		} else if( BMI >= 24) {
			System.out.println("過胖");
			
		}
		
	}
}
