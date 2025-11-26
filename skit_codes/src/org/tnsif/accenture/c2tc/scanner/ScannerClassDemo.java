package org.tnsif.accenture.c2tc.scanner;


//Import the Scanner class
//Create a scanner object
//prompt the user for input
//Read input using scanner method
//Validate
//Close the scanner
import java.util.Scanner;

public class ScannerClassDemo {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter your name");
		String name=scan.nextLine();
		System.out.println(name);

	}

}
