import java.awt.*;  
import java.awt.event.*;  
public class MouseListenerExample2 extends Frame{  
    MouseListenerExample2(){  
        // addMouseListener(this);  
          
        setSize(300,300);  
        setLayout(null);  
        setVisible(true);  
        addWindowListener(
            new WindowAdapter() {
                public void windowClosing(WindowEvent e) {
                    dispose();
                }
            }
        );
        addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("Mouse Clicked");
            }

            @Override
            public void mousePressed(MouseEvent e) {
                System.out.println("Mouse Pressed");
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                System.out.println("Mouse Released");
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                System.out.println("Mouse Entered");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                System.out.println("Mouse Exited");
            }
        });

    }  
    // public void mouseClicked(MouseEvent e) {  
    //     Graphics g=getGraphics();  
    //     g.setColor(Color.BLUE);  
    //     g.fillOval(e.getX(),e.getY(),30,30);  
    // }  
    // public void mouseEntered(MouseEvent e) {}  
    // public void mouseExited(MouseEvent e) {}  
    // public void mousePressed(MouseEvent e) {}  
    // public void mouseReleased(MouseEvent e) {}  

    
      
public static void main(String[] args) {  
    new MouseListenerExample2();  
}  
}  