package war;

import javax.swing.*;

public class Window extends JFrame {
  
  JLabel label;
  JButton button;
  
  public Window() {
  
    label = new JLabel();
    
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLayout(null);
    this.setSize(800,600);
    
    
    this.setVisible(true);  
  }
  
}
