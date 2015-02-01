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
	 * @param customerId
	 * @param customerName
	 * @param customerSurname
	 * @param customerPhone
	 * @param customerEmail
	 */
	public Customer(int customerId, String customerName, String customerSurname, long customerPhone, String customerEmail) {
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerSurname = customerSurname;
		this.customerPhone = customerPhone;
		this.customerEmail = customerEmail;
	}
	
	/**
	 * @return the customerId
	 */
	public int getCustomerId() {
		return customerId;
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
		pw.println("<customer>");
		pw.println("	<customerID>" + customerId + "</customerID>");
		pw.println("	<customerName>" + customerName + "</customerName>");
		pw.println("	<customerSurname>" + customerSurname + "</customerSurname>");
		pw.println("	<customerPhone>" + customerPhone + "</customerPhone>");
		pw.println("	<customerEmail>" + customerEmail + "</customerEmail>");
		pw.println("</customer>");
		pw.flush();
	}
	

}
