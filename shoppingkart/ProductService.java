package ShoppingCart;


import java.util.Scanner;

// this class is responsible for all operation user or admin will perform in the application
public class ProductService {
	
	
	// this product array of type Product class, will store product details
	static Product product[]=new Product[10];

	//this order array of type OrderDetails class, will store order details
static OrderDetails order[]=new OrderDetails[10];

static Scanner sc=new Scanner(System.in);
// this index for the index of the product array
static int index=0;
//this index for the index of the order array
static int orderIndex=0;

//this method is responsible to add product in the array
 static void createProduct()
{
	System.out.println("Enter Product Id");
    int id=sc.nextInt();
    
    sc.nextLine();//it will consume the \n character
    
    System.out.println("Enter Product Name");
    String name=sc.nextLine();
    
    System.out.println("Enter Product Brand");
    String brand=sc.nextLine();
    
    System.out.println("Enter Product price");
    double price=sc.nextInt();
    
    System.out.println("Enter Stock");
    int quantity=sc.nextInt();
    
    //will insert in an array
    product[index]=new Product(id, name, brand, price, quantity);
    index++;//2
    System.out.println("Product added successfully!!");
}

//this method is responsible to retrieve all product details
 static void getAllProduct()
{
	for(int i=0;i<index;i++)
	{
		System.out.println("Product id: "+product[i].getId());
		System.out.println("Product Name: "+product[i].getName());
		System.out.println("Product Brand: "+product[i].getBrand());
		System.out.println("Product price: "+product[i].getPrice());
		System.out.println("Product Quantity: "+product[i].getQuantity());
		System.out.println("============================================");
	}
}

//this method is responsible to retrieve product details by id
  static void getProductById()
{
	boolean f=false;
	System.out.println("Enter id To search Product:");
	int id=sc.nextInt();
	System.out.println("============================================");
	for(int i=0;i<index;i++)
	{    
		// here if the product id is equal to the id of the products entered then the if body will execute
		if(product[i].getId()==id)
		{
			System.out.println("Product id: "+product[i].getId());
			System.out.println("Product Name: "+product[i].getName());
			System.out.println("Product Brand: "+product[i].getBrand());
			System.out.println("Product price: "+product[i].getPrice());
			System.out.println("Product Quantity: "+product[i].getQuantity());
			System.out.println("============================================");
			f=true;
			break;
		}
	}
	// if the id did not matches then this if statement will execute
	if(f==false)
	{
		System.out.println("Product Id not found!!!");
		System.out.println("============================================");
	}
}
  
// this method is responsible for booking the product
static void bookProduct()
{
     boolean f=false;
	sc.nextLine();
	System.out.println("Enter product name:");
	String name=sc.nextLine();
	System.out.println("============================================");
	for(int i=0;i<index;i++)
	{    
		// this will search the product by name and display the product details if product name matches.
		if(product[i].getName().equalsIgnoreCase(name))
		{
			System.out.println("Product id: "+product[i].getId());
			System.out.println("Product Name: "+product[i].getName());
			System.out.println("Product Brand: "+product[i].getBrand());
			System.out.println("Product price: "+product[i].getPrice());
			System.out.println("Product Quantity: "+product[i].getQuantity());
			System.out.println("============================================");
			f=true;
		}
	}
	
	// this code is responsible of booking the product by id
	if(f==true)
	{
		System.out.println("for booking, Enter Id:");
		int id=sc.nextInt();
		
		for(int i=0;i<index;i++)
		{
		if(product[i].getId()==id)
		{
			System.out.println("Enter quantity:");
			int quantity=sc.nextInt();
			
			if(product[i].getQuantity()>quantity) 
			{
				System.out.println("Your Booking has done successfully!!");
				// this will calculate the total amount payable according to quantity and pricea
				double total=quantity*product[i].getPrice();
				// here it displays the booking details
				System.out.println("Booking Details: ");
				System.out.println("Product Name: "+ id);
				System.out.println("Product Name: "+ product[i].getName());
				System.out.println("Product Brand: "+ product[i].getBrand());
				System.out.println("Product Quatity: "+ quantity);
				System.out.println("Total amount: "+ total);
          
				   // here the stock of the product will reduced by the quantity entered by the user
			   product[i].setQuantity(product[i].getQuantity()-quantity);
			    
			   // this will store the order details into the order array.
				order[orderIndex]=new OrderDetails(id,name, product[i].getBrand(),quantity, total);
			    orderIndex++;
			    break;
			}
		}
		}
	}
	else
		System.out.println("No such product available in shopping kart!!");
}
        // this method is responsible for showing all the orders placed by the user.
      static void showAllOrder()
      {
    	  System.out.println("Order History .....!");
    	  for(int i=0;i<orderIndex;i++) {
    		  System.out.println("Proudct ID:"+ order[i].getOrderId());
    		  System.out.println("Product Name: "+order[i].getProductName());
    		  System.out.println("Product Name: "+order[i].getBrand());
    		  System.out.println("Product Name: "+order[i].getQuantity());
    		  System.out.println("Product Name: "+order[i].getTotalAmount());
    		  System.out.println("================================================================================================");
    	  }
      }
      
      // this method is responsible for updating the product details by id 
      static void updateProductById() {
    	  boolean status = false;
    	  System.out.println("Enter product id to update product details");
    	  int id= sc.nextInt();
    	  for(int i=0;i<index;i++) {
    		  if (id==product[i].getId()) {
    			  System.out.println("Enter new product ID :");
    			  int pid = sc.nextInt();
    			  sc.nextLine();//it will consume the \n character
    			    
    			    System.out.println("Enter Product Name");
    			    String name=sc.nextLine();
    			    
    			    System.out.println("Enter Product Brand");
    			    String brand=sc.nextLine();
    			    
    			    System.out.println("Enter Product price");
    			    double price=sc.nextInt();
    			    
    			    System.out.println("Enter Stock");
    			    int quantity=sc.nextInt();
    			   
    			    product[i]=new Product(pid, name, brand, price, quantity);
    			    System.out.println("Product updated successfully...!");
    			    status = true;
    			  
    			  }
    	  }
    	  if(status==false) {
    		  System.out.println("product ID not found............:(");
    		  
    	  }
      }
      // this method is responsible for deleting the product
      static void deleteProduct()
      {
    	  boolean status = false;
    	  System.out.println("Enter product id to delete product details");
    	  int id = sc.nextInt();
    	  for(int i=0;i<index;i++) {
    		  if(id==product[i].getId())
    		  {
    			  for(int j=i;j<index;j++) {
    				  // this code is responsible for the product which we want to delete we will shift the next product to it the that position of the product which we want to delete this will delete the product
    				  product[j]=product[j+1];
    			  }
    			  index--;
    			  System.out.println("Product deleted successfully.....!");
    			  status=true;
    			  break;
    		  }
    	  
      }
    	  if(status==false) {
    		  System.out.println("Product ID not found....!");
    		  System.out.println("=========================================================================");
    	  }

	
      }
      // this method is responsible for canceling the order
      static void cancelOrder() {
    	  boolean status = false;
    	  System.out.println("Enter the order id to cancel the order");
    	  int id = sc.nextInt();
    	  for (int i=0;i<orderIndex;i++) {
    		  
    		  if(id==order[i].getOrderId()) {
    			  
    			  for(int j=0;j<orderIndex;j++) {
    				  
    				  product[j].setQuantity(product[j].getQuantity()+order[i].getQuantity());
    				  
    			  }
    			
    		  }
    		  for(int k = i;k<orderIndex-1;k++) {
    			  order[k] = order[k+1];
    		  }
    		  orderIndex--;
			  System.out.println("Order canceled successfully.....!");
			  status=true;
			  break;
    		  
    	  }
    	  if(status == false) {
    		  System.out.println("Order ID not found..................!");
    		  System.out.println("=========================================================================================================");
    	  }
      }
      // this method is responsible for the  searching the product by name
      static void getProductByName()
      {
      	boolean f=false;
      	sc.nextLine();
      	System.out.println("Enter name  To search Product:");
      	String name =sc.nextLine();
      	System.out.println("============================================");
      	for(int i=0;i<index;i++)
      	{
      		if(product[i].getName().equalsIgnoreCase(name))
      		{
      			System.out.println("Product id: "+product[i].getId());
      			System.out.println("Product Name: "+product[i].getName());
      			System.out.println("Product Brand: "+product[i].getBrand());
      			System.out.println("Product price: "+product[i].getPrice());
      			System.out.println("Product Quantity: "+product[i].getQuantity());
      			System.out.println("============================================");
      			f=true;
      			break;
      		}
      	}
      	if(f==false)
      	{
      		System.out.println("Product name not found!!!");
      		System.out.println("============================================");
      	}
      }
}
	

