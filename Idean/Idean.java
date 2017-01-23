import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;

public class Idean {
	public static void main(String[] args) {
		IdeanMan im = new IdeanMan();
	}
}


class IdeanMan implements ActionListener{
	JFrame frame;
	JButton btnOpen;
	JButton btnSave;
	JPanel panel;
	JTextArea area;
	JTextArea area2;
	JScrollPane scrollPAne;
	String filedata;
	String textdata;

	public IdeanMan() {
		frame = new JFrame("Idean");
		frame.setLocation(400,300);
		frame.setSize(500,400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		btnOpen = new JButton("Open data");
		btnSave = new JButton("Save data");

		field = new JTextField(20);
		area = new JTextArea(10,30);
		area2 = new JTextArea(5,20);
		area.setLineWrap(true);

		panel = new JPanel();
		panel.add(field);
		panel.add(btnOpen);
		panel.add(btnSave);
	}

	public void actionPerformed(ActionEvent ae){

	}
}
