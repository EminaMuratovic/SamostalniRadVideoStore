package User;

import java.io.OutputStream;
import java.io.PrintWriter;

/**
 * Creates an employee
 * @author eminamuratovic
 *
 */
public class Employee {
	private int empleyeeId;
	private String employeeName;
	private String employeeSurname;
	private long employeePhone;
	private String employeeEmail;
	
	/**
	 * creates an employee
	 * @param empleyeeId int employee ID
	 * @param employeeName String name of the employee
	 * @param employeeSurname String surname of the employee
	 * @param employeePhone long phone of the employee
	 * @param employeeEmail String e-mail of the employee
	 */
	public Employee(int empleyeeId, String employeeName, String employeeSurname, long employeePhone, String employeeEmail) {
		this.empleyeeId = empleyeeId;
		this.employeeName = employeeName;
		this.employeeSurname = employeeSurname;
		this.employeePhone = employeePhone;
		this.employeeEmail = employeeEmail;
	}
	
	/**
	 * @return the empleyeeId
	 */
	public int getEmpleyeeId() {
		return empleyeeId;
	}

	/**
	 * makes string representation of the employee
	 * @return string
	 */
	public String printEmployee() {
		String str = "";
		str += " Employee ID: " + empleyeeId;
		str += "\n  Name: " + employeeName;
		str += "\n  Surname: " + employeeSurname;
		str += "\n  Phone: " + employeePhone;
		str += "\n  Email: " + employeeEmail + "\n\n";
		return str;
	}
	
	/**
	 * creates xml form of the employee
	 * @param customer Customer given employee
	 * @param os OutputStream
	 */
	public void employeeToXML(OutputStream os) {
		PrintWriter pw = new PrintWriter(os);
		pw.println("<employee>");
		pw.println("	<employeeID>" + empleyeeId + "</employeeID>");
		pw.println("	<employeeName>" + employeeName + "</employeeName>");
		pw.println("	<employeeSurname>" + employeeSurname + "</employeeSurname>");
		pw.println("	<employeePhone>" + employeePhone + "</employeePhone>");
		pw.println("	<employeeEmail>" + employeeEmail + "</employeeEmail>");
		pw.println("</employee>");
		pw.flush();
	}
	

}
