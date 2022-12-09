package ShoppingCart;

import java.util.Scanner;
// this class is responsible for the user operations
public class UserPanel {
	 static Scanner sc=new Scanner(System.in); 

	static void userPanel() {
		System.out.println("\t\t~~ Welcome To User Panel~~");
		System.out.println("=====================================================================================");
		int choice;
		do {
			
		
		System.out.println("Press 1. For search product \n"
				+ "Press 2. For book a product\n "
				+ "Press 3. For cancel Order \n "
				+ "Press 4. For Go back to main menu \n");
		System.out.println("============================================");
		choice=sc.nextInt();
		 System.out.println("============================================");
		 
		 switch(choice) {
		 
		 case 1: ProductService.getProductByName();
		 System.out.println("================================================");
		 break;
		 
		 case 2:ProductService.bookProduct();
		 System.out.println("===============================================");
		 break;
		 
		 case 3: ProductService.cancelOrder();
		 System.out.println("================================================");
		 break;
		 
		 case 4: MainMenu.allMenu();
		 break;
		 
		 }
		
		}while(choice!=4);
		

	}

}
