import java.awt.*;
import javax.swing.*;
import java.lang.Math.*;
import java.util.Arrays;
import javax.imageio.*;
import java.io.*;
import java.awt.image.*;
import java.awt.event.*;

public class main extends JPanel{

  public static void main(String[] args){
    JFrame.setDefaultLookAndFeelDecorated(true);
    JFrame frame = new JFrame("Scenes");
    frame.setSize(700, 722);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    sceneArt scene = new sceneArt();
    frame.add(scene);
    frame.setResizable(false);
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);
  }

  public int randomNum(){
    return (int) (Math.random() * 5);
  }
}
