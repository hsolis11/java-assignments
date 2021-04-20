import java.awt.*;
import java.awt.event.*;

public class Proj06Runner {
  public Proj06Runner() {
      System.out.println("I certify that this program is my own work\n" +
                         "and is not the work of others. I agree not\n" +
                         "to share my solution with others.\n" +
                         "Hector Solis\n");

    GUI gui = new GUI();
  }//end Proj06Runner constructor
}//end class Proj06Runner


class MyFrame extends Frame{
  int xCoor;
  int yCoor;

  MyFrame(String name){
    setTitle("Hector Solis");
    setSize(300,100);
    
    setName(name);
  }//end MyFrame constructor
  
  public void paint(Graphics g){
    g.setColor(Color.RED);
    g.drawString("x = " + xCoor + ", y = " + yCoor, xCoor, yCoor);
    
  }//end paint()
}//end class MyFrame


class GUI {
  public GUI(){
    MyFrame myFrame1 = new MyFrame("Frame1");
    myFrame1.setVisible(true); 
    
    WProc1 winProcCmd1 = new WProc1();
    myFrame1.addWindowListener(winProcCmd1);
    
    MouseProc mouseProcCmd = new MouseProc(myFrame1);
    myFrame1.addMouseListener(mouseProcCmd);
  }//end GUI constructor
}//end class GUI


class MouseProc extends MouseAdapter{
  MyFrame refToFrame1; 
  
  MouseProc(MyFrame inFrame1){
    refToFrame1 = inFrame1;
  }//end constructor

  public void mousePressed(MouseEvent e){
    if( e.getComponent().getName().compareTo("Frame1") == 0 ){
      refToFrame1.xCoor = e.getX();
      refToFrame1.yCoor = e.getY();
      
      refToFrame1.repaint();
    }
    }//end if-else
  }//end mousePressed()

class WProc1 extends WindowAdapter{
  public void windowClosing(WindowEvent e){
    System.exit(0);
  }//end windowClosing()
}//end class WProc1
//=======================================================//