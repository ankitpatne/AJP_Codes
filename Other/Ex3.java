import javax.swing.*;
import java.awt.event.*;

public class Ex3 {
    JFrame frame;
    JTextField tf1, tf2, tf3;
    JButton button;

    Ex3() {
        frame = new JFrame("Enter Marks");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tf1 = new JTextField();
        tf1.setBounds(50, 50, 150, 20);
        tf2 = new JTextField();
        tf2.setBounds(50, 100, 150, 20);
        tf3 = new JTextField();
        tf3.setBounds(50, 150, 150, 20);
        button = new JButton("Submit");
        button.setBounds(50, 200, 95, 30);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int marks1 = Integer.parseInt(tf1.getText());
                int marks2 = Integer.parseInt(tf2.getText());
                int marks3 = Integer.parseInt(tf3.getText());
                int total = marks1 + marks2 + marks3;

                JOptionPane.showMessageDialog(frame, "Total Marks: " + total, "Result", JOptionPane.WARNING_MESSAGE);
            }
        });

        frame.add(tf1);
        frame.add(tf2);
        frame.add(tf3);
        frame.add(button);
        frame.setSize(300, 300);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new Ex3();
    }
}