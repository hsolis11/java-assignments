/*File Q17.java
**********************************************************/

import java.awt.*;
import java.awt.event.*;

public class Q17 {
  public static void main(String[] args){
    GUI gui = new GUI();//instantiate a GUInterface object
  }//end main
}//end class Q17
//=======================================================//

class GUI{
  public GUI(){//constructor
    //Create a new Frame object
    Frame displayWindow = new Frame();
    displayWindow.setSize(300,200);
    displayWindow.setTitle("Copyright 1997, R.G.Baldwin");

    WProc2 winProcCmd2 = new WProc2();
    displayWindow.addWindowListener(winProcCmd2);

    displayWindow.setVisible(true);

  }//end constructor
}//end class GUI definition
//=======================================================//

class WProc2 extends WindowAdapter{

  public void windowIconified(WindowEvent e){
    System.out.println(
              "******** WProc2 windowIconified test msg");
  }//end windowIconified()

  public void windowDeiconified(WindowEvent e){
    System.out.println(
            "******** WProc2 windowDeiconified test msg");
  }//end windowDeiconified()

}//end class WProc2
//=======================================================//