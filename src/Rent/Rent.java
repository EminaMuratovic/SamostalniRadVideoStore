package Rent;

import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Date;

/**
 * In this task we need to make mini project 'Videostore' and create java classes that are needed.
 * Then, we need to make another class that will read date from xml file.
 * And finally, make this program work for user.
 * @author eminamuratovic
 *
 */
public class Rent {
	private int movieID;
	private int customerID;
	private Date date;
	private int employeeID;
	private boolean payed;
	
	/**
	 * rents a movie
	 * @param movieID int movie ID
	 * @param customerID int customer ID
	 * @param date Date date of the rent
	 * @param employeeID int employee ID
	 * @param payed boolean if it payed
	 */
	public Rent(int movieID, int customerID, Date date, int employeeID, boolean payed) {
		this.movieID = movieID;
		this.customerID = customerID;
		this.employeeID = employeeID;
		this.date = date;
		this.payed = payed;
	}
	
	/**
	 * checks if the rented movie is payed
	 * @return true or false
	 */
	public boolean isPayed() {
		return payed;
	}

	/**
	 * sets the payed paremeter to true or false
	 * @param payed boolean true or false
	 */
	public void setPayed(boolean payed) {
		this.payed = payed;
	}

	/**
	 * gets the movie ID
	 * @return movie ID
	 */
	public int getMovieID() {
		return movieID;
	}

	/**
	 * gets the customer ID
	 * @return customer ID
	 */
	public int getCustomerID() {
		return customerID;
	}

	/**
	 * gets the date of the rent
	 * @return date
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * gets the employee ID
	 * @return employee ID
	 */
	public int getEmployeeID() {
		return employeeID;
	}

	/**
	 * creates a string representation of the rented item
	 * @return string
	 */
	public String printRented() {
		String str = "";
		str += " Movie ID: " + movieID;
		str += "\n  Customer ID: " + customerID;
		str += "\n  Employee ID: " + employeeID;
		str += "\n  Date: " + date;
		str += "\n  Payed: " + payed;
		str += "\n\n";
		return str;
	}
	
	/**
	 * creates xml form of the rented item
	 * @param os OutputStream
	 */
	public void rentToXML(OutputStream os) {
		PrintWriter pw = new PrintWriter(os);
		pw.println("<rent movieID = \"" + movieID
				+ "\" customerID = \"" + customerID
				+ "\" employeeID = \"" + employeeID
				+ "\" date = \"" + date
				+ "\" payed = \"" + payed + "\" />");
		pw.flush();
	}
}
