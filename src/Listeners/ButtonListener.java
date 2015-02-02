package Listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import Listeners.ButtonListener1;


    //public class ButtonListener implements ActionListener {
// 
//
//	@Override
//	public void actionPerformed(ActionEvent e) {
//		if(e.getSource() == customer) {
//			JFrame frame = new JFrame("Customer");
//			frame.setSize(400, 400);
//			frame.setResizable(false);
//			JPanel panel = new JPanel();
//			JTextArea display = new JTextArea();
//			display.setEditable(false);
//			display.setLineWrap(true);
//			JButton add = new JButton("Add");
//			JButton remove = new JButton("Remove");
//			JButton print = new JButton("All customers");
//			panel.add(display);
//			panel.add(add);
//			panel.add(remove);
//			panel.add(print);
//			panel.setVisible(true);
//			frame.add(panel);
//			frame.setVisible(true);
//			ButtonListener1 listener = new ButtonListener1();
//			add.addActionListener(listener);
//			remove.addActionListener(listener);
//			print.addActionListener(listener);
//			if(e.getSource() == print) {
//				display.setText("emina");
//			}
//			
//		}
//		if(e.getSource() == employee) {
//			
//		}
//		if(e.getSource() == movie) {
//			
//		}
//		if(e.getSource() == rent) {
//			
//		}
//	}
//	
//}