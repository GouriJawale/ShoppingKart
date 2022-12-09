package ShoppingCart;





import java.util.Scanner;

//java bean
public class Product {
	// this class is responsible for getting and storing as well retriving the information of a product. 
	// 
	private int id;
    private String name,brand;
	private double price;
	private int quantity;
	
	
	
	public Product(int id, String name, String brand, double price, int quantity) {
		super();
		this.id = id;
		this.name = name;
		this.brand = brand;
		this.price = price;
		this.quantity = quantity;
	}
   
	

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

    
	// the getter and setter methods to get and set the product details.
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Product [id=").append(id).append(", name=").append(name).append(", brand=").append(brand)
				.append(", price=").append(price).append(", quantity=").append(quantity).append("]");
		return builder.toString();
	}


	
}
