package abstract_ex;

//추상 클래스는 상속을 하기위해 만드는 class, 인스턴스화 될 수 없다. 
public abstract class Computer {
	
	public abstract void display(); //구현을 하지 않겠다 메소드를 선언만 한다
	public abstract void typing();
	
	public void turnOn() {
		System.out.println("전원을 켭니다");
	}
	
	public void turnOff() {
		System.out.println("전원을 끕니다");
	}
}
