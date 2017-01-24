import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;

public class Idean {
    public static void main(String[] args) {
        IdeanMan im = new IdeanMan();
    }
}


class IdeanMan implements ActionListener {

    JFrame frame; 
    JTextField fileName;
    JPanel filePanel;
    JButton openBtn;
    JButton saveBtn;
    JTextArea textArea;
    JScrollPane scrollPane;

    public IdeanMan() {
        frame = new JFrame("TextEditor");
        frame.setLocation(600, 50);
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        fileName = new JTextField(15);

        openBtn = new JButton("開く");
        openBtn.addActionListener(this);
        openBtn.setActionCommand("open");

        saveBtn = new JButton("保存");
        saveBtn.addActionListener(this);
        saveBtn.setActionCommand("save");

        textArea = new JTextArea(10, 30);
        scrollPane = new JScrollPane(textArea);

        filePanel = new JPanel();
        filePanel.add(fileName);
        filePanel.add(openBtn);
        filePanel.add(saveBtn);

        Container con = frame.getContentPane();
        con.setLayout(new GridLayout(2, 1));
        con.add(filePanel);
        con.add(scrollPane);

        frame.setVisible(true);
    }


    public void actionPerformed(ActionEvent ae){
        textArea.setText("ALOHA");

        String cmd = ae.getActionCommand();

        if(cmd.equals("open")) {
            textArea.setText("OPEN...");
        } else if (cmd.equals("save")) {
            textArea.setText("SAVE...");
        }
    }
}