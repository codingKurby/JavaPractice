package withArrayList;

public class VipCustomer extends Customer {
	
	private int agentID;
	private double saleRatio;
	
	public VipCustomer() {
		customerGrade = "Vip";
		bonusRatio = 0.05;
		saleRatio = 0.1;
	}
	
	public VipCustomer(int customerID, String customerName, int agentID) {
		super(customerID,customerName);
		customerGrade = "Vip";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		this.agentID = agentID;
	}
	//오버라이딩
	public int calPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price * saleRatio);
	}
	
	public int getAgentID() {
		return agentID;
	}

	@Override
	public String showCustomerInfo() {
		return super.showCustomerInfo() + "담당 상담원 ID:" + agentID + "입니다.";
	}
	
}
