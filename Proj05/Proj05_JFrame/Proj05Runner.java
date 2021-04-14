import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Proj05Runner {
  public Proj05Runner() {
    System.out.println("I certify that this program is my own work\n" +
                      "and is not the work of others. I agree not\n" +
                      "to share my solution with others.\n" +
                      "Hector Solis\n");

    GUI gui = new GUI();
  }//end Proj05Runner constructor
}//end class Proj05Runner



class GUI{
  public GUI(){
    
    JFrame displayWindow = new JFrame();
    displayWindow.setSize(300,100);
    displayWindow.setTitle("Hector Solis");

    EventHandler winProcCmd1 = new EventHandler(displayWindow);

    displayWindow.addWindowListener(winProcCmd1);

    displayWindow.setVisible(true);

  }//end constructor
}//end class GUI definition


class EventHandler extends WindowAdapter{

  JFrame displayWindowRef;

  EventHandler(JFrame windowIn){
    this.displayWindowRef = windowIn;
  }//end constructor

  public void windowIconified(WindowEvent e){
    System.out.println("Good Night");
  }//end windowIconified()

  public void windowDeiconified(WindowEvent e){
    System.out.println("Good Morning");
  }//end windowDeiconified()

  public void windowClosing(WindowEvent e){
    displayWindowRef.dispose();
  }//end windowClosing()

}//end class EventHandler