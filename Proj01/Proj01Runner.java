import java.util.*;

public class Proj01Runner {

    Collection inVals = new ArrayList();


    public Proj01Runner(int[] intList) {
        for(int i = 0; i < intList.length; i++) {
            inVals.add(intList[i]);
        }//end for loop
        
        System.out.println("I certify that this program is my own work\n" +
                            "and is not the work of others. I agree not\n" +
                            "to share my solution with others.\n" +
                            "Hector Solis\n");
    }//end Constructor

    public Collection runA(){
        
        return inVals;
    }//end runA method

    public Collection runB(){
        Collection collectionB = new TreeSet(inVals);
        
        return collectionB;
    }//end runB method
    
    
}//end Proj01Runner class
