package ShoppingCart;

import java.util.Scanner;
// this class is responsible for the admin operations
public class AdminPanel {
	
	 static Scanner sc=new Scanner(System.in); 
	    
	static void adminPanel() {
		System.out.println("\t\t~~ Welcome To Admin Panel~~");
		System.out.println("=====================================================================================");
		int choice;
		
		do {
			
			System.out.println("Press 1. For Add Product\n"
					+ "Press 2. For update product details \n"
					+"Press 3. For deleting product \n"+
					"Press 4. For Showing all products \n"
					+ "Press 5. For Showing all Orders \n"
					+ "Press 6. For going to main Menu \n"
					+ "Press 7. For Quit");
			System.out.println("============================================");
			choice=sc.nextInt();
			 System.out.println("============================================");
			 switch(choice)
			 {
			 case 1:ProductService.createProduct();
			 System.out.println("============================================");
			 break;
				
			 case 2: ProductService.updateProductById();
			 System.out.println("============================================");
			 break;
			 
			 case 3: ProductService.deleteProduct();
			 System.out.println("=============================================");
			 break; 
			 
			 case 4: ProductService.getAllProduct();
			 System.out.println("============================================");
			 break;
			 
			 case 5: ProductService.showAllOrder();
			 System.out.println("==============================================");
			 break;
			 
			 case 6: MainMenu.allMenu(); // this will give the main menu for main menu class.
				 
			 break;
			 
			 case 7: 
				 default: adminPanel();
				 break;
				
			 
			 }
		}while(choice!=7);
	}
}
