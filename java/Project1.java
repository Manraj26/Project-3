package lab;
import java.util.ArrayList;
import java.util.Scanner;

class TestGeneric<T> {
	 private T name;
	    private double price;
	    
	    public TestGeneric(T name, double price) {
	        this.name = name;
	        this.price = price;
	    }

	    public T getName() {
	        return name;
	    }

	    public double getPrice() {
	        return price;
	    }
	    
	    
	    public String toString() {
	        return name + " - $" + price;
	    }
}




public class test_problem2 {
	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Welcome to CSD121 TEST");
        System.out.println("My Name is Manraj Deep");
        System.out.println("My Student ID id 22043461");
        
        
        ArrayList<PurchaseItem<String>> items = new ArrayList<>();
        

        
        while (true) {
            System.out.print("Enter item name: ");
            String itemName = s.nextLine();

            if (itemName.equalsIgnoreCase("end")) {
                break;
            }

            System.out.print("Enter item price: $");
            double itemPrice = Double.parseDouble(s.nextLine());

            items.add(new PurchaseItem<>(itemName, itemPrice));
            
        }

        double totalAmount = calculateTotalAmount(items);
        
        
        
        
        
        System.out.println("Entered Items and prices");
        for (PurchaseItem<String> item : items) {
            System.out.println(item.getName() + " - $" + item.getPrice());
        }

        System.out.println("\nTotal Amount: $" + totalAmount);

        s.close();
    }

    public static <T> double calculateTotalAmount(ArrayList<PurchaseItem<T>> items) {
        double totalAmount = 0.0;

        for (PurchaseItem<T> item : items) {
            totalAmount += item.getPrice();
        }

        return totalAmount;
        }
	
	
}
