//File Comparable04.java

import java.util.*;

public class Comparable04{
  public static void main(String args[]){
    new Worker().doIt();
  }//end main()
}//end class Comparable04

class Worker{
  public void doIt(){
    Iterator iter;
    Collection ref;

    ref = new TreeSet();
    Populator.fillIt(ref);
    iter = ref.iterator();
    while(iter.hasNext()){
      System.out.print(iter.next());
    }//end while loop
    System.out.println();

  }//end doIt()
}// end class Worker

class Populator{
  public static void fillIt(Collection ref){
    ref.add(new MyClass(4));
    ref.add(new MyClass(4));
    ref.add(new MyClass(3));
    ref.add(new MyClass(2));
    ref.add(new MyClass(1));
  }//end fillIt()
}//end class Populator

class MyClass{
  int data;

  MyClass(){
    data = 0;
  }//end noarg constructor

  MyClass(int data){
    this.data = data;
  }//end parameterized constructor

  public String toString(){
    return "" + data;
  }//end overridden toString()

}//end MyClass