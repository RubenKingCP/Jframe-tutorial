import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.Document;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window {
    private static JFrame frame;
    private static JPanel panel1;
    private static JPanel panel2;
    private static JButton button;
    private static JTextField textField;
    private static JLabel jlabel;

    public static void main(String[] args) {
        frame = new JFrame();
        panel1 = new JPanel();
        panel2 = new JPanel();
        button = new JButton();
        textField = new JTextField();
        jlabel = new JLabel();


        //Adding an action listner to the button
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(panel1, textField.getText());
            }
        });

        //Add a document listener to the textfield
        textField.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e){
                jlabel.setText(textField.getText());
            }

            @Override
            public void removeUpdate(DocumentEvent e){
                jlabel.setText(textField.getText());
            }

            @Override
            public void changedUpdate(DocumentEvent e){
                jlabel.setText(textField.getText());
            }
        });
        
        //CUstomize textfield
        textField.setPreferredSize(new Dimension(200, 50));

        //Customize jlabel
        jlabel.setPreferredSize(new Dimension(400, 20));

        //Add button to the jpanel1
        panel1.add(button);

        //Add textfield to panel2
        panel2.add(textField);

        //Add jlabel to panel2
        panel2.add(jlabel);

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
        frame.setTitle("Simple Jframe");
        frame.setSize(new Dimension(400, 400));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
