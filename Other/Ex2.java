// Create a frame using AWT. Implement mouseClicked, mousepressed() mouseReleased(), mouseEntered() and mouseExited() events. Frame should become visible when the mouse enters it.

import java.awt.*;
import java.awt.event.*;

public class Ex2 extends Frame implements MouseListener {
    Label l;
    TextArea area;

    Ex2() {
        l = new Label();
        l.setBounds(20, 50, 200, 20);
        area = new TextArea();
        area.setBounds(20, 80, 300, 300);
        area.addMouseListener(this);

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
    public void mouseClicked(MouseEvent e) {
        // TODO Auto-generated method stub
        l.setText("Mouse Clicked");

    }

    @Override
    public void mousePressed(MouseEvent e) {
        // TODO Auto-generated method stub
        l.setText("Mouse Pressed");

    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // TODO Auto-generated method stub
        l.setText("Mouse Released");

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // TODO Auto-generated method stub
        l.setText("Mouse Entered");

    }

    @Override
    public void mouseExited(MouseEvent e) {
        // TODO Auto-generated method stub
        l.setText("Mouse Exited");

    }

    public static void main(String[] args) {
        new Ex2();
    }

}