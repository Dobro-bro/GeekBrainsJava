package Lesson4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ChatWindow extends JFrame implements ActionListener {
    final String TITLE_OF_PROGRAM = "Chat Test";
    final int WINDOW_WIDTH = 350;
    final int WINDOW_HEIGHT = 450;
    final String BUTTON_ENTER = "Enter";


    JTextArea dialogue;
    JTextField message;

    public static void main(String[] args) {
        new ChatWindow();
    }


    ChatWindow() {
        setTitle(TITLE_OF_PROGRAM);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setLocationRelativeTo(null);

        dialogue = new JTextArea();
        dialogue.setEditable(false);
        JScrollPane scrollBar = new JScrollPane(dialogue);

        JPanel bp = new JPanel();
        bp.setLayout(new BoxLayout(bp, BoxLayout.X_AXIS));
        message = new JTextField();
        message.addActionListener(this);
        JButton enter = new JButton(BUTTON_ENTER);
        enter.addActionListener(this);

        bp.add(message);
        bp.add(enter);
        add(BorderLayout.CENTER, scrollBar);
        add(BorderLayout.SOUTH, bp);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (message.getText().trim().length() > 0)
           dialogue.append(message.getText() + "\n");

        message.setText("");
        message.requestFocusInWindow();
    }

}
