package WorkWithFiles;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Date;

import User.Customer;
import User.Employee;
import Rent.Rent;
import VideoStore.VideoStore;
import DVD.Actor;
import DVD.Movie;

/**
 * This class saves data in the file
 * @author User
 *
 */
public class SaveToFile {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		//actors
		Actor actor1 = new Actor("Angelina", "Jolie");
		Actor actor2 = new Actor("Angelina1", "Jolie1");
		Actor actor3 = new Actor("Angelina2", "Jolie2");
		
		//employees
		Employee employee1 = new Employee(1, "Safet", "Muratovic", 62966922, "safetmuratovic@gmail.com");
		Employee employee2 = new Employee(2, "Safet1", "Muratovic1", 62966922, "safetmuratovic@gmail.com");
		Employee employee3 = new Employee(3, "Safet2", "Muratovic2", 62966922, "safetmuratovic@gmail.com");
	
		//customers
		Customer customer1 = new Customer(1, "Alma", "Muratovic", 603171665, "almamuratovic@hotmail.com");
		Customer customer2 = new Customer(2, "Alma1", "Muratovic1", 603171665, "almamuratovic@hotmail.com");
		Customer customer3 = new Customer(3, "Alma2", "Muratovic2", 603171665, "almamuratovic@hotmail.com");
		
		//movies
		Movie movie1 = new Movie(1, "22JumpStreet", "comedy", 4);
		Movie movie2 = new Movie(2, "Mirrors", "horror", 3);
		Movie movie3 = new Movie(3, "Need for Speed", "action", 5);
		
		
		movie1.addActor(actor1);
		movie2.addActor(actor2);
		movie3.addActor(actor3);
		
		//rented items
		Rent rent1 = new Rent(movie1.getMovieID(), customer1.getCustomerId(), new Date(2015, 8, 5), employee1.getEmpleyeeId(), true);
		Rent rent2 = new Rent(movie1.getMovieID(), customer1.getCustomerId(), new Date(2015, 8, 5), employee1.getEmpleyeeId(), true);
		Rent rent3 = new Rent(movie1.getMovieID(), customer1.getCustomerId(), new Date(2015, 8, 5), employee1.getEmpleyeeId(), true);
		
		VideoStore videoStore = new VideoStore();
		videoStore.addCustomer(customer1);
		videoStore.addCustomer(customer2);
		videoStore.addCustomer(customer3);
		videoStore.addEmployee(employee1);
		videoStore.addEmployee(employee2);
		videoStore.addEmployee(employee3);
		videoStore.addMovie(movie1);
		videoStore.addMovie(movie2);
		videoStore.addMovie(movie3);
		videoStore.addRentedMovie(rent1);
		videoStore.addRentedMovie(rent2);
		videoStore.addRentedMovie(rent3);
		
		try {
	 		videoStore.videoStoreToXML(videoStore, new FileOutputStream("./VideoStoreXML/VideoStore.xml"));
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

}
