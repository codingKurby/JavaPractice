package array;

public class BookArray {
	public static void main(String[] args) {
		
		Book[] library = new Book[5]; //Book이 5개 생성되는 것이 아님 Book을 가르킬 주소의 자리가 5개 만들어지는 것, 객체는 따로 생성해야함
		
		for(int i=0; i<library.length; i++) {
			System.out.println(library[i]);
		}
		
		library[0] = new Book("태백산맥1", "조정래");
		library[1] = new Book("태백산맥2", "조정래");
		library[2] = new Book("태백산맥3", "조정래");
		library[3] = new Book("태백산맥4", "조정래");
		library[4] = new Book("태백산맥5", "조정래");
		
		for(int i=0; i<library.length; i++) {
			System.out.println(library[i]);
		}
		
		for(int i=0; i<library.length; i++) {
			library[i].showBookInfo();
		}
		
	}
}
