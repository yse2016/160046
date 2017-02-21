import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;

public class Idean {
    public static void main(String[] args) {
        IdeanMan im = new IdeanMan();
    }
}

<<<<<<< HEAD

class IdeanMan implements ActionListener {
    // field
    JFrame frame;
    JTextField fileName;
    JLabel word1;
    JLabel word2;
    JPanel worldsPanel;
    JPanel btnPanel;
    JButton openBtn;
    JButton saveBtn;
    JButton nextBtn;
    JButton pasteBtn;
    JTextArea textArea;
    JTextArea tango1;
    JTextArea tango2;
    JScrollPane scrollPane;


    // method
    public IdeanMan() {
        // ウィンドウを作る
        frame = new JFrame("Idean");
        frame.setLocation(600, 50);
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // フィールド、パネルを作る
        fileName = new JTextField("", 15);

        // ボタンを作る
        openBtn = new JButton("開く");
        openBtn.addActionListener(this);
        openBtn.setActionCommand("open");

        saveBtn = new JButton("保存");
        saveBtn.addActionListener(this);
        saveBtn.setActionCommand("save");

        nextBtn = new JButton("次へ");
        nextBtn.addActionListener(this);
        nextBtn.setActionCommand("next");

        pasteBtn = new JButton("貼り付け");
        pasteBtn.addActionListener(this);
        pasteBtn.setActionCommand("paste");

        // テキストエリア、スクロールを作る
        textArea = new JTextArea(10, 30);
        tango1 = new JTextArea(1, 10);
        tango2 = new JTextArea(1, 10);
        scrollPane = new JScrollPane(textArea);

        word1 = new JLabel("WORD1");
        word2 = new JLabel("WORD2");

        // パネルに、フィールドを載せる
        worldsPanel = new JPanel();
        worldsPanel.add(tango1);
        worldsPanel.add(word1);
        worldsPanel.add(tango2);
        worldsPanel.add(word2);

        btnPanel = new JPanel();
        btnPanel.add(openBtn);
        btnPanel.add(saveBtn);
        btnPanel.add(nextBtgithubn);
        btnPanel.add(pasteBtn);

        // ウィンドウに、パネルを載せる
        Container con = frame.getContentPane();
        con.setLayout(new GridLayout(3, 1));
        con.add(worldsPanel);
=======
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
>>>>>>> createjs
        con.add(btnPanel);
        con.add(scrollPane);

        // ウィンドウを可視化する
        frame.setVisible(true);
    }


public void actionPerformed(ActionEvent ae) {
        // 必要なデータを作る
        String cmd = ae.getActionCommand();
        String textFileName = "IdeaMan.txt";
        String data;
        String tangoDam = "words.txt";

        File inFile = new File("words.txt");
        FileInputStream fis = null;
        InputStreamReader isr = null;
        FileReader fr = null;
        BufferedReader br = null;

        FileOutputStream fo = null;
        OutputStreamWriter ow = null;
        BufferedWriter bw = null;
        FileWriter fw = null;
        PrintWriter pw = null;

        if (cmd.equals("open")) {
/*            上書きから付け足し
            textArea.setText("OPEN...");
            textArea.append("OPEN..." + '\n');
*/
            // ｢ファイルを開く｣を開く
            JFileChooser fc = new JFileChooser();

            // 表示するdirをきめる
            fc.setCurrentDirectory(new File("."));

            // ダイアログを作る
            int ret = fc.showOpenDialog(frame);

            // 選ばれたファイルを、調べる
            if (ret == JFileChooser.APPROVE_OPTION) {
                // 選ばれたファイル
                File file = fc.getSelectedFile();
<<<<<<< HEAD
=======
                filedata = file.getAbsolutePath();
                field.setText(filedata);
            }

            try {
                File inFile                 = new File(filedata);
                FileReader fr               = new FileReader(inFile);
                BufferedReader br           = new BufferedReader(fr);
>>>>>>> createjs

                // ファイル名、保存場所を調べる
                textFileName = file.getAbsolutePath();

                // テキストフィールドに表示
                fileName.setText(textFileName);
            }

            try{
                fr = new FileReader(textFileName);
                br = new BufferedReader(fr);

                while((data = br.readLine()) != null) {
                    textArea.append(data + '\n');
                }
            } catch(IOException e) {
                System.out.println("IO error...");
            }
        } else if (cmd.equals("save")) {
            try{
                // ファイルを開く
                fo = new FileOutputStream("IdeaMan.txt");
                ow = new OutputStreamWriter(fo, "UTF-8");
                bw = new BufferedWriter(ow);
                pw = new PrintWriter(bw);

                // テキストエリアの内容を読み取る
                data = textArea.getText();
                
                // ファイルに書き込み、保存する
                pw.println(data);
            } catch(IOException e) {
                System.out.println("IO error...");
            } finally {
                // ファイルを閉じる
                try{
//                    fo.close();
//                    ow.close();
                    bw.close();
                    pw.close();
                } catch(IOException e) {
                    System.out.println("IO ClosingError...");
                }
            }
        } else if (cmd.equals("next")) {
            try{
                fis = new FileInputStream(inFile);
                isr = new InputStreamReader(fis, "UTF-8");
                br = new BufferedReader(isr);

                while( (data = br.readLine()) != null ){
                    String[] data2;
                    int kz = 16;
                    int num1;
                    int num2;

                    data2 = data.split(", ");
                    num1 = (int)(Math.random()*kz);
                    num2 = (int)(Math.random()*kz);

                    tango1.setText(data2[num1]);
                    tango2.setText(data2[num2]);
                }
            } catch(IOException e) {
                System.out.println("IOerrer");
            }
        } else if (cmd.equals("paste")) {
            String text1;
            String text2;

            text1 = tango1.getText();
            text2 = tango2.getText();

            textArea.append(text1 + "," + text2 + '\n');
        }
    }
}

