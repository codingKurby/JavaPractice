package inherritance;

public class CustomerTest1 {
	
	public static void main(String[] args) {
		
		Customer customerLee = new Customer();
		customerLee.setCustomerID(10100);
		customerLee.setCustomerName("Lee");
		
		VipCustomer customerKim = new VipCustomer();
		customerKim.setCustomerID(10101);
		customerKim.setCustomerName("Kim");
		
		System.out.println(customerLee.showCustomerInfo());
		System.out.println(customerKim.showCustomerInfo());
	}
}
