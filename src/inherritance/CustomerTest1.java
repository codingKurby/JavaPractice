package inherritance;

public class CustomerTest1 {
	
	public static void main(String[] args) {
		
		Customer customerLee = new Customer();
		customerLee.setCustomerID(10100);
		customerLee.setCustomerName("Lee");
		
		//이런 것도 가능 묵시적 형변환(업캐스팅)
		Customer customertest = new VipCustomer();
		
		VipCustomer customerKim = new VipCustomer();
		customerKim.setCustomerID(10101);
		customerKim.setCustomerName("Kim");
		//customer에 있는 요소들을 쓸 수 있다.
		customerKim.bonusPoint = 1000;
		
		System.out.println(customerLee.showCustomerInfo());
		System.out.println(customerKim.showCustomerInfo());
	}
}
