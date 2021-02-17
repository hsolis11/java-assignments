//File Comparable05.java
import java.util.*;

public class Comparable05{
  public static void main(String args[]){
    new Worker().doIt();
  }//end main()
}//end class Comparable05

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

class MyClass implements Comparable{
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

  public int compareTo(Object o){
    if(!(o instanceof MyClass))
        throw new ClassCastException();
    if(((MyClass)o).data < data)
      return 1;
    if(((MyClass)o).data > data)
      return -1;
    else return 0;
  }//end compareTo()

  public boolean equals(Object o){
    if(!(o instanceof MyClass))
        return false;
    if(((MyClass)o).data == data)
      return true;
    else return false;
  }//end overridden equals()
}//end MyClass