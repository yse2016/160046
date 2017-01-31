import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;

public class Test{
	public static void main(String[] args){
		TestMan man = new TestMan();
	}
}


class TestMan implements ActionListener{
	JFrame frame;
	JTextField fileName;
	JPanel filePanel;
	JButton oneBtn;
	JButton twoBtn;
	JButton threeBtn;
	JButton fourBtn;
	JTextArea textArea;
	JScrollPane scrollPane;


	public TestMan(){
		frame = new JFrame("クイズ");
		frame.setLocation(555, 150);
		frame.setSize(500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		fileName = new JTextField("問:次の野菜のうちその名前が英語なのはどれか？", 40);

		oneBtn = new JButton(" ナス ");
		oneBtn.addActionListener(this);
		oneBtn.setActionCommand("1");

		twoBtn = new JButton("オクラ ");
		twoBtn.addActionListener(this);
		twoBtn.setActionCommand("2");

		threeBtn = new JButton(" カブ ");
		threeBtn.addActionListener(this);
		threeBtn.setActionCommand("3");

		fourBtn = new JButton("キュウリ");
		fourBtn.addActionListener(this);
		fourBtn.setActionCommand("4");

		textArea = new JTextArea(10, 30);

		scrollPane = new JScrollPane(textArea);

		filePanel = new JPanel();
		filePanel.add(fileName);
		filePanel.add(oneBtn);
		filePanel.add(twoBtn);
		filePanel.add(threeBtn);
		filePanel.add(fourBtn);

		Container con = frame.getContentPane();
		con.setLayout(new GridLayout(2, 1));
		con.add(filePanel);
		con.add(scrollPane);

		frame.setVisible(true);
	}


	public void actionPerformed(ActionEvent ae){
		String cmd = ae.getActionCommand();

		if(cmd.equals("1")){
			textArea.setText("不正解");

		}else if(cmd.equals("2")){
			textArea.setText("正解");

		}else if (cmd.equals("3")){
			textArea.setText("不正解");

		}else if (cmd.equals("4")){
			textArea.setText("不正解");
		}
	}
}
