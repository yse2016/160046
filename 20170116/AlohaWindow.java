import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AlohaWindow {
	public static void main(String[] args) {
		AlohaWindowMan man = new AlohaWindowMan();
	}
}


class AlohaWindowMan implements ActionListener{
	JFrame frame;
	JButton button;
	JButton btnOpen;
	JButton btnSave;
	JPanel panel;
	JTextField fileNameField;
	JtextArea textArea;
	JScrollPanel scrollPanel;
	FileReader fr;
	BufferedReader br;

	public AlohaWindowMan() {
		frame = new JFrame("AlohaWindow");
		frame.setLocation(400, 400);
		frame.setSize(300, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		button = new JButton("Click Me!");
		btnOpen.setActionCommand("open");
		btnSave.setActionCommand("save");

		fileNameField = new JTextField("ALOHA", 20);

		panel = new JPanel();
		panel.add(fileNameField);
		panel.add(button);

		Container con = frame.getContentPane();
		con.setLayout(new GridLayout(2, 1));
		con.add(panel);

		textArea = new JTextArea(10, 30);
		scrollPanel = new JScrollPanel(textArea);
		con.add(scrollPanel);

		frame.setVisible(true);
	}

	public void ActionPerformed(ActionEvent ae) {
		try {
			String textFile = fileName.getText();
			fr = new FileReader("AlohaWindow.java");
			br = new BufferedReader(fr);

			String data = br.readLine();
			textArea.setText(data);
		} catch(IOException e) {
			System.out.println("IO error.");
		}

		String cmd = ae.getActionCommand();
		fileNameField.setText("Hello");

		String data;

		while((data = br.readLine()) != null) {
			textArea.append(data + '\n');
		}
	}
}