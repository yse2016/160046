import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;

public class Idean{
    public static void main(String[] args){
        IdeanMan im = new IdeanMan();
    }
}

class IdeanMan implements ActionListener{
    JFrame frame;
    JButton btnOpen;
    JButton btnSave;
    JTextArea area;
    JTextArea area2;
    JTextArea textArea;    
    JPanel btnPanel;
    JPanel panel;
    JLabel word1;
    JLabel word2;
    JPanel wordsPanel;
    JTextField field;
    JScrollPane scrollPane;
    String filedata;
    String textdata;
    int num;

    
    public IdeanMan(){
        frame = new JFrame("Idean");
        frame.setLocation(400,400);
        frame.setSize(450,450);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        btnOpen = new JButton("Open");
        btnOpen.addActionListener(this);
        btnOpen.setActionCommand("open");  

        btnSave = new JButton("Save");
        btnSave.addActionListener(this);
        btnSave.setActionCommand("save");

        btnPanel = new JPanel();
        btnPanel.add(btnOpen);
        btnPanel.add(btnSave);

        field = new JTextField(20);

        word1 = new JLabel("WORD1");
        word2 = new JLabel("WORD2");
        wordsPanel = new JPanel();
        wordsPanel.add(word1);
        wordsPanel.add(word2);
        word1.setText("ALOHA");
        word2.setText("Good Afternoon");

        area = new JTextArea(10,30);
        area2 = new JTextArea(5,20);
        area.setLineWrap(true);

        textArea = new JTextArea(5, 20);

        scrollPane = new JScrollPane(textArea);

        panel = new JPanel();
        panel.add(field);
        panel.add(btnOpen);
        panel.add(btnSave);
        panel.add(area2);

        num = (int)(Math.random()*10);

        Container con = frame.getContentPane();
        con.setLayout(new GridLayout(2,1));
        con.add(panel);
        con.add(wordsPanel);
        con.add(btnPanel);
        con.add(scrollPane);

        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){
        String cmd = ae.getActionCommand();
        if(cmd.equals("open")){
            JFileChooser fc = new JFileChooser();

            fc.setCurrentDirectory(new File("."));

            int ret = fc.showOpenDialog(frame);
            if(ret == JFileChooser.APPROVE_OPTION){

                File file = fc.getSelectedFile();
                filedata = file.getAbsolutePath();
                field.setText(filedata);
            }

            try {
                File inFile                 = new File(filedata);
                FileReader fr               = new FileReader(inFile);
                BufferedReader br           = new BufferedReader(fr);

                String line;
                while((line = br.readLine()) != null){
                    area.append(line);
                    area.append("\n");
                }

                br.close();

            } catch(IOException e){
                System.out.println("IO Error");
            }
        }else if (cmd.equals("save")){
        
            JFileChooser fc = new JFileChooser();

        
            fc.setCurrentDirectory(new File("."));

            
            int ret = fc.showSaveDialog(frame);

        
            if(ret == JFileChooser.APPROVE_OPTION){
            
                File file = fc.getSelectedFile();
                
                filedata = file.getAbsolutePath();
            }

            textdata = area.getText();
            try {
                File outFile = new File(filedata);
                FileWriter fw = new FileWriter(outFile);
                BufferedWriter bw = new BufferedWriter(fw);
                PrintWriter pw = new PrintWriter(bw);

                area2.setText(textdata);
                pw.println(textdata);

                pw.close();

            } catch(IOException e){
                System.out.println("IO Error");
            }
        }
    }
}