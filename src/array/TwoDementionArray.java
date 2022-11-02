package array;

public class TwoDementionArray {
	
	public static void main(String[] args) {
		
		int[][] arr = new int[2][3];
		
		System.out.println(arr.length); //행의 길이
		System.out.println(arr[0].length); //0번째 행의 열의 길이
		
		int[][] arr1 = {{1,2,3}, {4,5,6}};
		
		for(int i=0; i<arr1.length; i++) {
			for(int j=0; j<arr1[i].length; j++) {
				System.out.println(arr1[i][j]);
			}
		}
		
		char num = 65;
		char[][] alphabets = new char[13][2];
		for(int i=0; i<alphabets.length; i++) {
			for(int j=0; j<alphabets[i].length; j++, num++) {
				alphabets[i][j] = num;
				System.out.println(alphabets[i][j]);
			}
		}
	}
}
