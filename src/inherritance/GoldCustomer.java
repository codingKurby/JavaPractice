package inherritance;

public class GoldCustomer extends Customer {
	
	public GoldCustomer() {
		bonusRatio = 0.05;
	}
	@Override
	public int calPrice(int price) {
		return super.calPrice(price);
	}

	@Override
	public String showCustomerInfo() {
		return super.showCustomerInfo();
	}
	
}
