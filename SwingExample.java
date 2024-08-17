import javax.swing.*;

public class SwingExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Swing Example");
        JButton button = new JButton("Click me");
        frame.add(button);
        frame.setSize(200, 100);
        frame.setVisible(true);
    }
}
