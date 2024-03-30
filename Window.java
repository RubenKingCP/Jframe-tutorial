import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window {
    private static JFrame frame;
    private static JPanel panel1;
    private static JPanel panel2;
    private static JButton button;
    private static TextField textField;

    public static void main(String[] args) {
        frame = new JFrame();
        panel1 = new JPanel();
        panel2 = new JPanel();
        button = new JButton();
        textField = new TextField();

        //Adding an action listner to the button
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(panel1, textField.getText());
            }
        });
        
        //CUstomize textfield
        textField.setPreferredSize(new Dimension(200, 50));

        //Add button to the jpanel1
        panel1.add(button);

        //Add textfield to panel2
        panel2.add(textField);

        // Set preferred size and background color for the panels
        panel1.setPreferredSize(new Dimension(200, 200));
        panel1.setBackground(Color.RED);

        panel2.setPreferredSize(new Dimension(200, 200));
        panel2.setBackground(Color.PINK);

        // Set layout manager for the content pane
        frame.getContentPane().setLayout(new BorderLayout());
        
        // Set background color for the content pane of the frame
        frame.getContentPane().setBackground(Color.BLUE);

        // Add panels to frame
        frame.getContentPane().add(panel1, BorderLayout.SOUTH);
        frame.getContentPane().add(panel2, BorderLayout.NORTH);

        // Set frame properties
        frame.setSize(new Dimension(400, 400));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
