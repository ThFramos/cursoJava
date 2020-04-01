package AplicationExerc1;

import java.util.Locale;
import java.util.Scanner;

import EntitiesExerc1.rent;
import entities.product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc =new Scanner(System.in);
		
		int n= sc.nextInt();
		rent[] rent= new rent[10];
		
		for (int i=0; i<n;i++) {
			sc.nextLine();
			System.out.println("Name: ");
			String name= sc.nextLine();
			System.out.println("Email: ");
			String email = sc.nextLine();
			System.out.println("Room number: ");
			int room = sc.nextInt();
			rent[room]= new rent(name,email,room);
			
				
		}
			System.out.println();
			System.out.println("Busy rooms: ");
		
			for (int i=0; i<10;i++) {
			if(rent[i]!=null) {
				
				System.out.println(rent[i].getRoom()+ ": " + rent[i].getName()+ " , " + rent[i].getEmail());
			}
		 
		 }
		 
		 
		 }

}
