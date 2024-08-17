import java.awt.*;
import java.awt.event.*;

  public class Count extends Frame implements ActionListener {
    private Label countLabel;
    private Button countButton;
    private int count = 0;

    public Count() {
        super("AWTCounter");
        setLayout(new FlowLayout());
        
        countLabel = new Label("Counter: 0");
        add(countLabel);
        
        countButton = new Button("Count");
        countButton.addActionListener(this);
        add(countButton);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        setSize(300, 200);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == countButton) {
            count++;
            countLabel.setText("Count: " + count);
        }
    }

    public static void main(String[] args) {
        new Count();
    }
}


