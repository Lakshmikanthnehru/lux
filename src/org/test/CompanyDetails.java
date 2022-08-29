package org.test;

public class CompanyDetails extends ClientDetails {
	private void CompanyName() {
System.out.println("company name is oracle");
	}
	private void CompanyId() {
System.out.println("company id is 96358");
	}
	public static void main(String[] args) {
		CompanyDetails z = new CompanyDetails();
				z.CompanyName();
		z.CompanyId();
		z.empId();
		z.empName();
		z.clientCode();
		z.clientBrand();
	}

}
