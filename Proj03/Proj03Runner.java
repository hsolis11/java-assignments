import java.io.Serializable;
import java.util.*;

public class Proj03Runner {

    int data;
    String str_data;

    Proj03Runner() {
        System.out.println("I certify that this program is my own work" +
                            "and is not the work of others. I agree not " +
                            "to share my solution with others. " +
                            "Hector Solis");
    }//end no arg constructor

    Proj03Runner(int data) {
        this.data = data;
    }

    Proj03Runner(String str_data){
        this.str_data = str_data;
    }

    public String toString() {
        return "" + data;
    }

}

class TheComparator implements Comparator, Serializable{

    public int compare(Object o1, Object o2){
        if(!(o1 instanceof Proj03Runner)){
            throw new ClassCastException();
        }
        if(!(o2 instanceof Proj03Runner)){
            throw new ClassCastException();
        }
        
        int result = ((String)o1).compareTo(((String)o2));
        return result;
    }

    public boolean equals(Object o){
        if(!(o instanceof TheComparator)){
            return false;
        } else {
            return true;
        }
    }
}
