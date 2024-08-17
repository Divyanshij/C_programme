import javax.swing.*;
import java.awt.event.*;

public class HelloWorldGUI extends JFrame implements ActionListener { 
    private JLabel l;                                             
    private JButton b;  

    public HelloWorldGUI() {                         
        super("Hello World GUI");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
        setLayout(null); 

        l = new JLabel("Hello, World!");
        l.setBounds(100, 50, 100, 30); 
        add(l);
    
        b = new JButton("Click Me");
        b.setBounds(100, 100, 100, 30); 
        b.addActionListener(this);
        add(b);

        setSize(500, 600);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b) {
            JOptionPane.showMessageDialog(this, "Button Clicked!");
        }
    }

    public static void main(String[] args) {
        new HelloWorldGUI();
    }
}
