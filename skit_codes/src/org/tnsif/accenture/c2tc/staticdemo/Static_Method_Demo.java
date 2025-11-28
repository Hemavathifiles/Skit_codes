package org.tnsif.accenture.c2tc.staticdemo;

class PaymentGateway
{
	static void showSupportedBanks()
	{
		System.out.println("Supported Banks :SBI,HDFC,ICICI,Axis");
	}
}


public class Static_Method_Demo {

	public static void main(String[] args) {
		PaymentGateway.showSupportedBanks();
	}

}
