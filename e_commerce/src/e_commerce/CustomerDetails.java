
package e_commerce;
import java.util.*;
public class CustomerDetails {
Scanner sc=new Scanner(System.in);
public CustomerDetails() {	
		System.out.println("\n ----------- we are taking user input from the user through the java util package -------------\n");
		System.out.println("---Welcome to the Registaion Page---"+"\n");
		System.out.println("------------------- The Registation page was called with the Constructor  ------------- "+"\n");
		System.out.println("Enter your name:"+"\n");
		String name=sc.nextLine();
		System.out.println("Enter your email:"+"\n");
		String email=sc.nextLine();
		System.out.println("Enter your password:"+"\n");
		String password=sc.nextLine();
		System.out.println("Enter your phone number:"+"\n");
		String phone=sc.nextLine();
		System.out.println("Thank you for the Registration"+"\n");
		login(email,password);
}
public void login(String email,String password) {
		System.out.println("--------   Welcome to the Login Page   --------");
		System.out.println("Enter your email:"+"\n");
		String login_email=sc.nextLine();
		System.out.println("Enter your password:"+"\n");
		String login_password=sc.nextLine();
		System.out.println("-----------------  here the loging details are compared with registration details through the String methods --------------");
		if (login_email.equals(email)&&(login_password.equals(password))) {
		Store store=new Store();
}
else {
		System.out.println("........Sorry! Your details are not matching :)........."+"\n");
		login(email,password);

}

}

}

