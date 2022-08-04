package com.redobet;
import java.util.Scanner;

public class Review {

	
	public void printScan() {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter your first name:");
	String name = scanner.nextLine();
	System.out.println("Hello " + name);
	scanner.close();
	}
}
