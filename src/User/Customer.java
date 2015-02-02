package User;

import java.io.OutputStream;
import java.io.PrintWriter;

/**
 * Creates a customer
 * @author eminamuratovic
 *
 */
public class Customer {
	private int customerId;
	private String customerName;
	private String customerSurname;
	private long customerPhone;
	private String customerEmail;
	
	/**
	 * creates a customer
	 * @param customerId int ID of the customer
	 * @param customerName String name of the customer
	 * @param customerSurname String surname of the customer
	 * @param customerPhone long phone number of the customer
	 * @param customerEmail String e-mail of the customer
	 */
	public Customer(int customerId, String customerName, String customerSurname, long customerPhone, String customerEmail) {
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerSurname = customerSurname;
		this.customerPhone = customerPhone;
		this.customerEmail = customerEmail;
	}
	
	/**
	 * gets the customer ID
	 * @return the customerId
	 */
	public int getCustomerId() {
		return customerId;
	}
	
	/**
	 * sets new customer email
	 * @param customerEmail
	 */
	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}
	
	/**
	 * sets new customer phone
	 * @param customerPhone
	 */
	public void setCustomerPhone(long customerPhone) {
		this.customerPhone = customerPhone;
	}

	/**
	 * makes string representation of the custumer
	 * @return string
	 */
	public String printCustomer() {
		String str = "";
		str += " Customer ID: " + customerId;
		str += "\n  Name: " + customerName;
		str += "\n  Surname: " + customerSurname;
		str += "\n  Phone: " + customerPhone;
		str += "\n  Email: " + customerEmail + "\n\n";
		return str;
	}
	
	/**
	 * creates xml form of the customer
	 * @param customer Customer given customer
	 * @param os OutputStream
	 */
	public void customerToXML(OutputStream os) {
		PrintWriter pw = new PrintWriter(os);
		pw.println("<customer customerId = \"" + customerId 
				+ "\" customerName = \"" + customerName 
				+ "\" customerSurname = \"" + customerSurname 
				+ "\" customerPhone = \"" + customerPhone 
				+ "\" customerEmail = \"" + customerEmail + "\" />");
		pw.flush();
	}
	

}
