package interface_ex;

public class CalculatorTest {
	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 2;
		
		Calc calc = new CompleteCalc();
		
		/* 인터페이스는 인스턴스화 될 수 없다.
		Calc calc1 = new Calc();
		Calc calc2 = new Calculator();
		*/
		System.out.println(calc.add(num1, num2));
		
	}
}
