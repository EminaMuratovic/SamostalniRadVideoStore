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
	 * deletes customer from the videoStore
	 * @param customer Customer
	 */
	public void deleteCustomer(Customer customer) {
		for(int i = 0; i < sizeCustomer; i++) {
			if(customers[i] == customer) {
				for(int j = i; j < sizeCustomer; j++)
					customers[j] = customers[j + 1];
				break;
			}
		}
		sizeCustomer--;
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
	 * fires the employee from the videoStore
	 * @param employee Employee
	 */
	public void fireEmployee(Employee employee) {
		for(int i = 0; i < sizeEmployee; i++) {
			if(employees[i] == employee) {
				for(int j = i; j < sizeEmployee; j++)
					employees[j] = employees[j + 1];
				break;
			}
		}
		sizeEmployee--;
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
	 * removes movie from videostore
	 * @param movie Movie
	 */
	public void removeMovie(Movie movie) {
		for(int i = 0; i < sizeMovie; i++) {
			if(movies[i] == movie) {
				for(int j = i; j < sizeMovie; j++)
					movies[j] = movies[j + 1];
				break;
			}
		}
		sizeMovie--;
			
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
	 * adds a rented item to videostore and removes movie from the movie library
	 * @param rent Rent rented movie
	 */
	public void addRentedMovie(Rent rent) {
		if(sizeRent == rentedMovies.length)
			resizeRent();
		rentedMovies[sizeRent] = rent;
		for(int i = 0; i < sizeMovie; i++) {
			if(movies[i].getMovieID() == rent.getMovieID()) {
				for(int j = i ; j < sizeMovie; j++)
					movies[j] = movies[j + 1];
				break;
			}
		}
		sizeRent++;
		//sizeMovie--;
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
	 * returns rented movie to videoStore 
	 * @param rent Rent
	 */
	public void returnRentedItem(Rent rent) {
		for(int i = 0; i < sizeRent; i++) {
			if(rentedMovies[i] == rent) {
				for(int j = i; j < sizeRent; j++)
					rentedMovies[j] = rentedMovies[j + 1];
				break;
			}
		}
		sizeRent--;
		//sizeMovie++;
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
	
	/**
	 * prints all customers in the videostore
	 * @return string
	 */
	public String printCustomers() {
		String str = "";
		for(int i = 0; i < sizeCustomer; i++) {
			str += customers[i].printCustomer();
		}
		return str;
	}
	
	/**
	 * prints all movies in the videostore
	 * @return string
	 */
	public String printMovies() {
		String str = "";
		for(int i = 0; i < sizeMovie; i++)
			str += movies[i].printMovie();
		return str;
	}
	
	/**
	 * print employees in the videostore
	 * @return string
	 */
	public String printEmployees() {
		String str = "";
		for(int i = 0; i < sizeEmployee; i++) 
			str += employees[i].printEmployee();
		return str;
	}
	
	/**
	 * print all rented movies in the videostore
	 * @return string
	 */
	public String printRentedMovies() {
		String str = "";
		for(int i = 0; i < sizeRent; i++)
			str += rentedMovies[i].printRented();
		return str;
			
	}

}
