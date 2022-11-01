package singleton;
// 클래스를 생성하는 인스턴스가 오직 하나여야 하며, 인스턴스 접근 혹은 생성 역시 한가지의 방식으로 제공
/* 1. private 생성자
   2. private static 인스턴스 변수
   3. public static getInstatnce() method 구현 */
public class Company {
	
	private static Company instance;
	
	private Company(){
		
	}
	
	public static Company getInstance() {
		if(instance == null) {
			instance = new Company();
		}
		return instance;
	}
}
