package inherritance;

public class VipCustomer extends Customer {
	
	private int agentID;
	private double saleRatio;
	
	public VipCustomer() {
		customerGrade = "Vip";
		bonusRatio = 0.05;
		saleRatio = 0.1;
	}
	
	public VipCustomer(int customerID, String customerName) {
		super(customerID,customerName);
		customerGrade = "Vip";
		bonusRatio = 0.05;
		saleRatio = 0.1;
	}
	
	public int getAgentID() {
		return agentID;
	}
}
