import java.awt.*;
import java.awt.event.*;

public class Proj06Runner {
  public Proj06Runner() {
      System.out.println("I certify that this program is my own work\n" +
                         "and is not the work of others. I agree not\n" +
                         "to share my solution with others.\n" +
                         "Hector Solis\n");

    GUI gui = new GUI();//instantiate a GUI
  }//end main
}//end class Event10
//=======================================================//

//Subclass Frame in order to override the paint method.
class MyFrame extends Frame{
  int xCoor;
  int yCoor;

  MyFrame(String name){//constructor
    setTitle("Hector Solis");
    setSize(300,100);
    //Name used to distinguish between the two objects
    setName(name);
  }//end constructor
  
  public void paint(Graphics g){
    //display coordinate information on the visual object
    g.setColor(Color.RED);
    g.drawString("x = " + xCoor + ", y = " + yCoor, xCoor, yCoor);
    
  }//end paint()
}//end class MyFrame
//=======================================================//

//The following class is used to instantiate a graphical
// user interface object.
class GUI {
  public GUI(){//constructor
    //Create two visual objects of type MyFrame and make 
    // them visible. Name them Frame1 and Frame2.
    MyFrame myFrame1 = new MyFrame("Frame1");
    myFrame1.setVisible(true); 
    
    //Instantiate and register Listener object which will
    // terminate the program when the user closes either 
    // window.
    WProc1 winProcCmd1 = new WProc1();
    myFrame1.addWindowListener(winProcCmd1);
    
    //Instantiate and register Listener object which will
    // process mouse events on either MyFrame object.
    MouseProc mouseProcCmd = new MouseProc(myFrame1);
    myFrame1.addMouseListener(mouseProcCmd);
  }//end constructor
}//end class GUI definition
//=======================================================//

//This listener class monitors for mouse presses and 
// displays the coordinates of the mouse pointer when the 
// mouse is pressed.  The listener object distinguishes 
// between two different visual objects on the basis of 
// their component names and displays the coordinate 
// information on the visual object which generated the 
// mouse event.

class MouseProc extends MouseAdapter{
  //save references to the objects here
  MyFrame refToFrame1; 
  
  MouseProc(MyFrame inFrame1){//construct
    refToFrame1 = inFrame1;//save references to the frames
  }//end constructor

  //Override the mousePressed() method to respond whenever
  // the mouse is pressed on one of the frame objects.  
  // Distinguish between the two frame objects using the 
  // component name and display the coordinates of the 
  // mouse on the correct object.
  public void mousePressed(MouseEvent e){
    if( e.getComponent().getName().compareTo("Frame1") == 0 ){
      //Get X and Y coordinates of mouse pointer
      // and store in the Frame object
      refToFrame1.xCoor = e.getX();
      refToFrame1.yCoor = e.getY();
      //display coordinate information
      refToFrame1.repaint();
    }
    }//end if-else
  }//end mousePressed()
//end class MouseProc
//=======================================================//

//The following listener is used to terminate the program
// when the user closes either frame object. Note that 
// class extends the adapter class
class WProc1 extends WindowAdapter{
  public void windowClosing(WindowEvent e){
    System.exit(0);
  }//end windowClosing()
}//end class WProc1
//=======================================================//