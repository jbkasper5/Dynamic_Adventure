import javax.swing.*;
import java.awt.*;
class makeFrame extends JPanel{
  public static void createFrame(JFrame frame, int width, int height){
    frame.setSize(width, height);
    frame.setResizable(false);
    frame.setVisible(true);
  }
  public void AddInventory(JFrame frame, String item, int numItems){
    JLabel label = new JLabel(item);
    frame.setLayout(null);
    label.setBounds(10, 0 + (numItems * 20), 100, 20);
    frame.add(label);
  }
}
