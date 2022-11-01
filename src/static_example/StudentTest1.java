package static_example;

public class StudentTest1 {
	
	public static void main(String[] args) {
		System.out.println(Student.serialNum); //static변수는 객체를 생성하기 전에 프로그램이 메모리에 load 될 때 메모리 위치가 잡힌다(객체 생성과 관련없다)
		Student studentJ = new Student();
		Student studentT = new Student();
		
		System.out.println(studentJ.studentID);//10001
		System.out.println(studentT.studentID);//10002
		
		System.out.println(studentJ.serialNum);
		System.out.println(Student.serialNum);//static 변수들은 보통 클래스 이름으로 참조한다
	}
}
