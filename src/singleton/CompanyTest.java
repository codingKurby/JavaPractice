package singleton;

public class CompanyTest {
	public static void main(String[] args) {
		
		//Company company = new Company(); 외부에서 함부로 Company객체를 생성할 수 없음
		Company c1 = Company.getInstance();
		Company c2 = Company.getInstance();
		
		System.out.println(c1);
		System.out.println(c2);
	}
}
