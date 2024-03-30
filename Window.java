import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

public class Window {
    private static JFrame frame;
    private static JPanel panel;
    private static JButton button;


    public static void main(String[] args) {
        frame = new JFrame();
        panel = new JPanel();
        button = new JButton();

        //Add button to the jpanel
        panel.add(button);

        // Set preferred size and background color for the panel
        panel.setPreferredSize(new Dimension(200, 200));
        panel.setBackground(Color.RED);

        // Set layout manager for the content pane
        frame.getContentPane().setLayout(new BorderLayout());
        
        // Set background color for the content pane of the frame
        frame.getContentPane().setBackground(Color.BLUE);

        // Add panel to frame
        frame.getContentPane().add(panel, BorderLayout.SOUTH);

        // Set frame properties
        frame.setSize(new Dimension(400, 400));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
