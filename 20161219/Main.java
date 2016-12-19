import java.awt.FlowLayout;
import javax.swing.*;

public class Main {
	public static void main(String[] args) {

		// 0.
		JFrame frame = new JFrame("はじめてのGUI");
		JLabel label = new JLabel("Hello World!!");
		JButton button = new JButton("button");
		// 1.GUIをつくる

		frame.getContentPane().setLayout(new FlowLayout());
		frame.getContentPane().add(button);
		frame.getContentPane().add(label);

		// 2.close設定(閉じたら終了する)
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 3.windowサイズを設定する
		frame.setSize(300, 200);

		// 4.windowを見えるように(visible)する
		frame.setVisible(true);
	}
}
