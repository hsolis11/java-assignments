import java.io.Serializable;
import java.util.*;

public class Proj03Runner implements Comparator, Serializable{

    String data;

    Proj03Runner() {
        System.out.println("I certify that this program is my own work\n" +
                            "and is not the work of others. I agree not\n" +
                            "to share my solution with others.\n" +
                            "Hector Solis\n");
    }//end no arg constructor

    Proj03Runner(String data){
        this.data = data;
    }

    public String toString(){
        return "" + data;
    }

    public int compare(Object o1, Object o2){
        if(!(o1 instanceof String)){
            throw new ClassCastException();
        }
        if(!(o2 instanceof String)){
            throw new ClassCastException();
        }

        if(!(o1 instanceof String)){
            throw new ClassCastException();
        }
        if(!(o2 instanceof String)){
            throw new ClassCastException();
        }

        int result = ((String)o1).toUpperCase().compareTo(((String)o2).toUpperCase());
        return result*(-1);
    }

    public boolean equals(Object o){
        if(!(o instanceof Proj03Runner)){
            return false;
        } else {
            return true;
        }
    }

}

