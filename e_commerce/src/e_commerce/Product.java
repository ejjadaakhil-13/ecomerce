package e_commerce;
import java.util.*;

public class Product{
    private String name;
    private double price;
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public void displayInfo() {
        System.out.println(name + " - $" + price);
    }
    public void select() {
    	Scanner sc =new Scanner(System.in); 	
    	String item=sc.nextLine();	
    	System.out.println("Item selected please select 'ADD TO CART' OR 'PAYMENT' "+"\n");
    	String mode_payment=(sc.nextLine()).toLowerCase();
    	
    	if(mode_payment.equals("add to cart")) {
    		Cart cart=new Cart();
    	} 	
    	else if (mode_payment.equals("payment"))   		
    	{
    		payments pay= new Payment();
    	}
    	
    	
    	
    	
    }
}
