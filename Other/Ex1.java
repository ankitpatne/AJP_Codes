// Design GUI to demonstrate the status of key on an AWT window such as KeyPressed, KeyReleased, KeyTyped using JAVA programming.

import java.awt.*;
import java.awt.event.*;

public class Ex1 extends Frame implements KeyListener {
    Label l;
    TextArea area;

    Ex1() {
        l = new Label();
        l.setBounds(20, 50, 200, 20);
        area = new TextArea();
        area.setBounds(20, 80, 300, 300);
        area.addKeyListener(this);

        add(l);
        add(area);
        setSize(400, 400);
        setLayout(null);
        setVisible(true);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }
    
    @Override
    public void keyTyped(KeyEvent e) {
        // TODO Auto-generated method stub
        l.setText("Key Typed");

    }

    @Override
    public void keyPressed(KeyEvent e) {
        // TODO Auto-generated method stub
        l.setText("Key Pressed");

    }


    @Override
    public void keyReleased(KeyEvent e) {
        // TODO Auto-generated method stub
        l.setText("Key Released");

    }

    public static void main(String[] args) {
        new Ex1();
    }

}