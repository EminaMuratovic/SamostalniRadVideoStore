package Interface;

import java.awt.DisplayMode;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import User.Customer;
import VideoStore.VideoStore;

public class GraphicUserInterface {
	private JButton customer = new JButton("Customer");
	private JButton employee = new JButton("Employee");
	private JButton movie = new JButton("Movie");
	private JButton rent = new JButton("Rent Movie");
	private JButton add = new JButton("Add");
	private JButton remove = new JButton("Remove");
	private JButton print = new JButton("All customers");
	private JTextArea display = new JTextArea();
	private JTextField name = new JTextField();
	private JTextField surname = new JTextField();
	private JTextField phone = new JTextField();
	private JTextField email = new JTextField();
	private JTextField id = new JTextField();
	

	
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

	private class ButtonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == customer) {
				JFrame frame = new JFrame("Customer");
				frame.setSize(400, 400);
				frame.setResizable(false);
				JPanel panel = new JPanel();
				display.setEditable(false);
				display.setLineWrap(true);
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
			if(e.getSource() == employee) {
				
			}
			if(e.getSource() == movie) {
				
			}
			if(e.getSource() == rent) {
				
			}
		}
		
	}
	
	private class ButtonListener1 implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == print) {
				display.setText("emina");
			}
			if(e.getSource() == remove) {
				
			}
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
				JButton save = new JButton("SAVE");
				ButtonListener2 listener = new ButtonListener2();
			}
			
		}
		
	}
	
	private class ButtonListener2 implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == save) {
				Customer customer = new Customer(customerId, customerName, customerSurname, customerPhone, customerEmail);
			}
			
		}
		
	}

}
