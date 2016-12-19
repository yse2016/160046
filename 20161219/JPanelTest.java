// JPanelTest.java

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

						// ↓継承する・拡張する
public class JPanelTest extends JFrame{
	// コントラクタ(特別メソッド; 初期化)
	public JPanelTest(){
		setSize(400, 300);
		setTitle("JPanelのテスト");

		// パネルを新規作製
		MyJPanel myjp = new MyJPanel();	
		Container c = getContentPane();

		// ラベルを張り付ける
		c.add(myjp);
	}

	// mainメソッド
	public static void main(String[] args) {
		JFrame w = new JPanelTest();
		w.show();
	}
}


class MyJPanel extends JPanel {
	public void paintComponent(g);
	g.drawString("ALOHA", 20, 40);
}
