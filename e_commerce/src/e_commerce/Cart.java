package e_commerce;


interface payment{
	void Cart();
	void pay();
	
}

public class Cart {
	public Cart() {
		System.out.println("\n ----------------- it is any interface class ------------------------"+"\n");
		
		System.out.println("Thanks for adding your item in the cart: " + "please check out "+"\n");
		
		System.out.println("....you are redirecting to payment gateway...."+"\n");
		
		Payment pay = new Payment();
	}
public void pay() 
{
	Payment pay = new Payment();
}
	
}
