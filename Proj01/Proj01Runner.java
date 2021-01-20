import java.util.Collection;
import java.util.TreeSet;

public class Proj01Runner {

    int[] vals;
    Collection ref = new TreeSet<Integer>();

    public Proj01Runner(int[] vals){
        this.vals = vals;
        
        for(int i = 0; i < vals.length; i++){
            ref.add(vals[i]);
        }//end for loop

        System.out.println("I certify that this program is my own work\n" +
                            "and is not the work of others. I agree not\n" +
                            "to share my solution with others.\n" +
                            "Hector Solis\n");
    }//end Constructor

    public Collection runA(){
        return ref;
    }//end runA method

    public Collection runB(){
        return ref;
    }//end runB method
    

    
}//end Proj01Runner class
