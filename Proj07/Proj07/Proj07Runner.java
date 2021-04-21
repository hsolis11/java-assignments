import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Proj07Runner {
  public Proj07Runner(){
    System.out.println("I certify that this program is my own work\n" +
                        "and is not the work of others. I agree not\n" +
                        "to share my solution with others.\n" +
                        "Hector Solis\n");
    GUI gui = new GUI();
  }//end Proj07Runner constructor
}//end class Proj07Runner


class MyPanel extends JPanel{
  int clickX;
  int clickY;

  public void paint(Graphics g){
    super.paint(g);
    g.drawString(clickX + ", " + clickY, clickX, clickY);
  }//end paint()
}// end MyPanel class


class GUI{
  public GUI(){

    JFrame displayWindow = new JFrame();
    displayWindow.setSize(300,100);
    displayWindow.setTitle("Hector Solis");
    displayWindow.setLayout(new BorderLayout());
    
    MyPanel panel = new MyPanel();
    displayWindow.add(panel, BorderLayout.CENTER);

    displayWindow.setVisible(true);
    displayWindow.addWindowListener(new WProc1());
    panel.addMouseListener(new MouseProc(panel));
    
  }//end constructor
}//end class GUI definition


class MouseProc extends MouseAdapter{
    MyPanel refToPanel;

  MouseProc(MyPanel inPanel){
      refToPanel = inPanel;
  }// MouseProc constructor

  public void mousePressed(MouseEvent e){

    refToPanel.clickX = e.getX();
    refToPanel.clickY = e.getY();

    refToPanel.repaint();
  }//end mousePressed()
}//end class MouseProc


class WProc1 extends WindowAdapter{
  public void windowClosing(WindowEvent e){
    System.exit(0);
  }//end windowClosing()
}//end class WProc1
