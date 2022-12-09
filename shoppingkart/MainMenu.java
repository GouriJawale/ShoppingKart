package ShoppingCart;

import java.util.Scanner; 
// this class the responsible for the admin and user activity choice
public class MainMenu {
  
	 static Scanner sc=new Scanner(System.in); 
	 
	 static void allMenu() {
		 
		 System.out.println("~~~ Welcome To the Main Menu ~~~");
		 System.out.println("==================================================");
		 int choice;
		 
		 do {
			 
		 
		 System.out.println(" Press 1. For Admin Panel \n "
		 		+ "Press 2. For User Panel \n"
		 		+ "Press 3. For Quit \n ");
		 System.out.println("=================================================================");
		 System.out.println("Enter the choice");
		 choice = sc.nextInt();
		 
		 switch(choice) {
		  
		 case 1: AdminPanel.adminPanel();
		 break;
		 
		 case 2: UserPanel.userPanel();
		 break;
		 
		 case 3: System.exit(0); // this will quit the process
		 
		 }
		 
		 }while(choice!=3);
	 }
}
