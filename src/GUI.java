import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;

public class GUI {
     JFrame window;
     JTextArea textArea;

    public static void main(String[] args) {
        new GUI();

    }
    public GUI(){
        createWindow();
        createTextArea();
        window.setVisible(true);


    }
    public void createWindow(){
        window = new JFrame("NotePad");
        window.setSize(800,600);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void createTextArea(){
        textArea = new JTextArea();
        window.add(textArea);
    }


}
