package org.test;

public class ClientDetails extends EmployeeDetails{
	public void clientCode() {
System.out.println("client code is 5213");
	}
	public void clientBrand() {
System.out.println("client brand is acer");
	}
	public static void main(String[] args) {
		ClientDetails z = new ClientDetails();
		z.clientCode();
		z.clientBrand();
	}

}
