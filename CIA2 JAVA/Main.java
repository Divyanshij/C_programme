import java.awt.*;    
public class Main{    
public static void main (String[] args) {  
 
    // create instance of frame with the label  
    Frame f = new Frame("Button Example");    
 
    // create instance of button with label  
    Button b = new Button("Click Here");  
    //Label l=new Label("hello all");
 
    // set the position for the button in frame  
    b.setBounds(50,100,80,30);
   // l.setBounds(60,110,90,40);  
 
    // add button to the frame  
    f.add(b);    
   // f.add(l);
    // set size, layout and visibility of frame  
    f.setSize(400,400);    
    f.setLayout(null); 
    f.setVisible(true);    
}    
}
