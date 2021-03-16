import java.util.*;
import java.io.Serializable;

class Proj04Runner {

    Collection treeset = new TreeSet(new TheComparator());

    Proj04Runner(){
        System.out.println("I certify that this program is my own work\n" +
                            "and is not the work of others. I agree not\n" +
                            "to share my solution with others.\n" +
                            "Hector Solis\n");
    }//end constructor

    public Object[] runA(Object[] ref){
        // insert data into treeset
        for(int i = 0; i < ref.length; i++){
            treeset.add(ref[i]);
        }
        
        Object[] array = treeset.toArray();
        Arrays.sort(array, new TheComparator());

        return array;

    }// end runA

    public Collection runB(){

        Collection arraylist = new ArrayList(treeset);
        Comparator aComparator = Collections.reverseOrder();
        Collections.sort((List)arraylist, aComparator);

        return arraylist;
    }// end runB
}//end Proj04Runner class

class TheComparator implements Comparator, Serializable{

    public int compare(Object o1, Object o2){
        if(!(o1 instanceof String)){
            throw new ClassCastException();
        }
        if(!(o2 instanceof String)){
            throw new ClassCastException();
        }

        int result = ((String)o1).toUpperCase().compareTo(((String)o2).toUpperCase());
        return result;
    }//end compare
}//end TheComparator class