/* File Proj02Runner
This skeleton code will compile but it won't run
because there is some missing code.
*****************************************************/
import java.util.TreeSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

class Proj02Runner{

  int data = 0;

  Proj02Runner(){//overloaded constructor
    //The purpose of this constructor is to display
    // the certification.
    System.out.println(
      "I certify that this program is my own work \n"+
      "and is not the work of others. I agree not \n" +
      "to share my solution with others.\n" +
      "Hector Solis\n");
  }//end overloaded constructor
  
  Proj02Runner(int data){//overloaded constructor
    //The purpose of this constructor is to store
    // the incoming data value
    this.data = data;
  }//end overloaded constructor

  public String toString(){
    return "" + data;
  }

}//end class Proj02Runner

