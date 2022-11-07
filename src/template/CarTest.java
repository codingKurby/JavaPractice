package template;

public class CarTest {
	public static void main(String[] args) {
		
		Car myCar = new MenualCar();
		myCar.run();
		System.out.println("==================");
		Car yourCar = new AICar();
		yourCar.run();
	}
}
