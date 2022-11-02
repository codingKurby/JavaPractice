package array;

public class ArrayTest {
	public static void main(String[] args) {
	
		int[] numbers = new int[10];
		numbers[0] = 1;
		int[] numbers2 = {1,2,3,4,5};
		int[] numbers3 = new int[]{1,2,3};
		
		
		for(int i = 0; i < numbers2.length; i++) {
			System.out.println(numbers2[i]);
		}
		
		for(int i = 0; i < numbers3.length; i++) {
			System.out.println(numbers3[i]);
		}
	}
	
	
}
