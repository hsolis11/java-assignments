/*File Q34.java
*/
import java.awt.*;
import java.awt.event.*;

public class Q34 {
  public static void main(String[] args){
    GUI gui = new GUI();
  }//end main
}//end class Q34
//---------------------------------------------------------

class GUI extends Frame{
  int clickX;
  int clickY;

  public GUI(){//constructor
    setSize(150,150);
    setTitle("Q34");
    setVisible(true);

    addWindowListener(
      new WindowAdapter(){//anonymous class definition
        public void windowClosing(WindowEvent e){
          System.exit(0);
        }//end windowClosing
      }//end WindowAdapter
    );//end addWindowListener()

    addMouseListener(
      new MouseAdapter(){//anonymous class definition
        public void mousePressed(MouseEvent e){
          clickX = e.getX();
          clickY = e.getY();
          repaint();
        }//end mousePressed()
      }//end MouseAdapter
    );//end addMouseListener()
  }//end constructor
  //-----------------------------------------------------//

  public void paint(Graphics g){
    g.drawString(
              "" + clickX + ", " + clickY, clickX, clickY);
  }//end paint

}//end class GUI definition
//---------------------------------------------------------
