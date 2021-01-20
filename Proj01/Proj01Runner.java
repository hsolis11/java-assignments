import java.util.Collection;
import java.util.TreeSet;

public class Proj01Runner {

    int[] vals;
    Collection ref = new TreeSet<Integer>();

    public Proj01Runner(int[] vals){
        this.vals = vals;
        for(int i = 0; i < vals.length; i++){
            ref.add(vals[i]);
        }

        System.out.println("I certify that this program is my own work\n" +
                            "and is not the work of others. I agree not\n" +
                            "to share my solution with others.\n" +
                            "Hector Solis\n");
    }

    public Collection runA(){
        return ref;
    }

    public Collection runB(){
        return ref;
    }
    

    
}
