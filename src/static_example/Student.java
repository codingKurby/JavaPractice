package static_example;

public class Student {
	//serialNum을 static으로 선언하면 모든 student instance에 대해 하나의 변수로 유지 됨
	static int serialNum = 10000; //static 변수: 값을 공유하는 개념
	// private static int serialNum = 10000; => getter, setter 사용하면 값을 가져오거나 바꿀 수 있다
	
	int studentID;
	String studentName;
	
	public Student() {
		serialNum++;
		studentID = serialNum;
	}

	public static int getSerialNum() {
		int i = 10; //지역변수 선언은 가능 (메소드가 호출 될 떄 생성, 메소드가 끝나면 사라짐, 스택에 생성)
		
		System.out.println(i);
		//studentName = "홍길동"; 멤버변수(인스턴스 변수) (인스턴스가 생성될 때 생성 됨, 힙에 생성)
		//인스턴스 변수의 경우 인스턴스가 먼저 생성되어야 한다(new) static 매소드에서는 생성이 불확실한 인스턴스 변수를 사용할 수 없다
		return serialNum; //static 변수(클래스 변수, 데이터 영역에 생성)
	}

	public static void setSerialNum(int serialNum) {
		Student.serialNum = serialNum;
	}
	
	
}
