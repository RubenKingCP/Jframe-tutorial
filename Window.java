import javax.swing.JFrame;

import java.awt.Color;
import java.awt.Dimension;


public class Window {
    private static JFrame frame;
    public static void main(String[] args) {
        frame = new JFrame();
        frame.setSize(new Dimension(400, 400));
        frame.getContentPane().setBackground(Color.BLUE);
        frame.setVisible(true);
    }
}
