package app;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

import entidades.Client;
import entidades.Order;
import entidades.Orderitem;
import entidades.Product;
import entidades.enums.OrderStatus;

public class Main {

	public static void main(String[] args) throws ParseException 
	{
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.println("Enter client data:");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.next();
		System.out.print("Birth date (DD/MM/YYYY): ");
		Date birthDate = sdf.parse(sc.next());
		
		Client client = new Client(name, email, birthDate);
		
		System.out.println("Enter order data: ");
		System.out.print("Status: ");
		OrderStatus status = OrderStatus.valueOf(sc.next());
		
		Order order = new Order(new Date(),status,client);
		
		System.out.print("How many items to this order? ");
		int items = sc.nextInt();
		
		for(int i = 1; i <= items; i++)
		{
			System.out.printf("Enter %d° item data: \n", i);
			System.out.print("Product name: ");
			name = sc.next();
			
			System.out.print("Product price: ");
			double productPrice = sc.nextDouble();
			
			Product product = new Product(name,productPrice);
			
			System.out.print("Quantity: ");
			int quantity = sc.nextInt();
			
			Orderitem orderItem = new Orderitem(quantity, productPrice, product);		
			order.addItem(orderItem);
		}
		
		System.out.println();
		System.out.println("ORDER SUMMARY:");
		System.out.println(order);	
	}

}
