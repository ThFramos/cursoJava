package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.AccountUser;

public class Aplication {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		AccountUser account = null;
		
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("is there an initial deposit (y/n): ");
		char response = sc.next().charAt(0);
		
		
		
		if(response == 'y') {
			System.out.print("Enter initial deposit: ");
			double initialDeposit = sc.nextDouble();
			account = new AccountUser(number,holder,initialDeposit);
			
		}else {
			account = new AccountUser(number,holder);
			
		}
		
		System.out.println();
		System.out.println("Account data: ");
		System.out.println(account);
		
		System.out.println();
		System.out.println("Enter a deposit value: ");
		double depositvalue = sc.nextDouble();
		account.deposit(depositvalue);
		System.out.println("Update account data: ");
		System.out.println(account);
		System.out.println();
		System.out.println("Enter a withdraw value: ");
		double withdrawValue = sc.nextDouble();
		account.withdraw(withdrawValue);
		System.out.println("Update account data: ");
		System.out.println(account);
		
		
		
		
			
		
		sc.close();

	}

}
