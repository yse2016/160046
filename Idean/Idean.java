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
	JButton btn;
	JPanel panel;
	JTextArea area;
	JScrollPane scrollPAne;
	String filedata;
	String textdata;

	public IdeanMan() {
		frame = new JFrame("Idean");
		frame.setLocation(400,300);
		frame.setSize(500,400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void actionPerformed(ActionEvent ae){

	}
}
