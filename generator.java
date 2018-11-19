import java.awt.*;
import javax.swing.*;
class generator extends JPanel{
  public void makeMessage(String message){
    JOptionPane.showMessageDialog(null, message, "", JOptionPane.PLAIN_MESSAGE);
  }
}
