package org.tnsif.accenture.c2tc.scanner;
import java.util.Scanner;
public class AdvancedScannerMethod {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter some data (you can enter numbers or text)");
		
		while(scan.hasNext())
		{
			if(scan.hasNextInt())
			{
				int intValue=scan.nextInt();
				System.out.println("Read an integer :"+intValue);
				scan.nextLine();
			}
			else if(scan.hasNextDouble())
			{
				double doubleValue=scan.nextDouble();
				System.out.println("Read an double :"+doubleValue);
				scan.nextLine();
			}
			else
			{
				String stringValue =scan.next();
				System.out.println("Unknown input :"+stringValue);
			}
	
		}
	}

}
