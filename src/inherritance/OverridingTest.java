package inherritance;

public class OverridingTest {
	public static void main(String[] args) {
		/*Customer customerLee = new Customer(100010, "Lee");
		int price = customerLee.calPrice(10000);
		System.out.println(customerLee.showCustomerInfo());
		System.out.println("지불금액은" + price);
		
		VipCustomer vipcustomerKim = new VipCustomer(10010, "Kim", 100);
		int vipPrice = vipcustomerKim.calPrice(10000);
		System.out.println(vipcustomerKim.showCustomerInfo());
		System.out.println("지불금액은" + vipPrice);
		*/
		
		Customer customerWho = new VipCustomer(100010,"who",100);
		int price = customerWho.calPrice(10000);
		System.out.println("지불금액은" + price + "이며," + customerWho.showCustomerInfo());
		
		Customer customerGold = new GoldCustomer();
	}
}
