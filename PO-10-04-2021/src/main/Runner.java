package main;

import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		CreditCardChecker check = new CreditCardChecker();
		System.out.println("Enter your card number: ");
		String card = in.next();
		System.out.println(check.checkCard(card));
	}

}
