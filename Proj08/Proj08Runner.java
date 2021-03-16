/*File Proj08Runner.java Copyright 2002 R.G.Baldwin

When you move your mouse pointer around inside the client
area of the frame, without pressing either mouse button, 
the coordinates of the mouse pointer appear directly above 
the pointer. In this case, the coordinates are displayed 
using black characters.

When you move your mouse pointer around inside the client 
area of the frame, while pressing either mouse button, 
the coordinates of the mouse pointer appear directly above 
the pointer. In this case, the coordinates are displayed 
using red characters.

When you click X-button in the upper right corner of the 
frame, the program terminates and control is returned to 
the operating system. 
**********************************************************/
import java.awt.*;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class Proj08Runner extends Frame{
  private int xCoor;
  private int yCoor;
  private Proj08Runner thisFrame;

  public Proj08Runner(){//constructor
    this.setTitle("Display your name here");
    this.setSize(300,100);
   
    this.setVisible(true);
    thisFrame = this;

    this.addWindowListener(new EventHandler01());
    this.addMouseMotionListener(new EventHandler02());


    System.out.println(
      "I certify that this program is my own work");
    System.out.println(
      "and is not the work of others. I agree not");
    System.out.println("to share my solution with others.");
    System.out.println("Print your name here.");
    System.out.println();
  }//end constructor
  //----------------------------------------------------//

  public void paint(Graphics g){
    //This paint method applies to the Frame
    //display coordinate information on the Frame
    g.drawString("" + xCoor + ", " + yCoor, xCoor, yCoor);
  }//end paint()

//=======================================================//

//Begin definitions of three inner classes.

//=======================================================//

//This listener class monitors for mouseDragged events and
// displays the coordinates of the mouse pointer when the
// mouse is moved or dragged inside the client area of the
// Frame.
//This is an inner class.
private class EventHandler02 extends MouseMotionAdapter{

  public void mouseDragged(MouseEvent e){
    //Get X and Y coordinates of mouse pointer and store
    // in instance variables of the Frame class,

    thisFrame.setForeground(Color.RED);

    xCoor = e.getX();
    yCoor = e.getY();
    
    //Force a repaint to display the coordinate information
    thisFrame.repaint();

  }//end mouseDragged()
  //----------------------------------------------------//

  public void mouseMoved(MouseEvent e){
    //Get X and Y coordinates of mouse pointer and store
    // in instance variables of the Frame class
    thisFrame.setForeground(Color.BLACK);

    xCoor = e.getX();
    yCoor = e.getY();
    //Force a repaint to display the coordinate information
    
    thisFrame.repaint();

  }//end mouseDragged()

}//end inner class EventHandler02
//=========================================================

//The following listener is used to terminate the program
// when the user closes the Frame object.
//This is an inner class.
private class EventHandler01 extends WindowAdapter{
  public void windowClosing(WindowEvent e){
    System.exit(0);
  }//end windowClosing()
}//end inner class EventHandler01
//=======================================================//
//End definitions of three inner classes.
//=======================================================//
}//end class Proj08Runner
//=======================================================//