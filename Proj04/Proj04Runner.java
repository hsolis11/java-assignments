import java.util.*;
import java.io.Serializable;

class Proj04Runner {

    Collection vector = new TreeSet(new TheComparator());

    Proj04Runner(){
        System.out.println("I certify that this program is my own work\n" +
                            "and is not the work of others. I agree not\n" +
                            "to share my solution with others.\n" +
                            "Hector Solis\n");
    }

    public Object[] runA(Object[] ref){
        // process the data
        for(int i = 0; i < ref.length; i++){
            vector.add(ref[i]);
        }
        
        Object[] array = vector.toArray(); // from collection to object
        Arrays.sort(array, new TheComparator()); // sorting in custom order

        return array;

    }

    public Collection runB(){

        Collection arraylist = new ArrayList(vector);
        Comparator aComparator = Collections.reverseOrder();
        Collections.sort((List)arraylist, aComparator);

        return arraylist;

    }
}

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
    }
}