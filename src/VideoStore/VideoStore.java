package VideoStore;

import java.io.OutputStream;
import java.io.PrintWriter;

import DVD.Movie;
import User.Customer;
import User.Employee;
import Rent.Rent;

/**
 * Creates a videostore
 * @author eminamuratovic
 *
 */
public class VideoStore {
	private Customer[] customers;
	private Employee[] employees;
	private Rent[] rentedMovies;
	private Movie[] movies;
	private int sizeCustomer;
	private int sizeEmployee;
	private int sizeMovie;
	private int sizeRent;
	
	/**
	 * creates a videostore
	 */
	public VideoStore() {
		customers = new Customer[20];
		employees = new Employee[5];
		rentedMovies = new Rent[10];
		movies = new Movie[20];
		sizeCustomer = 0;
		sizeMovie = 0;
		sizeEmployee = 0;
		sizeRent = 0;
	}
	
	/**
	 * adds a customer to videostore
	 * @param customer Customer given customer
	 */
	public void addCustomer(Customer customer) {
		if(sizeCustomer == customers.length)
			resizeCustomer();
		customers[sizeCustomer] = customer;
		sizeCustomer++;
	}
	
	/**
	 * resizes customer array
	 */
	private void resizeCustomer() {
		Customer[] array = new Customer[sizeCustomer + 1];
		for(int i = 0; i < sizeCustomer; i++)
			array[i] = customers[i];
		customers = array;
	}
	
	/**
	 * adds an employee to videostore
	 * @param employee Employee given employee
	 */
	public void addEmployee(Employee employee) {
		if(sizeEmployee == employees.length)
			resizeEmployee();
		employees[sizeEmployee] = employee;
		sizeEmployee++;
	}
	
	/**
	 * resizes employee array
	 */
	private void resizeEmployee() {
		Employee[] array = new Employee[sizeEmployee + 1];
		for(int i = 0; i < sizeEmployee; i++)
			array[i] = employees[i];
		employees = array;
	}
	
	/**
	 * adds a movie to videostore
	 * @param movie Movie given movie
	 */
	public void addMovie(Movie movie) {
		if(sizeMovie == movies.length)
			resizeMovie();
		movies[sizeMovie] = movie;
		sizeMovie++;
	}
	
	/**
	 * resizes movie array
	 */
	private void resizeMovie() {
		Movie[] array = new Movie[sizeMovie + 1];
		for(int i = 0; i < sizeMovie; i++)
			array[i] = movies[i];
		movies = array;
	}
	
	/**
	 * adds a rented item to videostore
	 * @param rent Rent rented movie
	 */
	public void addRentedMovie(Rent rent) {
		if(sizeRent == rentedMovies.length)
			resizeRent();
		rentedMovies[sizeRent] = rent;
		sizeRent++;
	}
	
	/**
	 * resizes rented array
	 */
	private void resizeRent() {
		Rent[] array = new Rent[sizeRent + 1];
		for(int i = 0; i < sizeRent; i++)
			array[i] = rentedMovies[i];
		rentedMovies = array;
	}
	
	/**
	 * creates string representation of the videostore
	 * @return string
	 */
	public String printVideoStore(){
		String str = "";
		str += "VideoStore";
		str += "\n Customers: \n";
		for(int i = 0; i < sizeCustomer; i++)
			str += " " + customers[i].printCustomer();
		str += " Employees: \n";
		for(int i = 0; i < sizeEmployee; i++)
			str += " " + employees[i].printEmployee();
		str += " Movies: \n";
		for(int i = 0; i < sizeMovie; i++)
			str += " " + movies[i].printMovie();
		str += " Rented items: \n";
		for(int i = 0; i < sizeRent; i++)
			str += " " + rentedMovies[i].printRented();
		return str;
	}
	
	/**
	 * creates xml form of the videostore
	 * @param videoStore VideoStore given videostore
	 * @param os OutputStream
	 */
	public void videoStoreToXML(VideoStore videoStore, OutputStream os) {
		PrintWriter pw = new PrintWriter(os);
		pw.println("<?xml version = \"1.0\"?>");
		pw.println("<videostore>");
		pw.flush();
		for (int i = 0; i < sizeCustomer; i++) {
			pw.print("	");
			videoStore.customers[i].customerToXML(os);
		}
		for(int i = 0; i < sizeEmployee; i++) {
			pw.print("	");
			videoStore.employees[i].employeeToXML(os);
		}
		for(int i = 0; i < sizeMovie; i++) {
			pw.print("	");
			videoStore.movies[i].movieToXML(os);
		}
		for(int i = 0; i < sizeRent; i++) {
			pw.print("	");
			videoStore.rentedMovies[i].rentToXML(os);
		}
		pw.println("</videostore>");
		pw.flush();
		
	}

}
