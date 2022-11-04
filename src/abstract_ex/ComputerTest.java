package abstract_ex;

public class ComputerTest {
	public static void main(String[] args) {
		
		//Computer c1 = new Computer(); 오류: 추상 클래스는 인스턴스화 할 수 없음
		Computer c2 = new DeskTop();
		//Computer c3 = new NoteBook(); 오류
		Computer c4 = new MyNoteBook();
		
		
	
	}
}
