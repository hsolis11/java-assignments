import java.awt.*;
import java.awt.event.*;

public class Proj05Runner {
  public Proj05Runner(){
    GUI gui = new GUI();

    System.out.println("I certify that this program is my own work\n" +
                        "and is not the work of others. I agree not\n" +
                        "to share my solution with others.\n" +
                        "Hector Solis\n");
                        
  }//end main
}//end class Event08

class GUI{
  public GUI(){
    
    Frame displayWindow = new Frame();
    displayWindow.setSize(300,100);
    displayWindow.setTitle("Hector Solis");

    EventHandler winProcCmd1 = new EventHandler(displayWindow);

    displayWindow.addWindowListener(winProcCmd1);

    displayWindow.setVisible(true);

  }//end constructor
}//end class GUI definition

class EventHandler extends WindowAdapter{
  
  Frame displayWindowRef;

  EventHandler(Frame windowIn){
    
    this.displayWindowRef = windowIn;
  }//end constructor


  public void windowIconified(WindowEvent e){
    System.out.println("Good Night");
  }//end windowIconified()


  public void windowClosing(WindowEvent e){
    displayWindowRef.dispose();
  }//end windowClosing()


  public void windowDeiconified(WindowEvent e){
    System.out.println(
                      "Good Morning");

  }//end windowDeiconified()
}//end class EventHandler
