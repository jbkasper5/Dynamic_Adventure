import java.awt.*;
import javax.swing.*;
import java.lang.Math.*;
import java.util.Arrays;
import javax.imageio.*;
import java.io.*;
import java.awt.image.*;
import java.awt.event.*;

class sceneArt extends JPanel implements KeyListener{
  BufferedImage trophy;
  BufferedImage cave;
  BufferedImage forest;
  ImageIcon textbox = new ImageIcon("Scenes/textbox.png");
  JLabel img = new JLabel("", textbox, JLabel.CENTER);
  makeFrame makeFrame = new makeFrame();
  generator generate = new generator();
  boolean yn = false;
  boolean lr = false;
  JFrame inventory = new JFrame("inventory");
  int numInvetoryClicks = 0;
  String newline = System.getProperty("line.separator");
  int[] numScenes = new int[10];
  int num;
  int numItems = 0;
  public sceneArt(){
    try{
       trophy = ImageIO.read(new File("Scenes/trophy.png"));
       cave = ImageIO.read(new File("Scenes/cave.png"));
       forest = ImageIO.read(new File("Scenes/spookyForest.png"));

    }catch (IOException e) {
    }
    addKeyListener(this);
    setFocusable(true);
    add(img);
  }
  public void paintComponent(Graphics g){
    img.setBounds(0, 0, 700, 100);
    int topMargin = 100;
    int x = 0;
    int y = 0;
    String winString = "YOU WIN";
    g.setFont(new Font("Trattatello", Font.PLAIN, 30));
    main main = new main();
    Color brown = new Color(153, 102, 0);
    Color gold = new Color(230, 184, 0);
    for (int i = 0; i < numScenes.length; i++){
      numScenes[i] = i;
    }
    boolean win = false;
    super.paintComponent(g);
    Graphics2D g2 = (Graphics2D) g;
    if (win == false){
    //num = main.randomNum();
      if (numScenes[num] == 0){
        win = true;
      }
      num = main.randomNum();
      System.out.println(num);
      switch(num){
        case 0:
          if (numScenes[num] != -1){
            g.drawImage(trophy, 0, topMargin, null);
            numScenes[num] = -1;
            win = true;
          }else{
            num = main.randomNum();
          }
          break;
        case 1:
          if (numScenes[num] != -1){
            yn = true;
            g.drawImage(cave, 0, topMargin, null);
            numScenes[num] = -1;
          }else{
            num = main.randomNum();
          }
          break;
        case 2:
          if (numScenes[num] != -1){
            lr = true;
            g.drawImage(forest, 0, topMargin, null);
            numScenes[num] = -1;
          }else{
            num = main.randomNum();
          }
          break;
        case 3:
          if (numScenes[num] != -1){
            numScenes[num] = -1;
          }else{
            num = main.randomNum();
          }
          break;
        case 4:
          if (numScenes[num] != -1){
            numScenes[num] = -1;
          }else{
            num = main.randomNum();
          }
          break;
        case 5:
          if (numScenes[num] != -1){
            numScenes[num] = -1;
          }else{
            num = main.randomNum();
          }
          break;
        case 6:
          if (numScenes[num] != -1){
            numScenes[num] = -1;
          }else{
            num = main.randomNum();
          }
          break;
        case 7:
          if (numScenes[num] != -1){
            numScenes[num] = -1;
          }else{
            num = main.randomNum();
          }
          break;
        case 8:
          if (numScenes[num] != -1){
            numScenes[num] = -1;
          }else{
            num = main.randomNum();
          }
          break;
        case 9:
          if (numScenes[num] != -1){
            numScenes[num] = -1;
          }else{
            num = main.randomNum();
          }
          break;
      }
    }
  }
  private void drawString(Graphics g, String text, int x, int y) {
    for (String line : text.split("\n"))
        g.drawString(line, x, y += 30);
  }
  public void keyPressed(KeyEvent e){
    int code = e.getKeyCode();
    System.out.println(yn);
    if (yn){
      if (code == KeyEvent.VK_Y){
        generate.makeMessage("You entered the cave...");
        generate.makeMessage("You found a torch! Check your inventory!");
        makeFrame.AddInventory(inventory, "torch", numItems);
        numItems += 1;
        yn = false;
      }else if (code == KeyEvent.VK_N){
        generate.makeMessage("You left the cave...");
        yn = false;
      }
    }else if (lr){

    }
    if (code == KeyEvent.VK_I){
      if (numInvetoryClicks == 0){
        makeFrame.createFrame(inventory, 280, 722);
      }else if (numInvetoryClicks > 0 && numInvetoryClicks % 2 == 0){
        inventory.setVisible(true);
      }else if(numInvetoryClicks > 0 && numInvetoryClicks % 2 == 1){
        inventory.setVisible(false);
      }
      numInvetoryClicks += 1;
    }
  }
  public void keyReleased(KeyEvent e){}
  public void keyTyped(KeyEvent e){}
}
