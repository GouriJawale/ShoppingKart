package ShoppingCart;

public class OrderDetails {
	// this class is responsible for Storing and retriving the order details
	private int orderId;
	private String productName, brand;
	private int quantity;
	private double totalAmount;
	public OrderDetails(int orderId, String productName, String brand, int quantity, double totalAmount ) {
		super();
		this.orderId=orderId;
		this.productName = productName;
		this.brand = brand;
		this.quantity = quantity;
		this.totalAmount = totalAmount;
	}
	
	// getter and setter methods to get and set the values of the variable in this class. ie. orderid, product name, brand, quantity etc.
	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}
	

	

}
