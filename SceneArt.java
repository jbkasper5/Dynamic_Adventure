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
  boolean yn = false;
  boolean lr = false;
  boolean frameMade = false;
  JFrame inventory = new JFrame("inventory");
  int numInvetoryClicks = 0;
  String newline = System.getProperty("line.separator");
  int[] numScenes = new int[10];
  int num;
  public sceneArt(){
    try{
       trophy = ImageIO.read(new File("Scenes/trophy.png"));
       cave = ImageIO.read(new File("Scenes/cave.png"));
    }catch (IOException e) {
    }
    addKeyListener(this);
    setFocusable(true);
  }
  public void paintComponent(Graphics g){
    makeFrame makeFrame = new makeFrame();
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
      num = main.randomNum();
      if (numScenes[num] == 0){
        win = true;
      }
      num = 1;
      switch(num){
        case 0:
          if (numScenes[num] != -1){
            g.drawString(winString, 140, 130);
            g.drawImage(trophy, 0, topMargin, null);
            numScenes[num] = -1;
            System.out.println("Cut " + num + " outta the index.");
            System.out.println("Ya WIn BoI");
            win = true;
          }else{
            num = main.randomNum();
          }
          break;
        case 1:
          if (numScenes[num] != -1){
            drawString(g, "YOU STUMBLE ALONG A CAVE, VERY DARK, BUT\n WITH A SLIGHT GLOW COMING OUT OF THE\n CENTER. DO YOU APPROACH THE CAVE?", 0, 0);
            yn = true;
            g.drawImage(cave, 0, topMargin, null);
            numScenes[num] = -1;
            System.out.println("Cut " + num + " outta the index.");
          }else{
            num = main.randomNum();
          }
          break;
        case 2:
          if (numScenes[num] != -1){
            g.setColor(Color.green);
            g.fillRect(110, 110, 100, 100);
            numScenes[num] = -1;
            System.out.println("Cut " + num + " outta the index.");
          }else{
            num = main.randomNum();
          }
          break;
        case 3:
          if (numScenes[num] != -1){
            g.setColor(Color.green);
            g.fillRect(115, 115, 100, 100);
            numScenes[num] = -1;
            System.out.println("Cut " + num + " outta the index.");
          }else{
            num = main.randomNum();
          }
          break;
        case 4:
          if (numScenes[num] != -1){
            g.setColor(Color.green);
            g.fillRect(120, 120, 100, 100);
            numScenes[num] = -1;
            System.out.println("Cut " + num + " outta the index.");
          }else{
            num = main.randomNum();
          }
          break;
        case 5:
          if (numScenes[num] != -1){
            g.setColor(Color.green);
            g.fillRect(125, 125, 100, 100);
            numScenes[num] = -1;
            System.out.println("Cut " + num + " outta the index.");
          }else{
            num = main.randomNum();
          }
          break;
        case 6:
          if (numScenes[num] != -1){
            g.setColor(Color.green);
            g.fillRect(130, 130, 100, 100);
            numScenes[num] = -1;
            System.out.println("Cut " + num + " outta the index.");
          }else{
            num = main.randomNum();
          }
          break;
        case 7:
          if (numScenes[num] != -1){
            g.setColor(Color.green);
            g.fillRect(135, 135, 100, 100);
            numScenes[num] = -1;
            System.out.println("Cut " + num + " outta the index.");
          }else{
            num = main.randomNum();
          }
          break;
        case 8:
          if (numScenes[num] != -1){
            g.setColor(Color.green);
            g.fillRect(140, 140, 100, 100);
            numScenes[num] = -1;
            System.out.println("Cut " + num + " outta the index.");
          }else{
            num = main.randomNum();
          }
          break;
        case 9:
          if (numScenes[num] != -1){
            g.setColor(Color.green);
            g.fillRect(145, 145, 100, 100);
            numScenes[num] = -1;
            System.out.println("Cut " + num + " outta the index.");
          }else{
            num = main.randomNum();
          }
          break;
      }
    }
    System.out.println("exited lewp" );
  }
  private void drawString(Graphics g, String text, int x, int y) {
    for (String line : text.split("\n"))
        g.drawString(line, x, y += 30);
  }
  public void keyPressed(KeyEvent e){
    int code = e.getKeyCode();
    if (yn){
      if (code == KeyEvent.VK_Y){
        System.out.println("Ya entered da cave");
      }else if (code == KeyEvent.VK_N){
        System.out.println("Ya left da cave");
      }
      yn = false;
    }else if (lr){

    }else{
      System.out.println("DIS BOI NOT A KEYEVENT");
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
  public void keyTyped(KeyEvent e){

  }
}
