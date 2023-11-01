package lab1;
		import java.util.Scanner;

		public class lab1 {
		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        int totalBill = 0;
		        for (int customer = 1; customer <= 5; customer++) {
		       
		        
		        System.out.println("Car Shop");
		        System.out.println("Type of Car                           Price");
		        System.out.println("----------------------------------------------------");
		        System.out.println("1. Sedan                               $20,000");
		        System.out.println("2. SUV                                 $30,000");
		        System.out.println("3. Sports Car                          $40,000");
		        System.out.println("4. Hatchback                           $18,000");
		        System.out.println("5. Convertible                         $35,000");
		        System.out.println("6. Luxury Car                          $50,000");
		        System.out.println("7. Quit");
		        
		        while (true) {
		            System.out.print("Select a car from the menu (1-7): ");
		            
		            if (scanner.hasNextInt()) {
		                int choice = scanner.nextInt();
		                
		                if (choice >= 1 && choice <= 6) {
		                    System.out.print("Enter quantity: ");
		                    int quantity = scanner.nextInt();
		                    
		                    int price = 0;
		                    
		                    switch (choice) {
		                        
		                        case 1:
		                            price = 20000;
		            		        System.out.println("1. Sedan   $20,000");
		            		        System.out.println("Car Shop");
		            		        System.out.println("Type of Car                           Price");
		            		        System.out.println("----------------------------------------------------");
		            		        System.out.println("1. Sedan                               $20,000");
		            		        System.out.println("2. SUV                                 $30,000");
		            		        System.out.println("3. Sports Car                          $40,000");
		            		        System.out.println("4. Hatchback                           $18,000");
		            		        System.out.println("5. Convertible                         $35,000");
		            		        System.out.println("6. Luxury Car                          $50,000");
		            		        System.out.println("7. Quit");
		            		 
		                            break;
		                        case 2:
		                            price = 30000;
		                            System.out.println("2. SUV      $30,000");
		                            System.out.println("Car Shop");
		            		        System.out.println("Type of Car                           Price");
		            		        System.out.println("----------------------------------------------------");
		            		        System.out.println("1. Sedan                               $20,000");
		            		        System.out.println("2. SUV                                 $30,000");
		            		        System.out.println("3. Sports Car                          $40,000");
		            		        System.out.println("4. Hatchback                           $18,000");
		            		        System.out.println("5. Convertible                         $35,000");
		            		        System.out.println("6. Luxury Car                          $50,000");
		            		        System.out.println("7. Quit");
		                            break;
		                        case 3:
		                            price = 40000;
		                            System.out.println("3. Sports Car  $40,000");
		                            System.out.println("Car Shop");
		            		        System.out.println("Type of Car                           Price");
		            		        System.out.println("----------------------------------------------------");
		            		        System.out.println("1. Sedan                               $20,000");
		            		        System.out.println("2. SUV                                 $30,000");
		            		        System.out.println("3. Sports Car                          $40,000");
		            		        System.out.println("4. Hatchback                           $18,000");
		            		        System.out.println("5. Convertible                         $35,000");
		            		        System.out.println("6. Luxury Car                          $50,000");
		            		        System.out.println("7. Quit");
		                            break;
		                        case 4:
		                            price = 18000;
		                            System.out.println("4. Hatchback   $18,000");
		                            System.out.println("Car Shop");
		            		        System.out.println("Type of Car                           Price");
		            		        System.out.println("----------------------------------------------------");
		            		        System.out.println("1. Sedan                               $20,000");
		            		        System.out.println("2. SUV                                 $30,000");
		            		        System.out.println("3. Sports Car                          $40,000");
		            		        System.out.println("4. Hatchback                           $18,000");
		            		        System.out.println("5. Convertible                         $35,000");
		            		        System.out.println("6. Luxury Car                          $50,000");
		            		        System.out.println("7. Quit");
		                            break;
		                        case 5:
		                            price = 35000;
		                            System.out.println("5. Convertible    $35,000");
		                            System.out.println("Car Shop");
		            		        System.out.println("Type of Car                           Price");
		            		        System.out.println("----------------------------------------------------");
		            		        System.out.println("1. Sedan                               $20,000");
		            		        System.out.println("2. SUV                                 $30,000");
		            		        System.out.println("3. Sports Car                          $40,000");
		            		        System.out.println("4. Hatchback                           $18,000");
		            		        System.out.println("5. Convertible                         $35,000");
		            		        System.out.println("6. Luxury Car                          $50,000");
		            		        System.out.println("7. Quit");
		                            break;
		                        case 6:
		                            price = 50000;
		                            System.out.println("6. Luxury Car      $50,000");
		                            System.out.println("Car Shop");
		            		        System.out.println("Type of Car                           Price");
		            		        System.out.println("----------------------------------------------------");
		            		        System.out.println("1. Sedan                               $20,000");
		            		        System.out.println("2. SUV                                 $30,000");
		            		        System.out.println("3. Sports Car                          $40,000");
		            		        System.out.println("4. Hatchback                           $18,000");
		            		        System.out.println("5. Convertible                         $35,000");
		            		        System.out.println("6. Luxury Car                          $50,000");
		            		        System.out.println("7. Quit");
		                            break;
		                    }
		                    
		                    totalBill += (price * quantity);
		                } 
		                else if (choice == 7) {
		                    break; 
		                } 
		                else {
		                    System.out.println("Invalid choice. Please select a valid option (1-7).");
		                }
		            } else {
		                System.out.println("Invalid input. Please enter a number.");
		                scanner.next(); 
		            }
		        }
		        
		        
		        System.out.println("Total Bill: $" + totalBill);
		        double taxRate = 0.13;
	            double tax = totalBill * taxRate;
	            totalBill += tax;

	            // Apply discounts
	            if (totalBill > 30000) {
	                totalBill *= 0.10; // 10% discount
	            } else if (totalBill > 20000) {
	                totalBill *= 0.05; // 5% discount
	            }

	            System.out.println("Customer " + customer + ": Total Bill (including tax and discount): $" + totalBill);
	        }
		        scanner.close();
		    }
		    
	
		

	}

