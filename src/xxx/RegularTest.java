package xxx;

import java.util.Scanner;

public class RegularTest {
	//身分證的驗證功能
	public static void main(String[] args) {
		String id = "^[A-Za-z][12]\\d{8}$";
		Scanner sc = new Scanner(System.in);
		String num = sc.next().toUpperCase();//toUpperCase可以轉成大寫
		
		if(num.matches(id)) {
			System.out.println("OK");
		}else {
			System.out.println("No OK...");
		}
	}

}
