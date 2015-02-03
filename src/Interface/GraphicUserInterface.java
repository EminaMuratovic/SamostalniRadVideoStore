package Interface;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import org.omg.PortableInterceptor.ACTIVE;

import DVD.Actor;
import DVD.Movie;
import User.Customer;
import User.Employee;
import VideoStore.VideoStore;

/**
 * This is the graphic interface of the VideoStore
 * @author eminamuratovic
 *
 */
public class GraphicUserInterface {
	public JButton customer = new JButton("Customer");
	public JButton employee = new JButton("Employee");
	public JButton movie = new JButton("Movie");
	public JButton rent = new JButton("Rent Movie");
	public JButton add = new JButton("Add");
	public JButton remove = new JButton("Remove");
	public JButton print = new JButton("All customers");
	public JButton save = new JButton("SAVE");
	public JButton actors = new JButton("Actors");
	public JTextArea display = new JTextArea();
	public JTextField name = new JTextField();
	public JTextField surname = new JTextField();
	public JTextField phone = new JTextField();
	public JTextField email = new JTextField();
	public JTextField id = new JTextField();
	public VideoStore videoStore = new VideoStore(); 
	public JTextField title;
	public JTextField genre;
	public JTextField ID;
	public JTextField rate;
	public Movie movie1;

	
	/**
	 * makes the first window of the VideoStore with four buttons
	 * Button one : Customer
	 * Button two : Employee
	 * Button three : Rent
	 * Button four : Movie
	 * @param width int with of the window
	 * @param height int height of the window
	 */
	public GraphicUserInterface(int width, int height) {
		JFrame frame = new JFrame("VideoStore");
		frame.setSize(width, height);
		frame.setResizable(false);
		JPanel panel = new JPanel();
		ButtonListener listener = new ButtonListener(); 
		customer.addActionListener(listener);
		employee.addActionListener(listener);
		movie.addActionListener(listener);
		rent.addActionListener(listener);
		panel.add(customer);
		panel.add(employee);
		panel.add(movie);
		panel.add(rent);
		panel.setVisible(true);
		frame.add(panel);
		frame.setVisible(true);
		
		
		 
		
	}
	
	/**
	 * Listens what button did the user pressed in the main window
	 * @author eminamuratovic
	 *
	 */
	private class ButtonListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			 
			/**
			 * if the user has pressed customer button then the new window pops up
			 * the new window has three buttons and one text area
			 * Button one: Add Customer
			 * Button two : Remove Customer
			 * Button three : All customers
			 */
			if(e.getSource() == customer) {
				JFrame frame = new JFrame("Customer");
				frame.setSize(400, 400);
				frame.setResizable(false);
				JPanel panel = new JPanel();
				JTextArea display = new JTextArea();
				display.setEditable(false);
				display.setLineWrap(true);
				JButton add = new JButton("Add");
				JButton remove = new JButton("Remove");
				JButton print = new JButton("All customers");
				ButtonListener1 listener = new ButtonListener1();
				add.addActionListener(listener);
				remove.addActionListener(listener);
				print.addActionListener(listener);
				panel.add(display);
				panel.add(add);
				panel.add(remove);
				panel.add(print);
				panel.setVisible(true);
				frame.add(panel);
				frame.setVisible(true);
				
			}
			
			/**
			 * if the user has pressed employee button new window pops up with three buttons and one text area
			 * Button one : Fire employee
			 * Button two : Add employee
			 * Button three : All employees
			 */
			if (e.getSource() == employee) {
				JFrame frame = new JFrame("Employee");
				frame.setSize(400, 400);
				frame.setResizable(false);
				JPanel panel = new JPanel();
				JTextArea display = new JTextArea();
				display.setEditable(false);
				display.setLineWrap(true);
				JButton add = new JButton("Hire");
				JButton remove = new JButton("Fire");
				JButton print = new JButton("All employees");
				ButtonListener4 listener = new ButtonListener4();
				add.addActionListener(listener);
				remove.addActionListener(listener);
				print.addActionListener(listener);
				panel.add(display);
				panel.add(add);
				panel.add(remove);
				panel.add(print);
				panel.setVisible(true);
				frame.add(panel);
				frame.setVisible(true);
			}
			
			/**
			 * if the user has pressed movie button new window pops up with three buttons and one text area
			 * Button one : Add movie
			 * Button two : Remove movie
			 * Button three : All movies
			 */
			if(e.getSource() == movie) {
				JFrame frame = new JFrame("Movie");
				frame.setSize(400, 400);
				frame.setResizable(false);
				JPanel panel = new JPanel();
				JTextArea display = new JTextArea();
				display.setEditable(false);
				display.setLineWrap(true);
				JButton add = new JButton("Add");
				JButton remove = new JButton("Remove");
				JButton print = new JButton("All movies");
				ButtonListener7 listener = new ButtonListener7();
				add.addActionListener(listener);
				remove.addActionListener(listener);
				print.addActionListener(listener);
				
				panel.add(display);
				panel.add(add);
				panel.add(remove);
				panel.add(print);
				panel.setVisible(true);
				frame.add(panel);
				frame.setVisible(true);
				
			}
			
			/**
			 * if the user has pressed rent button new window pops up with three buttons and one text area
			 * Button one : Rent
			 * Button two : Return
			 * Button three : All rented movies
			 */
			if(e.getSource() == rent) {
				JFrame frame = new JFrame("Rent Movie");
				frame.setSize(400, 400);
				frame.setResizable(false);
				JPanel panel = new JPanel();
				JTextArea display = new JTextArea();
				display.setEditable(false);
				display.setLineWrap(true);
				JButton add = new JButton("Rent");
				JButton remove = new JButton("Return");
				JButton print = new JButton("All rented movies");
				ButtonListener11 listener = new ButtonListener11();
				add.addActionListener(listener);
				remove.addActionListener(listener);
				print.addActionListener(listener);
				
				panel.add(display);
				panel.add(add);
				panel.add(remove);
				panel.add(print);
				panel.setVisible(true);
				frame.add(panel);
				frame.setVisible(true);
			}
		}
	}
	
	/**
	 * Listens what button did user press in customer window
	 * @author eminamuratovic
	 *
	 */
	private class ButtonListener1 implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			
			/**
			 * if the user has pressed print button then in the text area lists all customers in VideoStore
			 */
			if(e.getSource() == print) {
				display.setText("emina");
			}
			
			/**
			 * if the user has pressed remove button new window pops up with five JTextFields and one button
			 * First JTextField : name
			 * Second JTextField : surname
			 * Third JTextFields : ID
			 * Fourth JTextField : phone
			 * Fifth JTextField : email
			 * Button : save
			 */
			if(e.getSource() == remove) {
				JFrame frame = new JFrame("Remove Customer");
				frame.setSize(400, 400);
				frame.setResizable(false);
				JPanel panel = new JPanel();
				display.setEditable(false);
				display.setLineWrap(true);
				JLabel customerName = new JLabel("Name: ");
				name = new JTextField();
				JLabel customerSurname = new JLabel("Surname: ");
				surname= new JTextField();
				JLabel customerPhone = new JLabel("Phone: ");
				phone = new JTextField();
				JLabel customerEmail = new JLabel("Email: ");
				email = new JTextField();
				JLabel customerID = new JLabel("ID: ");
				id = new JTextField();
				ButtonListener3 listener = new ButtonListener3();
				save.addActionListener(listener);
				panel.add(customerName);
				panel.add(name);
				panel.add(customerSurname);
				panel.add(surname);
				panel.add(customerID);
				panel.add(id);
				panel.add(customerPhone);
				panel.add(phone);
				panel.add(customerEmail);
				panel.add(email);
				panel.add(save);
				frame.add(panel);
				frame.setVisible(true);
			}
			
			/**
			 * if the user has pressed add button new window pops up with five JTextFilds and one button
			 * First JTextField : name
			 * Second JTextField : surname
			 * Third JTextFields : ID
			 * Fourth JTextField : phone
			 * Fifth JTextField : email
			 * Button : save
			 */
			if(e.getSource() == add) {
				JFrame frame = new JFrame("Add Customer");
				frame.setSize(400, 400);
				frame.setResizable(false);
				JPanel panel = new JPanel();
				display.setEditable(false);
				display.setLineWrap(true);
				JLabel customerName = new JLabel("Name: ");
				name = new JTextField();
				JLabel customerSurname = new JLabel("Surname: ");
				surname= new JTextField();
				JLabel customerPhone = new JLabel("Phone: ");
				phone = new JTextField();
				JLabel customerEmail = new JLabel("Email: ");
				email = new JTextField();
				JLabel customerID = new JLabel("ID: ");
				id = new JTextField();
				
				ButtonListener2 listener = new ButtonListener2();
				save.addActionListener(listener);
				
				panel.add(display);
				panel.add(customerName);
				panel.add(name);
				panel.add(customerSurname);
				panel.add(surname);
				panel.add(customerID);
				panel.add(id);
				panel.add(customerPhone);
				panel.add(phone);
				panel.add(customerEmail);
				panel.add(email);
				panel.add(save);
				panel.setVisible(true);
				frame.add(panel);
				frame.setVisible(true);
			}
		}
	}
			
		
	/**
	 * Listens what user has typed in add window 
	 * @author eminamuratovic
	 *
	 */
	private class ButtonListener2 implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			
			/**
			 * if the user has pressed save button then we collect all data that he typed and save in the VideoStore by customer
			 */
			if(e.getSource() == save) {
				int customerId = Integer.parseInt(id.getText());
				String customerName = name.getText();
				String customerSurname = surname.getText();
				long customerPhone =(long)Integer.parseInt(phone.getText());
				String customerEmail = email.getText();
				Customer customer = new Customer(customerId, customerName, customerSurname, customerPhone, customerEmail);
				videoStore.addCustomer(customer);
			}
			
		}
		
	}
	
	/**
	 * Listens what user has typed in remove window 
	 * @author eminamuratovic
	 *
	 */
	private class ButtonListener3 implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			
			/**
			 * if the user has pressed save button then we collect all data that he typed and save in customer than we delete that customer
			 * if there is no customer by that name, than new window pops up with message "You don't have customer by that name!"
			 * from videostore
			 */
			if(e.getSource() == save) {
				int customerId = Integer.parseInt(id.getText());
				String customerName = name.getText();
				String customerSurname = surname.getText();
				long customerPhone =(long)Integer.parseInt(phone.getText());
				String customerEmail = email.getText();
				Customer customer = new Customer(customerId, customerName, customerSurname, customerPhone, customerEmail);
				try {
					videoStore.deleteCustomer(customer);
				} catch (Exception e1) {
					JFrame frame = new JFrame();
					frame.setSize(100, 100);
					JPanel panel = new JPanel();
					JTextArea text = new JTextArea();
					text.setText("You don't have customer by that name!");
					text.setEditable(false);
					panel.add(text);
					frame.add(panel);
					frame.setVisible(true);
				}
			}
			
		}
		
	}
	
	/**
	 * Listens what did user press in employee window
	 * @author eminamuratovic
	 *
	 */
	private class ButtonListener4 implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			
			/**
			 * if the user has pressed fire employee window new window pops up with five JTextFields and one button
			 * First JTextField : name
			 * Second JTextField : surname
			 * Third JTextFields : ID
			 * Fourth JTextField : phone
			 * Fifth JTextField : email
			 * Button : save
			 */
			if(e.getSource() == remove) {
				JFrame frame = new JFrame("Fire Employee");
				frame.setSize(400, 400);
				frame.setResizable(false);
				JPanel panel = new JPanel();
				display.setEditable(false);
				display.setLineWrap(true);
				JLabel employeeName = new JLabel("Name: ");
				name = new JTextField();
				JLabel employeeSurname = new JLabel("Surname: ");
				surname= new JTextField();
				JLabel employeePhone = new JLabel("Phone: ");
				phone = new JTextField();
				JLabel employeeEmail = new JLabel("Email: ");
				email = new JTextField();
				JLabel employeeID = new JLabel("ID: ");
				id = new JTextField();
				ButtonListener5 listener = new ButtonListener5();
				save.addActionListener(listener);
				panel.add(employeeName);
				panel.add(employeeSurname);
				panel.add(employeeID);
				panel.add(employeePhone);
				panel.add(employeeEmail);
				panel.add(save);
				frame.add(panel);
				frame.setVisible(true);
			}
			
			/**
			 * if the user has pressed hire employee window new window pops up with five JTextFields and one button
			 * First JTextField : name
			 * Second JTextField : surname
			 * Third JTextFields : ID
			 * Fourth JTextField : phone
			 * Fifth JTextField : email
			 * Button : save
			 */
			if(e.getSource() == add) {
				JFrame frame = new JFrame("Hire Employee");
				frame.setSize(400, 400);
				frame.setResizable(false);
				JPanel panel = new JPanel();
				display.setEditable(false);
				display.setLineWrap(true);
				JLabel employeeName = new JLabel("Name: ");
				name = new JTextField();
				JLabel employeeSurname = new JLabel("Surname: ");
				surname= new JTextField();
				JLabel employeePhone = new JLabel("Phone: ");
				phone = new JTextField();
				JLabel employeeEmail = new JLabel("Email: ");
				email = new JTextField();
				JLabel employeeID = new JLabel("ID: ");
				id = new JTextField();
				ButtonListener6 listener = new ButtonListener6();
				save.addActionListener(listener);
				panel.add(employeeName);
				panel.add(name);
				panel.add(employeeSurname);
				panel.add(surname);
				panel.add(employeeID);
				panel.add(id);
				panel.add(employeePhone);
				panel.add(phone);
				panel.add(employeeEmail);
				panel.add(email);
				panel.add(save);
				frame.add(panel);
				frame.setVisible(true);
			}
			
			/**
			 * if the user has pressed print button then in the text area lists all employees in VideoStore
			 */
			if(e.getSource() == print) {
				display.setText("emina");
			}
			
		}
		
	}
	
	/**
	 * Listens what did user typed in fire employee window
	 * @author eminamuratovic
	 *
	 */
	private class ButtonListener5 implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			
			/**
			 * if the user has pressed save button then we collect all data that he typed and save in employee than we delete that employee
			 * if there is no employee by that name, than new window pops up with message "You don't have employee by that name!"
			 * from videostore
			 */
			if (e.getSource() == save) {
				int empleyeeId = Integer.parseInt(id.getText());
				String employeeName = name.getText();
				String employeeSurname = surname.getText();
				long employeePhone = (long) Integer.parseInt(phone.getText());
				String employeeEmail = email.getText();
				Employee employee = new Employee(empleyeeId, employeeName,
						employeeSurname, employeePhone, employeeEmail);
				try {
					videoStore.fireEmployee(employee);
				} catch (Exception e1) {
					JFrame frame = new JFrame();
					frame.setSize(100, 100);
					JPanel panel = new JPanel();
					JTextArea text = new JTextArea();
					text.setText("You don't have employee by that name!");
					text.setEditable(false);
					panel.add(text);
					frame.add(panel);
					frame.setVisible(true);
				}
			}
			
		}
		
	}
	
	/**
	 * Listens what did user typed in hire employee window
	 * @author eminamuratovic
	 *
	 */
	private class ButtonListener6 implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			
			/**
			 * if the user has pressed save button then we collect all data that he typed and save in employee than we add that employee into the videostore
			 */
			if(e.getSource() == save) {
				int empleyeeId = Integer.parseInt(id.getText());
				String employeeName = name.getText();
				String employeeSurname = surname.getText();
				long employeePhone = (long) Integer.parseInt(phone.getText());
				String employeeEmail = email.getText();
				Employee employee = new Employee(empleyeeId, employeeName,
						employeeSurname, employeePhone, employeeEmail);
				videoStore.addEmployee(employee);
			}
			
		}
		
	}
	
	/**
	 * Listens what did user pressed in movie window
	 * @author eminamuratovic
	 *
	 */
	private class ButtonListener7 implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			
			/**
			 * if the user has pressed add button new window pops up with four JTextFields and two buttons
			 * First JTextField : title
			 * Second JTextField : genre
			 * Third JTextFields : ID
			 * Fourth JTextField : rate
			 * First Button : save
			 * Second button : Actors
			 */
			if(e.getSource() == add) {
				JFrame frame = new JFrame("Remove Button");
				frame.setSize(400, 400);
				frame.setResizable(false);
				JPanel panel = new JPanel();
				display.setEditable(false);
				display.setLineWrap(true);
				JLabel movieTitle = new JLabel("Title: ");
				title = new JTextField();
				JLabel movieGenre = new JLabel("Genre: ");
				genre= new JTextField();
				JLabel movieID = new JLabel("Movie ID: ");
				ID = new JTextField();
				JLabel movieRate = new JLabel("Rate: ");
				rate = new JTextField();
				ButtonListener9 listener = new ButtonListener9();
				save.addActionListener(listener);
				actors.addActionListener(listener);
			}
			
			/**
			 * if the user has pressed remove button new window pops up with four JTextFields and one button
			 * First JTextField : title
			 * Second JTextField : genre
			 * Third JTextFields : ID
			 * Fourth JTextField : rate
			 * Button : save
			 */
			if(e.getSource() == remove) {
				JFrame frame = new JFrame("Remove Button");
				frame.setSize(400, 400);
				frame.setResizable(false);
				JPanel panel = new JPanel();
				display.setEditable(false);
				display.setLineWrap(true);
				JLabel movieTitle = new JLabel("Title: ");
				title = new JTextField();
				JLabel movieGenre = new JLabel("Genre: ");
				genre= new JTextField();
				JLabel movieID = new JLabel("Movie ID: ");
				ID = new JTextField();
				JLabel movieRate = new JLabel("Rate: ");
				rate = new JTextField();
				ButtonListener8 listener = new ButtonListener8();
				save.addActionListener(listener);
				panel.add(movieTitle);
				panel.add(title);
				panel.add(movieGenre);
				panel.add(genre);
				panel.add(movieID);
				panel.add(ID);
				panel.add(movieRate);
				panel.add(rate);
				panel.add(save);
				frame.add(panel);
				frame.setVisible(true);
			}
			
			/**
			 * if the user has pressed print button then in the text area lists all movies in VideoStore
			 */
			if(e.getSource() == print) {
				display.setText("emina");
			}
			
		}
		
	}
	
	/**
	 * Listens what did user typed in remove button window
	 * @author eminamuratovic
	 *
	 */
	private class ButtonListener8 implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			
			/**
			 * if user has pressed save button we collect all data from movie and delete it from videostore
			 * if there is no movie with given data, then new window pops up with text "You don't have movie with that data in videostore!"
			 */
			if(e.getSource() == save) {
				String mTitle = title.getText();
				String mGenre = genre.getText();
				int mId = Integer.parseInt(ID.getText());
				int mRate = Integer.parseInt(rate.getText());
				movie1 = new Movie(mId, mTitle, mGenre, mRate);
				try {
					videoStore.removeMovie(movie1);
				} catch (Exception e1) {
					JFrame frame = new JFrame();
					frame.setSize(400, 400);
					JPanel panel = new JPanel();
					JTextArea text = new JTextArea("You don't have movie with that data in videostore!");
					text.setEditable(false);
					panel.add(text);
					frame.add(panel);
					frame.setVisible(true);
				}
			}
			
		}
		
	}
	
	/**
	 * Listens what user did pressed or typed in add movie window
	 * @author eminamuratovic
	 *
	 */
	private class ButtonListener9 implements ActionListener {

		String mTitle = title.getText();
		String mGenre = genre.getText();
		int mId = Integer.parseInt(ID.getText());
		int mRate = Integer.parseInt(rate.getText());
				
		
		@Override
		public void actionPerformed(ActionEvent e) {
			
			/**
			 * if user has pressed save button we collect data for the move and save it to videostore
			 */
			if(e.getSource() == save) {
				movie1 = new Movie(mId, mTitle, mGenre, mRate);
				videoStore.addMovie(movie1);
			}
			
			/**
			 * if user has pressed actor button new window pops up with two JTextFields and one button
			 * First JTextField : name
			 * Second JTextField : surname
			 * Button : save
			 */
			if(e.getSource() == actors) {
				JFrame frame = new JFrame("Actor");
				frame.setSize(400, 400);
				frame.setResizable(false);
				JPanel panel = new JPanel();
				display.setEditable(false);
				display.setLineWrap(true);
				JLabel actorName = new JLabel("Name: ");
				name = new JTextField();
				JLabel actorSurname = new JLabel("Surname: ");
				surname= new JTextField();
				ButtonListener10 listener = new ButtonListener10();
				save.addActionListener(listener);
				panel.add(actorName);
				panel.add(name);
				panel.add(actorSurname);
				panel.add(surname);
				panel.add(save);
				frame.add(panel);
				frame.setVisible(true);
			}
			
		}
		
	}
	
	/**
	 * Listens what did user typed in actor window
	 * @author eminamuratovic
	 *
	 */
	private class ButtonListener10 implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			
			/**
			 * if user has pressed save button we collect all data from actor and we save it to existing movie
			 */
			if(e.getSource() == save) {
				String actorName = name.getText();
				String actorSurname = surname.getText();
				Actor actor = new Actor(actorName, actorSurname);
				movie1.addActor(actor);
			}
			
		}
		
	}
	
	/**
	 * Listens what did user pressed in Rent Movie window
	 * @author eminamuratovic
	 *
	 */
	private class ButtonListener11 implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			
			/**
			 * if the user has pressed add button new window pops up with five JTextFields and one button
			 * First JTextField : movie id
			 * Second JTextField : customer id
			 * Third JTextField : date
			 * Fourth JTextField : employee id
			 * Fifth JTextField : payed
			 * Button : save
			 */
			if(e.getSource() == add) {
				JFrame frame = new JFrame();
				frame.setSize(400, 400);
				JPanel panel = new JPanel();
				JLabel movieid = new JLabel("Movie ID: ");
				JLabel customerid = new JLabel("Customer ID: ");
				JLabel date = new JLabel("Date: ");
				JLabel employeeid = new JLabel("Employee ID: ");
				JLabel payed = new JLabel("Payed: ");
				ButtonListener12 listener = new ButtonListener12();
				save.addActionListener(listener);
				
			}
			
			/**
			 * if the user has pressed add button new window pops up with five JTextFields and one button
			 * First JTextField : movie id
			 * Second JTextField : customer id
			 * Third JTextField : date
			 * Fourth JTextField : employee id
			 * Fifth JTextField : payed
			 * Button : save
			 */
			if(e.getSource() == remove) {
				
			}
			
			/**
			 * if the user has pressed print button then in the text area lists all rented movies in VideoStore
			 */
			if(e.getSource() == print) {
				display.setText("emina");
			}
			
		}
		
	}
	


}
