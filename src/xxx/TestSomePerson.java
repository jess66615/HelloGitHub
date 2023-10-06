package xxx;


public class TestSomePerson {
	public static void main(String[] args) {
		int[] Array = {20,30,40,50,3,6,5,-9}; //先宣告一個陣列

		int max=Array[0]; //宣告一個變數為陣列中的第一個值

		for(int i =1 ;i<Array.length;i++) {   //for回圈把陣列都跑一遍

			if(Array[i]>max) {     //如果陣列裡的數字比max大，則該數字為max

				max=Array[i];

	

			}System.out.println(max);
	
		}
	}
	
}
