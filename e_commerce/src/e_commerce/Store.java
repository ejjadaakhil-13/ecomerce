package e_commerce;

import java.util.ArrayList;
import java.util.Scanner;

public class Store {

		public Store (){
        System.out.println("Welcome to the Store:"+"\n");
        System.out.println("Select a section that you want to buy products"+"\n");
        System.out.println("\t \t \t ------ Fashion -- Medical -- Groceries -- Electronics ------ \n");
        System.out.println("---------------- We are using string methods to convert the selections to lowercase --------------\n");
        Scanner sc = new Scanner(System.in);
        String section = (sc.nextLine()).toLowerCase();

        if (section.equals("fashion")) {
            ArrayList<Product> products = new ArrayList<>();
            
            System.out.println("\n ------------ here we created a constructor paramarmized to display results throught the constructor method -------------- \n");
            System.out.println("\n -------------here the items are in private mode but we access them through the geters and seters ------------------ \n");
          
            products.add(new Product("Shirts", 25.99));
            products.add(new Product("Pants", 35.99));
            products.add(new Product("Coats", 89.99));

            System.out.println("\n -------------- These values are stored in a ArrayList ---------------- \n");
            System.out.println("Now please choose a product that you want to purchase \n");
            System.out.println("We currently have these things in stock: \n");

            for (Product product : products) {
                product.displayInfo();
            }
             Product product=new Product(null,0);
             product.select();
        } else if (section.equals("medical")) {
            ArrayList<Product> products = new ArrayList<>();
           
            System.out.println("\n ------------ here we created a constructor paramarmized to display results throught the constructor method ------------- \n");
            System.out.println("\n -------------here the items are in private mode but we access them through the geters and seters ------------------ \n");
           

            products.add(new Product("Body pains", 12.99));
            products.add(new Product("BP Tablets", 19.99));
            products.add(new Product("Vitamin Supplements", 29.99));
            System.out.println("\n ----------- These values are stored in a ArrayList ------------ \n");
            System.out.println("Now please choose a product that you want to purchase \n");
            System.out.println("We currently have these things in stock:"+"\n");
           
            

            for (Product product : products) {
                product.displayInfo();
            }
            Product product=new Product(null,0);
            product.select();
        } 
        else if (section.equals("groceries")) {
            ArrayList<Product> products = new ArrayList<>();
            
            System.out.println("\n -------------  here we created a constructor paramarmized to display results throught the constructor method -------------\n");
            System.out.println("\n -------------here the items are in private mode but we access them through the geters and seters ------------------ \n");

            System.out.println("Now please choose a product that you want to purchase\n");
            
            products.add(new Product("Milk", 3.99));
            products.add(new Product("Soaps", 1.99));
            products.add(new Product("Washing Powder", 5.99));
            
            System.out.println("\n -------------- These values are stored in a ArrayList --------- \n");
 
            for (Product product : products) {
                product.displayInfo();
            }
            Product product=new Product(null,0);
            product.select();
        } else if (section.equals("electronics")) {
            ArrayList<Product> products = new ArrayList<>();
            System.out.println("We currently have these things in stock: \n");
            System.out.println("\n ----------- here we created a constructor paramarmized to display results throught the constructor method --------- \n");
            System.out.println("\n -------------here the items are in private mode but we access them through the geters and seters ------------------ \n");
            products.add(new Product("Phones", 299.99));
            products.add(new Product("Tablets", 499.99));
            products.add(new Product("Laptops", 999.99));

            System.out.println("\n ------------ These values are stored in a ArrayList ------------- \n");
            System.out.println("We currently have these things in stock:");
          

            for (Product product : products) {
                product.displayInfo();
            }
            Product product=new Product(null,0);
            product.select();
        } else {
            System.out.println("Invalid section"+"\n");
            Store store=new Store();
        }
    }
}
