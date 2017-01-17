import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;

public class TextEditor {
    public static void main(String[] args) {
        TextEditorMan tem = new TextEditorMan();
    }
}



class TextEditorMan implements ActionListener {
    // field
    JFrame frame; 
    JTextField fileName;
    JPanel filePanel;
    JButton openBtn;
    JButton saveBtn;
    JTextArea textArea;
    JScrollPane scrollPane;

    // method
    public TextEditorMan() {
        // ウィンドウを作る
        frame = new JFrame("TextEditor");
        frame.setLocation(600, 50);
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // フィールド、パネルを作る
        fileName = new JTextField("ALOHA!", 15);

        openBtn = new JButton("開く");
        openBtn.addActionListener(this);
        openBtn.setActionCommand("open");

        saveBtn = new JButton("保存");
        saveBtn.addActionListener(this);
        saveBtn.setActionCommand("save");

        textArea = new JTextArea(10, 30);
        scrollPane = new JScrollPane(textArea);

        // のせる
        // パネルに、フィールドを載せる
        filePanel = new JPanel();
        filePanel.add(fileName);
        filePanel.add(openBtn);
        filePanel.add(saveBtn);


        // ウィンドウに、パネルを載せる
        Container con = frame.getContentPane();
        con.setLayout(new GridLayout(2, 1));
        con.add(filePanel);
        con.add(scrollPane);

        // ウィンドウを可視化する
        frame.setVisible(true);
    }



    public void actionPerformed(ActionEvent ae){
        // テキストエリアに書き込む
        textArea.setText("Aloha!");

        // コマンドを、調べる
        String cmd = ae.getActionCommand();

        // もし、、、なら、、、
        if(cmd.equals("open")) {
            textArea.setText("OPEN...");
        } else if (cmd.equals("save")) {
            textArea.setText("SAVE...");
        }
    }
}